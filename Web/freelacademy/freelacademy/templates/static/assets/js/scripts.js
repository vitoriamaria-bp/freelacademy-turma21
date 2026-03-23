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
    // (Nota: Mantido original. Se você estiver usando o formulário renderizado pelo Django, esta função via JS puro pode não ser chamada, mas não atrapalha).
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
    // (Nota: Mantido original para páginas estáticas, o Django usa o ID formLoginDjango que te enviei antes, então eles não entram em conflito).
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
            
            // Simula o disparo de e-mail e volta pro login
            alert(`As instruções de recuperação foram enviadas para:\n${email}\n\nVerifique sua caixa de entrada e a pasta de spam.`);
            window.location.href = "login.html";
        });
    }
});

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