package freelacademy.service;

import freelacademy.model.Usuario;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LoginServiceTest {

    @Test
    void deveAutenticarUsuarioInicial() {
        UsuarioRepository repo = new UsuarioRepository();
        LoginService service = new LoginService(repo);

        boolean resultado = service.autenticar("admin@email.com", "123456");

        assertTrue(resultado);
    }

    @Test
    void naoDeveAutenticarQuandoSenhaErrada() {
        UsuarioRepository repo = new UsuarioRepository();
        LoginService service = new LoginService(repo);

        boolean resultado = service.autenticar("admin@email.com", "0000");

        assertFalse(resultado);
    }

    @Test
    void naoDeveAutenticarQuandoEmailNaoExistir() {
        UsuarioRepository repo = new UsuarioRepository();
        LoginService service = new LoginService(repo);

        boolean resultado = service.autenticar("naoexiste@email.com", "123456");

        assertFalse(resultado);
    }

    @Test
    void deveAutenticarUsuarioCadastrado() {
        UsuarioRepository repo = new UsuarioRepository();
        LoginService service = new LoginService(repo);

        Usuario novo = new Usuario("Carlos", "carlos@email.com", "abc123");
        repo.salvarUsuario(novo);

        boolean resultado = service.autenticar("carlos@email.com", "abc123");

        assertTrue(resultado);
    }
}