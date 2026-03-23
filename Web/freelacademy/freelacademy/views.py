from django.shortcuts import render, redirect, get_object_or_404
from django.contrib.auth import authenticate, login, logout
from django.contrib import messages
from django.contrib.auth.decorators import login_required
from .models import Projeto, Usuario, Proposta, Notificacao
from .forms import ProjetoForm, PropostaForm
from django.db import IntegrityError

# --- INJETOR GLOBAL DE NOTIFICAÇÕES ---
def injetar_notificacoes(request):
    if request.user.is_authenticated:
        nao_lidas = Notificacao.objects.filter(usuario=request.user, lida=False).count()
        recentes = Notificacao.objects.filter(usuario=request.user).order_by('-data_criacao')[:5]
        return {'qtd_notificacoes': nao_lidas, 'recentes': recentes}
    return {'qtd_notificacoes': 0, 'recentes': None}

# --- PÁGINAS PÚBLICAS E AUTENTICAÇÃO ---
def index(request): 
    return render(request, 'index.html')

def cadastro(request):
    if request.method == 'POST':
        perfil = request.POST.get('perfil')
        nome = request.POST.get('nomeCompleto')
        email = request.POST.get('email')
        cpf = request.POST.get('cpf_cnpj')
        telefone = request.POST.get('telefone')
        senha = request.POST.get('senha')
        senha_confirma = request.POST.get('senha_confirma')

        if senha != senha_confirma:
            messages.error(request, "As senhas não coincidem.")
            return redirect('cadastro')

        if Usuario.objects.filter(email=email).exists():
            messages.error(request, "Este e-mail já está em uso.")
            return redirect('cadastro')

        if Usuario.objects.filter(cpf_cnpj=cpf).exists():
            messages.error(request, "Este CPF/CNPJ já está cadastrado.")
            return redirect('cadastro')

        try:
            user = Usuario.objects.create_user(username=email, email=email, password=senha, first_name=nome)
            user.tipo = perfil
            user.cpf_cnpj = cpf
            user.telefone = telefone
            user.save()
            messages.success(request, "Cadastro realizado com sucesso! Faça seu login.")
            return redirect('login')
        except IntegrityError:
            messages.error(request, "Erro de banco: CPF ou E-mail já existem.")
            return redirect('cadastro')

    return render(request, 'cadastro.html')

def login_view(request):
    if request.method == 'POST':
        email = request.POST.get('email')
        senha = request.POST.get('senha')
        tipo_acesso = request.POST.get('tipoAcesso')
        
        user = authenticate(request, username=email, password=senha)
        
        if user is not None and user.tipo == tipo_acesso:
            login(request, user)
            return redirect('cliente_home' if user.tipo == 'cliente' else 'freelancer_home')
        else:
            messages.error(request, "E-mail, senha ou perfil de acesso inválidos.")
            
    return render(request, 'login.html')

def logout_view(request):
    logout(request)
    return redirect('login')

# PÁGINAS ESTÁTICAS
def recuperar_senha(request): return render(request, 'recuperar-senha.html')
def planos(request): return render(request, 'planos.html')
def projetos(request): return render(request, 'projetos.html')
def freelancers(request): return render(request, 'freelancers.html')
def contato(request): return render(request, 'contato.html')
def faq(request): return render(request, 'faq.html')
def privacidade(request): return render(request, 'privacidade.html')
def regras(request): return render(request, 'regras.html')
def termos(request): return render(request, 'termos.html')

# --- PAINEL DO CLIENTE ---
@login_required(login_url='login')
def cliente_home(request):
    projetos = Projeto.objects.filter(cliente=request.user).order_by('-data_criacao')
    
    projetos_ativos = projetos.filter(status__in=['aberto', 'em_andamento']).count()
    projetos_concluidos = projetos.filter(status='concluido').count()
    total_propostas = sum(p.propostas.count() for p in projetos)
    em_custodia = sum(p.orcamento for p in projetos.filter(status='em_andamento')) if projetos.filter(status='em_andamento') else 0
    
    context = {
        'projetos': projetos,
        'projetos_ativos': projetos_ativos,
        'projetos_concluidos': projetos_concluidos,
        'total_propostas': total_propostas,
        'em_custodia': em_custodia
    }
    return render(request, 'cliente-home.html', context)

@login_required(login_url='login')
def criar_projeto(request):
    if request.method == 'POST':
        form = ProjetoForm(request.POST)
        if form.is_valid():
            projeto = form.save(commit=False)
            projeto.cliente = request.user
            projeto.save()
            return redirect('cliente_home')
    return render(request, 'cliente-novo-projeto.html', {'form': ProjetoForm()})

@login_required(login_url='login')
def deletar_projeto(request, pk):
    get_object_or_404(Projeto, pk=pk, cliente=request.user).delete()
    return redirect('cliente_home')

