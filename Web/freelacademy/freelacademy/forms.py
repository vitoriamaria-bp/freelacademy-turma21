from django import forms
from .models import Projeto, Proposta

class ProjetoForm(forms.ModelForm):
    class Meta:
        model = Projeto
        fields = ['titulo', 'descricao', 'orcamento', 'prazo']
        widgets = {
            'prazo': forms.DateInput(attrs={'type': 'date', 'class': 'dash-input'}),
            'titulo': forms.TextInput(attrs={'class': 'dash-input', 'placeholder': 'Ex: Criação de Logo'}),
            'descricao': forms.Textarea(attrs={'class': 'dash-textarea', 'rows': 4, 'placeholder': 'Descreva os detalhes...'}),
            'orcamento': forms.NumberInput(attrs={'class': 'dash-input', 'placeholder': '0.00'}),
        }

class PropostaForm(forms.ModelForm):
    class Meta:
        model = Proposta
        fields = ['valor_cobrado', 'prazo_estimado', 'mensagem']
        widgets = {
            'valor_cobrado': forms.NumberInput(attrs={'class': 'dash-input', 'step': '0.01'}),
            'prazo_estimado': forms.TextInput(attrs={'class': 'dash-input', 'placeholder': 'Ex: 5 dias'}),
            'mensagem': forms.Textarea(attrs={'class': 'dash-textarea', 'rows': 4, 'placeholder': 'Apresente-se para o cliente...'}),
        }