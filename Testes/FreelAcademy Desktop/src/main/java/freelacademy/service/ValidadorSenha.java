/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package freelacademy.service;

/**
 *
 * @author Thiago
 */
public class ValidadorSenha {

    public boolean senhaValida(String senha) {

        if (senha == null) {
            return false;
        }

        if (senha.isEmpty()) {
            return false;
        }

        if (senha.length() < 6) {
            return false;
        }

        // Verifica se tem pelo menos um número
        boolean temNumero = false;

        for (char c : senha.toCharArray()) {
            if (Character.isDigit(c)) {
                temNumero = true;
                break;
            }
        }

        return temNumero;
    }
}