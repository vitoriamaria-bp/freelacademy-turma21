from django.shortcuts import render, redirect
from django.http import HttpResponse

#Login
from django.contrib.auth import authenticate, login, logout
from django.contrib.auth.decorators import login_required
from django.contrib import messages


#cadastro
from django.contrib.auth.models import User


# #função que vai realizar o login
def login_view(request):
    if request.method == 'POST':

        #obtendo o usuario e a senha digitada no html
        username = request.POST.get('username')
        password = request.POST.get('password')

        #fazer a autenticação
        username = authenticate(request, username=username, password=password)

        #verificação
        if username is not None:
            login(request, username)
            return redirect('home')
        else:
            messages.error(request, 'Usuário ou senha inválidos!')

    return render(request, 'login.html')


#Função que levará para a home

@login_required(login_url='login')
def home(request):
    return render(request, 'home.html')

def logout_view(request):
    logout(request)
    return redirect('login')


def cadastro(request):
    if request.method == 'POST':

        username = request.POST.get("username")
        email = request.POST.get("email")
        password = request.POST.get("password")

        if User.objects.filter(email=email).exists():
            messages.error(request, "Email já cadastrado!")
            return redirect("cadastro")

        #criar nosso objeto User e salvar no banco

        User.objects.create_user(
            username=username,
            email=email,
            password=password
        )

        messages.success(request, "Cadastro realizado com sucesso!")
        return redirect("login")

    return render(request, "cadastro.html")


# def home(request):
#     return render(request, 'index.html')
# Create your views here. 