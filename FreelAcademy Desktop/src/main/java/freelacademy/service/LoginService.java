package freelacademy.service;

import freelacademy.model.Usuario;

public class LoginService {

    private UsuarioRepository repository;

    public LoginService(UsuarioRepository repository) {
        this.repository = repository;
    }

    public boolean autenticar(String email, String senha) {

        if (email == null || senha == null) {
            return false;
        }

        if (email.isEmpty() || senha.isEmpty()) {
            return false;
        }

        Usuario usuario = repository.buscarPorEmail(email);

        if (usuario == null) {
            return false;
        }

        return usuario.getSenha().equals(senha);
    }
}