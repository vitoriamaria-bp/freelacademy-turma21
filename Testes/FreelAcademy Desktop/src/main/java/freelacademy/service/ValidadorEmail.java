/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package freelacademy.service;

/**
 *
 * @author Thiago
 */
public class ValidadorEmail {

    public boolean emailValido(String email) {

        if (email == null) {
            return false;
        }

        if (email.isEmpty()) {
            return false;
        }

        if (!email.contains("@")) {
            return false;
        }

        if (!email.contains(".")) {
            return false;
        }

        return true;
    }
}