@login_required(login_url='login')
def cliente_configuracoes(request):
    if request.method == 'POST':
        u = request.user
        campos_para_atualizar = []
        if 'descricao' in request.POST:
            u.descricao = request.POST.get('descricao')
            campos_para_atualizar.append('descricao')
        if 'foto_perfil' in request.FILES: 
            u.foto_perfil = request.FILES['foto_perfil']
            campos_para_atualizar.append('foto_perfil')
        if campos_para_atualizar:
            u.save(update_fields=campos_para_atualizar)
            messages.success(request, "Perfil atualizado!")
        return redirect('cliente_configuracoes')
    return render(request, 'cliente-configuracoes.html')

@login_required(login_url='login')
def cliente_buscar_freelancers(request):
    freelancers = Usuario.objects.filter(tipo='freelancer')
    return render(request, 'cliente-buscar-freelancers.html', {'freelancers': freelancers})

@login_required(login_url='login')
def cliente_chat(request): return render(request, 'cliente-chat.html')

@login_required(login_url='login')
def cliente_detalhes_projeto(request):
    projetos = Projeto.objects.filter(cliente=request.user).order_by('-data_criacao')
    return render(request, 'cliente-detalhes-projeto.html', {'projetos': projetos})

@login_required(login_url='login')
def cliente_financeiro(request): return render(request, 'cliente-financeiro.html')

# --- PAINEL DO FREELANCER ---
@login_required(login_url='login')
def freelancer_home(request): 
    propostas_enviadas = Proposta.objects.filter(freelancer=request.user).count()
    return render(request, 'freelancer-home.html', {'propostas_enviadas': propostas_enviadas})

@login_required(login_url='login')
def freelancer_buscar_projetos(request):
    projs = Projeto.objects.filter(status='aberto').order_by('-data_criacao')
    return render(request, 'freelancer-buscar-projetos.html', {'projetos': projs})

@login_required(login_url='login')
def freelancer_configuracoes(request):
    if request.method == 'POST':
        u = request.user
        campos = []
        if 'descricao' in request.POST: 
            u.descricao = request.POST.get('descricao')
            campos.append('descricao')
        if 'foto_perfil' in request.FILES: 
            u.foto_perfil = request.FILES['foto_perfil']
            campos.append('foto_perfil')
        if campos:
            u.save(update_fields=campos)
            messages.success(request, "Perfil profissional atualizado!")
        return redirect('freelancer_configuracoes')
    return render(request, 'freelancer-configuracoes.html')

@login_required(login_url='login')
def freelancer_baixar_app(request): return render(request, 'freelancer-baixar-app.html')
@login_required(login_url='login')
def freelancer_carteira(request): return render(request, 'freelancer-carteira.html')
@login_required(login_url='login')
def freelancer_chat(request): return render(request, 'freelancer-chat.html')
@login_required(login_url='login')
def freelancer_detalhes_projeto(request): return render(request, 'freelancer-detalhes-projeto.html')
@login_required(login_url='login')
def freelancer_portfolio(request): return render(request, 'freelancer-portfolio.html')

# --- NOVAS FUNÇÕES: PROPOSTAS E NOTIFICAÇÕES ---
@login_required(login_url='login')
def enviar_proposta(request, projeto_id):
    projeto = get_object_or_404(Projeto, pk=projeto_id)
    if request.method == 'POST':
        form = PropostaForm(request.POST)
        if form.is_valid():
            proposta = form.save(commit=False)
            proposta.projeto = projeto
            proposta.freelancer = request.user
            proposta.save()
            Notificacao.objects.create(
                usuario=projeto.cliente,
                mensagem=f"Você recebeu uma proposta de {request.user.first_name} para o projeto '{projeto.titulo}'!",
                link='/cliente/detalhes-projeto/'
            )
            return redirect('freelancer_home')
    return render(request, 'freelancer-enviar-proposta.html', {'form': PropostaForm(), 'projeto': projeto})

@login_required(login_url='login')
def ler_notificacoes(request):
    Notificacao.objects.filter(usuario=request.user, lida=False).update(lida=True)
    return redirect('cliente_home' if request.user.tipo == 'cliente' else 'freelancer_home')

@login_required(login_url='login')
def aceitar_proposta(request, proposta_id):
    proposta = get_object_or_404(Proposta, pk=proposta_id)
    if proposta.projeto.cliente != request.user:
        return redirect('cliente_home')
    proposta.status = 'aceite'
    proposta.save(update_fields=['status'])
    proposta.projeto.status = 'em_andamento'
    proposta.projeto.save(update_fields=['status'])
    Notificacao.objects.create(
        usuario=proposta.freelancer,
        mensagem=f"Parabéns! Sua proposta para '{proposta.projeto.titulo}' foi aceita!",
        link='/freelancer/detalhes-projeto/'
    )
    messages.success(request, "Proposta aceita com sucesso!")
    return redirect('cliente_detalhes_projeto')