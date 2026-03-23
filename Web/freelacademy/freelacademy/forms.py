from django import forms
from .models import Projeto, Proposta

class ProjetoForm(forms.ModelForm):
    class Meta:
        model = Projeto
        fields = ['titulo', 'descricao', 'orcamento', 'prazo']
        widgets = {
            'prazo': forms.DateInput(attrs={'type': 'date', 'class': 'form-control'}),
            'titulo': forms.TextInput(attrs={'class': 'form-control'}),
            'descricao': forms.Textarea(attrs={'class': 'form-control', 'rows': 4}),
            'orcamento': forms.NumberInput(attrs={'class': 'form-control'}),
        }
# NOVO: Formulário para o Freelancer
class PropostaForm(forms.ModelForm):
    class Meta:
        model = Proposta
        fields = ['valor_cobrado', 'prazo_estimado', 'mensagem']