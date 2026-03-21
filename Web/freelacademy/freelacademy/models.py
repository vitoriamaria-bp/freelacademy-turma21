from django.db import models
from django.contrib.auth.models import AbstractUser
from django.conf import settings

class Usuario(AbstractUser):
    TIPO_CHOICES = (
        ('cliente', 'Cliente'),
        ('freelancer', 'Freelancer'),
    )
    # Campos originais e obrigatórios
    tipo = models.CharField(max_length=10, choices=TIPO_CHOICES)
    cpf_cnpj = models.CharField(max_length=14, unique=True)
    telefone = models.CharField(max_length=15)
    
    # --- PERFIL E BIO ---
    descricao = models.TextField(verbose_name="Sobre mim / Descrição", blank=True, null=True)
    foto_perfil = models.ImageField(upload_to='perfil/', blank=True, null=True)
    avaliacao_media = models.DecimalField(max_digits=3, decimal_places=2, default=0.00)

    # --- LOCALIZAÇÃO (Alinhado com a base de dados SQL da equipe) ---
    cidade = models.CharField(max_length=100, blank=True, null=True)
    estado = models.CharField(max_length=2, blank=True, null=True)
    
    # --- LGPD E PRIVACIDADE ---
    perfil_publico = models.BooleanField(default=True, verbose_name="Perfil visível para outros")
    data_aceite_termos = models.DateTimeField(auto_now_add=True)

    def __str__(self):
        return f"{self.first_name} ({self.tipo})"

class Projeto(models.Model):
    STATUS_CHOICES = (
        ('aberto', 'Aberto'),
        ('em_andamento', 'Em Andamento'),
        ('concluido', 'Concluído'),
    )
    titulo = models.CharField(max_length=200, verbose_name="Título")
    descricao = models.TextField(verbose_name="Descrição")
    orcamento = models.DecimalField(max_digits=10, decimal_places=2, verbose_name="Orçamento (R$)")
    prazo = models.DateField(verbose_name="Prazo de Entrega")
    status = models.CharField(max_length=20, choices=STATUS_CHOICES, default='aberto')
    cliente = models.ForeignKey(settings.AUTH_USER_MODEL, on_delete=models.CASCADE, related_name='meus_projetos')
    data_criacao = models.DateTimeField(auto_now_add=True)

    def __str__(self):
        return self.titulo

class Proposta(models.Model):
    STATUS_PROPOSTA = (
        ('pendente', 'Pendente'),
        ('aceite', 'Aceite'),
        ('recusada', 'Recusada'),
    )
    projeto = models.ForeignKey(Projeto, on_delete=models.CASCADE, related_name='propostas')
    freelancer = models.ForeignKey(settings.AUTH_USER_MODEL, on_delete=models.CASCADE, related_name='minhas_propostas')
    valor_cobrado = models.DecimalField(max_digits=10, decimal_places=2, verbose_name="Valor da Proposta (R$)")
    mensagem = models.TextField(verbose_name="Mensagem de Apresentação")
    prazo_estimado = models.CharField(max_length=100, verbose_name="Prazo Estimado")
    status = models.CharField(max_length=20, choices=STATUS_PROPOSTA, default='pendente')
    data_envio = models.DateTimeField(auto_now_add=True)

    def __str__(self):
        return f"Proposta de {self.freelancer.first_name} para {self.projeto.titulo}"