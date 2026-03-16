from django.db import models

# Create your models here.
class Freelancer(models.Model):
    id_freelancer = models.IntegerField()
    nome = models.CharField(max_length=255)
    email = models.EmailField()
    telefone = models.CharField(max_length=30)
    descricao = models.CharField(max_length=255)
    foto_perfil = models.TextField()
    data_cadastro = models.DateField()
    avaliacao_media = models.DecimalField(max_digits=3, decimal_places=2)

class Empresa(models.Model):
    id_empresa = models.IntegerField()
    nome = models.CharField(max_length=255)
    email = models.EmailField()
    telefone = models.CharField(max_length=30)
    descricao = models.CharField(max_length=255)
    data_cadastro = models.DateField()

class Projeto(models.Model):
    id_projeto = models.IntegerField()
    titulo = models.CharField(max_length=100)
    descricao = models.CharField(max_length=250)
    data_inicio = models.DateField()
    data_fim = models.DateField()
    status_projeto = models.BooleanField(default=True)
    valor = models.DecimalField(max_digits=10, decimal_places=2)
    id_empresa = models.IntegerField()

class Proposta(models.Model):
    id_proposta = models.IntegerField()
    valor = models.DecimalField(max_digits=10, decimal_places=2)
    prazo = models.CharField(max_length=100)
    descricao = models.CharField(max_length=255)
    status_proposta = models.BooleanField(default=True)
    id_freelancer = models.IntegerField()
    id_projeto = models.IntegerField()

class Contrato(models.Model):
    id_contrato = models.IntegerField()
    data_assinatura = models.DateField()
    valor_acordado = models.DecimalField(max_digits=10, decimal_places=2)
    status_contrato = models.BooleanField(default=True)
    data_inicio = models.DateField()
    data_fim = models.DateField()
    id_proposta = models.IntegerField()
    id_freelancer = models.IntegerField()
    id_empresa = models.IntegerField()

class Pagamento(models.Model):
    id_pagamento = models.IntegerField()
    valor = models.DecimalField(max_digits=10, decimal_places=2)
    data_pagamento = models.DateField()
    metodo_pagamento = models.BooleanField(default=True)
    status_pagamento = models.BooleanField(default=True)
    id_contrato = models.IntegerField()

class Avaliacoes(models.Model):
    id_avaliacao = models.IntegerField()
    nota = models.IntegerField()
    comentario = models.CharField(max_length=255)
    data_avaliacao = models.DateField()
    id_freelancer = models.IntegerField()
    id_empresa = models.IntegerField()
    id_projeto = models.IntegerField()