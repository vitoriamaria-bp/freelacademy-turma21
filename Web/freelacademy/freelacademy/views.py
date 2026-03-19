from django.shortcuts import render, redirect, get_object_or_404
from django.contrib.auth import authenticate, login, logout
from django.contrib import messages
from django.contrib.auth.decorators import login_required
from .models import Projeto, Usuario, Proposta
from .forms import ProjetoForm

# --- PÁGINAS PÚBLICAS E AUTENTICAÇÃO ---
def index(request): return render(request, 'index.html')

def cadastro(request):
    if request.method == 'POST':
        tipo = request.POST.get('perfil')
        nome = request.POST.get('nomeCompleto')
        email = request.POST.get('email')
        senha = request.POST.get('senha')
        cpf = request.POST.get('cpf_cnpj')
        telefone = request.POST.get('telefone')
        if Usuario.objects.filter(email=email).exists():
            messages.error(request, "E-mail já em uso.")
            return redirect('cadastro')
        user = Usuario.objects.create_user(username=email, email=email, password=senha, first_name=nome)
        user.tipo = tipo; user.cpf_cnpj = cpf; user.telefone = telefone
        user.save()
        return redirect('login')
    return render(request, 'cadastro.html')

def login_view(request):
    if request.method == 'POST':
        email = request.POST.get('email'); senha = request.POST.get('senha')
        tipo_acesso = request.POST.get('tipoAcesso')
        user = authenticate(request, username=email, password=senha)
        if user and user.tipo == tipo_acesso:
            login(request, user)
            return redirect('cliente_home' if user.tipo == 'cliente' else 'freelancer_home')
        messages.error(request, "E-mail ou senha inválidos.")
    return render(request, 'login.html')

def logout_view(request):
    logout(request)
    return redirect('login')

# PÁGINAS ESTÁTICAS (Obrigatórias para o urls.py)
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
    return render(request, 'cliente-home.html', {'projetos': projetos})

@login_required(login_url='login')
def criar_projeto(request):
    if request.method == 'POST':
        form = ProjetoForm(request.POST)
        if form.is_valid():
            projeto = form.save(commit=False); projeto.cliente = request.user; projeto.save()
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
        u.descricao = request.POST.get('descricao'); u.telefone = request.POST.get('telefone')
        u.cidade = request.POST.get('cidade'); u.estado = request.POST.get('estado')
        if 'foto_perfil' in request.FILES: u.foto_perfil = request.FILES['foto_perfil']
        u.save(); messages.success(request, "Perfil atualizado!")
        return redirect('cliente_configuracoes')
    return render(request, 'cliente-configuracoes.html')

@login_required(login_url='login')
def cliente_buscar_freelancers(request): return render(request, 'cliente-buscar-freelancers.html')
@login_required(login_url='login')
def cliente_chat(request): return render(request, 'cliente-chat.html')
@login_required(login_url='login')
def cliente_detalhes_projeto(request): return render(request, 'cliente-detalhes-projeto.html')
@login_required(login_url='login')
def cliente_financeiro(request): return render(request, 'cliente-financeiro.html')

# --- PAINEL DO FREELANCER ---
@login_required(login_url='login')
def freelancer_home(request): return render(request, 'freelancer-home.html')

@login_required(login_url='login')
def freelancer_buscar_projetos(request):
    projs = Projeto.objects.all().order_by('-data_criacao')
    return render(request, 'freelancer-buscar-projetos.html', {'projetos': projs})

@login_required(login_url='login')
def freelancer_configuracoes(request):
    if request.method == 'POST':
        u = request.user
        u.descricao = request.POST.get('descricao'); u.telefone = request.POST.get('telefone')
        u.cidade = request.POST.get('cidade'); u.estado = request.POST.get('estado')
        if 'foto_perfil' in request.FILES: u.foto_perfil = request.FILES['foto_perfil']
        u.save(); messages.success(request, "Perfil profissional atualizado!")
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