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
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UsuarioRepositoryTest {

    @Test
    void deveEncontrarUsuarioPorEmail() {
        UsuarioRepository repo = new UsuarioRepository();

        Usuario usuario = repo.buscarPorEmail("admin@email.com");

        assertNotNull(usuario);
        assertEquals("Thiago", usuario.getNome());
    }

    @Test
    void deveRetornarNullQuandoNaoEncontrarUsuario() {
        UsuarioRepository repo = new UsuarioRepository();

        Usuario usuario = repo.buscarPorEmail("naoexiste@email.com");

        assertNull(usuario);
    }

    @Test
    void deveSalvarNovoUsuario() {
        UsuarioRepository repo = new UsuarioRepository();

        Usuario novo = new Usuario("Carlos", "carlos@email.com", "abc123");

        boolean salvo = repo.salvarUsuario(novo);

        assertTrue(salvo);

        Usuario encontrado = repo.buscarPorEmail("carlos@email.com");

        assertNotNull(encontrado);
        assertEquals("Carlos", encontrado.getNome());
    }

    @Test
    void naoDevePermitirEmailDuplicado() {
        UsuarioRepository repo = new UsuarioRepository();

        Usuario usuario1 = new Usuario("Carlos", "duplicado@email.com", "abc123");
        Usuario usuario2 = new Usuario("Maria", "duplicado@email.com", "123456");

        boolean primeiroCadastro = repo.salvarUsuario(usuario1);
        boolean segundoCadastro = repo.salvarUsuario(usuario2);

        assertTrue(primeiroCadastro);
        assertFalse(segundoCadastro);
    }
}