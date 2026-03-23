from django.db import models
from django.contrib.auth.models import AbstractUser

class Usuario(AbstractUser):
    TIPO_CHOICES = (
        ('cliente', 'Cliente'),
        ('freelancer', 'Freelancer'),
    )
    tipo = models.CharField(max_length=10, choices=TIPO_CHOICES)
    cpf_cnpj = models.CharField(max_length=14, unique=True, null=True, blank=True)
    telefone = models.CharField(max_length=15, null=True, blank=True)
    descricao = models.TextField(null=True, blank=True)
    foto_perfil = models.ImageField(upload_to='perfil/', null=True, blank=True)
    avaliacao_media = models.DecimalField(max_digits=3, decimal_places=2, default=0.0)
    saldo = models.DecimalField(max_digits=10, decimal_places=2, default=0.0) # NOVO: Para a Carteira
    cidade = models.CharField(max_length=100, null=True, blank=True)
    estado = models.CharField(max_length=2, null=True, blank=True)
    perfil_publico = models.BooleanField(default=True)
    data_aceite_termos = models.DateTimeField(auto_now_add=True)

    def __str__(self):
        return f"{self.username} ({self.tipo})"

class Projeto(models.Model):
    STATUS_CHOICES = (
        ('aberto', 'Aberto'),
        ('em_andamento', 'Em Andamento'),
        ('concluido', 'Concluído'),
    )
    cliente = models.ForeignKey(Usuario, on_delete=models.CASCADE, related_name='projetos_cliente')
    titulo = models.CharField(max_length=200)
    descricao = models.TextField()
    orcamento = models.DecimalField(max_digits=10, decimal_places=2)
    prazo = models.DateField()
    data_criacao = models.DateTimeField(auto_now_add=True)
    status = models.CharField(max_length=20, choices=STATUS_CHOICES, default='aberto')

    def __str__(self):
        return self.titulo

class Proposta(models.Model):
    STATUS_CHOICES = (
        ('pendente', 'Pendente'),
        ('aceite', 'Aceite'),
        ('recusado', 'Recusado'),
    )
    projeto = models.ForeignKey(Projeto, on_delete=models.CASCADE, related_name='propostas')
    freelancer = models.ForeignKey(Usuario, on_delete=models.CASCADE, related_name='propostas_enviadas')
    mensagem = models.TextField()
    valor_cobrado = models.DecimalField(max_digits=10, decimal_places=2)
    prazo_estimado = models.CharField(max_length=100)
    data_envio = models.DateTimeField(auto_now_add=True)
    status = models.CharField(max_length=20, choices=STATUS_CHOICES, default='pendente')

class Notificacao(models.Model):
    usuario = models.ForeignKey(Usuario, on_delete=models.CASCADE, related_name='notificacoes')
    mensagem = models.CharField(max_length=255)
    link = models.CharField(max_length=255, null=True, blank=True)
    lida = models.BooleanField(default=False)
    data_criacao = models.DateTimeField(auto_now_add=True)