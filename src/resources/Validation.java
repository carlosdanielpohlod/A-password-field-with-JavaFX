/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resources;

/**
 *
 * @author usuario
 */
public class Validation {
     public static boolean passwordIsValid(String senha) {
        if (senha.length() < 5) return false;

        boolean achouNumero = false;
        boolean achouMaiuscula = false;
        boolean achouMinuscula = false;
        boolean achouSimbolo = false;
        for (char c : senha.toCharArray()) {
             if (c >= '0' && c <= '9') {
                 achouNumero = true;
             } else if (c >= 'A' && c <= 'Z') {
                 achouMaiuscula = true;
             } else if (c >= 'a' && c <= 'z') {
                 achouMinuscula = true;
             } else {
                 achouSimbolo = true;
             }
        }
        return achouNumero && achouMaiuscula && achouMinuscula && achouSimbolo;
    }

}
