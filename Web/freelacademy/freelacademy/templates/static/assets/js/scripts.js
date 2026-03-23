/* ARQUIVO: assets/js/scripts.js */

document.addEventListener('DOMContentLoaded', () => {
    
    // --- 1. MENU MOBILE (HOME) ---
    const mobileToggle = document.querySelector('.mobile-toggle');
    const navLinks = document.querySelector('.nav-links');
    if (mobileToggle && navLinks) {
        mobileToggle.addEventListener('click', () => {
            if (navLinks.style.display === 'flex') {
                navLinks.style.display = 'none';
            } else {
                navLinks.style.display = 'flex';
                navLinks.style.position = 'absolute';
                navLinks.style.top = '100%'; navLinks.style.left = '0'; navLinks.style.width = '100%';
                navLinks.style.background = '#ffffff'; navLinks.style.flexDirection = 'column';
                navLinks.style.padding = '20px'; navLinks.style.borderTop = '1px solid #eee';
                navLinks.style.boxShadow = '0 5px 15px rgba(0,0,0,0.1)';
            }
        });
    }

    // --- 2. SIDEBAR DO PAINEL (TOGGLE) ---
    const sidebarToggle = document.getElementById('toggleSidebar');
    const sidebar = document.getElementById('sidebar');
    const mainContent = document.getElementById('mainContent');
    
    if (sidebarToggle && sidebar && mainContent) {
        sidebarToggle.addEventListener('click', () => {
            sidebar.classList.toggle('collapsed');
            mainContent.classList.toggle('expanded');
        });
    }

    // --- 2.1 DEVOLVE A COR AO MENU LATERAL (Aba Ativa do Django) ---
    const currentUrl = window.location.pathname;
    const menuLinks = document.querySelectorAll('.sidebar-menu a');
    
    menuLinks.forEach(link => {
        if (link.getAttribute('href') === currentUrl) {
            link.parentElement.classList.add('active'); 
        }
    });

    // --- 2.2 CONTROLA O CLIQUE DO SININHO ---
    const notifBtn = document.getElementById('notifBtn');
    const notifDropdown = document.getElementById('notifDropdown');

    if (notifBtn && notifDropdown) {
        notifBtn.addEventListener('click', function(e) {
            e.stopPropagation(); 
            if (notifDropdown.style.display === 'none' || notifDropdown.style.display === '') {
                notifDropdown.style.display = 'block';
            } else {
                notifDropdown.style.display = 'none';
            }
        });
    }

    // Fecha o sininho se o usuário clicar fora dele
    document.addEventListener('click', function() {
        if (notifDropdown) {
            notifDropdown.style.display = 'none';
        }
    });

    // --- 3. CHAT LIST (TOGGLE) ---
    const chatToggle = document.getElementById('toggleChatList');
    const chatList = document.querySelector('.chat-sidebar-list');

    if (chatToggle && chatList) {
        chatToggle.addEventListener('click', () => {
            chatList.classList.toggle('collapsed');
            const icon = chatToggle.querySelector('i');
            if (chatList.classList.contains('collapsed')) {
                icon.classList.remove('fa-chevron-left');
                icon.classList.add('fa-chevron-right');
            } else {
                icon.classList.remove('fa-chevron-right');
                icon.classList.add('fa-chevron-left');
            }
        });
    }

    // --- 4. VALIDAÇÃO DE CADASTRO (18 ANOS) ---
    const formCadastro = document.getElementById('formCadastro');
    if (formCadastro) {
        formCadastro.addEventListener('submit', function(event) {
            event.preventDefault();
            const inputData = document.getElementById('dataNascimento').value;
            const inputNome = document.getElementById('nomeCompleto').value;
            
            if (!validarIdade(inputData)) {
                alert(`Olá ${inputNome}, lamentamos, mas o FreelAcademy é permitido apenas para maiores de 18 anos.`);
                return; 
            }
            alert("Cadastro realizado com sucesso! Faça seu login para continuar.");
            window.location.href = "login.html";
        });
    }

    // --- 5. LÓGICA DE ABAS (TABS - DETALHES DO PROJETO) ---
    const tabLinks = document.querySelectorAll('.tab-link');
    const tabPanes = document.querySelectorAll('.tab-pane');

    if (tabLinks.length > 0 && tabPanes.length > 0) {
        tabLinks.forEach(link => {
            link.addEventListener('click', () => {
                tabLinks.forEach(l => l.classList.remove('active'));
                tabPanes.forEach(p => p.classList.remove('active'));

                link.classList.add('active');
                const targetId = link.getAttribute('data-target');
                const targetPane = document.getElementById(targetId);
                if (targetPane) {
                    targetPane.classList.add('active');
                }
            });
        });
    }

    // --- 6. VALIDAÇÃO E REDIRECIONAMENTO DE LOGIN ---
    const formLogin = document.getElementById('formLogin');
    if (formLogin) {
        formLogin.addEventListener('submit', function(event) {
            event.preventDefault(); 
            
            const tipoAcesso = document.querySelector('input[name="tipoAcesso"]:checked').value;
            
            if (tipoAcesso === 'cliente') {
                window.location.href = "cliente-home.html";
            } else if (tipoAcesso === 'freelancer') {
                window.location.href = "freelancer-home.html";
            }
        });
    }

    // --- 7. RECUPERAÇÃO DE SENHA ---
    const formRecuperar = document.getElementById('formRecuperar');
    if (formRecuperar) {
        formRecuperar.addEventListener('submit', function(event) {
            event.preventDefault();
            const email = document.getElementById('emailRecuperacao').value;
            
            alert(`As instruções de recuperação foram enviadas para:\n${email}\n\nVerifique sua caixa de entrada e a pasta de spam.`);
            window.location.href = "login.html";
        });
    }

    // --- 8. MÁSCARAS AUTOMÁTICAS (CPF/CNPJ, TELEFONE E DINHEIRO) ---
    
    // 8.1 Máscara de CPF e CNPJ
    const inputCpfCnpj = document.querySelector('input[name="cpf_cnpj"]');
    if (inputCpfCnpj) {
        inputCpfCnpj.addEventListener('input', function(e) {
            let value = e.target.value.replace(/\D/g, ''); 
            
            if (value.length <= 11) { 
                value = value.replace(/(\d{3})(\d)/, '$1.$2');
                value = value.replace(/(\d{3})(\d)/, '$1.$2');
                value = value.replace(/(\d{3})(\d{1,2})$/, '$1-$2');
            } else { 
                value = value.substring(0, 14); 
                value = value.replace(/^(\d{2})(\d)/, '$1.$2');
                value = value.replace(/^(\d{2})\.(\d{3})(\d)/, '$1.$2.$3');
                value = value.replace(/\.(\d{3})(\d)/, '.$1/$2');
                value = value.replace(/(\d{4})(\d)/, '$1-$2');
            }
            e.target.value = value;
        });
    }

    // 8.2 Máscara de Telefone (Fixo ou Celular)
    const inputTelefone = document.querySelector('input[name="telefone"]');
    if (inputTelefone) {
        inputTelefone.addEventListener('input', function(e) {
            let value = e.target.value.replace(/\D/g, '');
            value = value.substring(0, 11); 
            
            if (value.length > 2) {
                value = value.replace(/^(\d{2})(\d)/g, '($1) $2');
            }
            if (value.length > 9) { 
                value = value.replace(/(\d{5})(\d)/, '$1-$2');
            } else if (value.length > 8) { 
                value = value.replace(/(\d{4})(\d)/, '$1-$2');
            }
            e.target.value = value;
        });
    }

    // 8.3 Máscara de Dinheiro (Financeiro / Orçamento / Proposta)
    const inputsDinheiro = document.querySelectorAll('input[name="valor"], input[name="orcamento"], input[name="valor_cobrado"]');
    inputsDinheiro.forEach(input => {
        if (input.type === 'number') {
            input.type = 'text';
        }
        
        input.addEventListener('input', function(e) {
            let value = e.target.value.replace(/\D/g, ''); 
            if (value === '') {
                e.target.value = '';
                return;
            }
            
            value = (parseInt(value) / 100).toFixed(2) + '';
            value = value.replace('.', ','); 
            value = value.replace(/(\d)(?=(\d{3})+(?!\d))/g, '$1.'); 
            
            e.target.value = value;
        });
    });

    // --- 9. MODAL DE SAQUE (CARTEIRA FREELANCER) ---
    const btnSacar = document.getElementById('btnSacarSimulacao');
    const modalSaque = document.getElementById('modalSaque');
    const btnFecharModal = document.getElementById('btnFecharModal');

    if (btnSacar && modalSaque && btnFecharModal) {
        // Abre o modal
        btnSacar.addEventListener('click', () => {
            modalSaque.style.display = 'flex';
        });

        // Fecha o modal no botão
        btnFecharModal.addEventListener('click', () => {
            modalSaque.style.display = 'none';
        });

        // Fecha o modal clicando fora dele (no fundo escuro)
        modalSaque.addEventListener('click', (e) => {
            if (e.target === modalSaque) {
                modalSaque.style.display = 'none';
            }
        });
    }

});

// --- FUNÇÕES GLOBAIS ---
function validarIdade(dataNascimento) {
    const hoje = new Date();
    const dataNasc = new Date(dataNascimento);
    let idade = hoje.getFullYear() - dataNasc.getFullYear();
    const mes = hoje.getMonth() - dataNasc.getMonth();

    if (mes < 0 || (mes === 0 && hoje.getDate() < dataNasc.getDate())) {
        idade--;
    }
    return idade >= 18;
}

function realizarLogout() {
    if (confirm("Deseja realmente sair da plataforma?")) {
        window.location.href = "login.html";
    }
}