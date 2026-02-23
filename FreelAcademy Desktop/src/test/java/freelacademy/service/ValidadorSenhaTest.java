/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package freelacademy.service;

/**
 *
 * @author Thiago
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidadorSenhaTest {

    @Test
    void deveValidarSenhaCorreta() {
        ValidadorSenha validador = new ValidadorSenha();
        assertTrue(validador.senhaValida("abc123"));
    }

    @Test
    void naoDeveValidarSenhaCurta() {
        ValidadorSenha validador = new ValidadorSenha();
        assertFalse(validador.senhaValida("a1b2"));
    }

    @Test
    void naoDeveValidarSenhaSemNumero() {
        ValidadorSenha validador = new ValidadorSenha();
        assertFalse(validador.senhaValida("abcdef"));
    }

    @Test
    void naoDeveValidarSenhaNula() {
        ValidadorSenha validador = new ValidadorSenha();
        assertFalse(validador.senhaValida(null));
    }

    @Test
    void naoDeveValidarSenhaVazia() {
        ValidadorSenha validador = new ValidadorSenha();
        assertFalse(validador.senhaValida(""));
    }
}