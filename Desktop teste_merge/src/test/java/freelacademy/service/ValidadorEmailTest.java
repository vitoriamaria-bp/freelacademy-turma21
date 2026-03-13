package freelacademy.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidadorEmailTest {

    @Test
    void deveValidarEmailCorreto() {
        ValidadorEmail validador = new ValidadorEmail();
        assertTrue(validador.emailValido("teste@email.com"));
    }

    @Test
    void naoDeveValidarEmailSemArroba() {
        ValidadorEmail validador = new ValidadorEmail();
        assertFalse(validador.emailValido("testeemail.com"));
    }

    @Test
    void naoDeveValidarEmailSemPonto() {
        ValidadorEmail validador = new ValidadorEmail();
        assertFalse(validador.emailValido("teste@emailcom"));
    }

    @Test
    void naoDeveValidarEmailNulo() {
        ValidadorEmail validador = new ValidadorEmail();
        assertFalse(validador.emailValido(null));
    }

    @Test
    void naoDeveValidarEmailVazio() {
        ValidadorEmail validador = new ValidadorEmail();
        assertFalse(validador.emailValido(""));
    }
}