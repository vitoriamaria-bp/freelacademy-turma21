/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package freelacademy.service;

/**
 *
 * @author Thiago
 */

import freelacademy.model.Usuario;
import java.util.ArrayList;
import java.util.List;

public class UsuarioRepository {

    private List<Usuario> usuarios = new ArrayList<>();

    public UsuarioRepository() {
        // Usuário inicial do sistema
        usuarios.add(new Usuario("Thiago", "admin@email.com", "123456"));
    }

    // 🔹 Salvar usuário com validação de email duplicado
    public boolean salvarUsuario(Usuario usuario) {

        if (usuario == null) {
            return false;
        }

        if (buscarPorEmail(usuario.getEmail()) != null) {
            return false; // email já existe
        }

        usuarios.add(usuario);
        return true;
    }

    // 🔹 Buscar usuário por email
    public Usuario buscarPorEmail(String email) {

        if (email == null) {
            return null;
        }

        for (Usuario usuario : usuarios) {
            if (usuario.getEmail().equals(email)) {
                return usuario;
            }
        }

        return null;
    }

    // 🔹 Apenas para testes
    public int totalUsuarios() {
        return usuarios.size();
    }
}