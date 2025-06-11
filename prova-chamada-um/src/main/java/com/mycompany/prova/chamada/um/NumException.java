// Joao Vitor Muniz Lopes
package com.mycompany.prova.chamada.um;

public class NumException extends Exception {
    public void impMsg() {
        System.out.println("""
                ERRO: Não pode haver Número
                Negativo para conta!
                """);
    }
}