// Joao Vitor Muniz Lopes
package com.mycompany.prova.chamada.um;

/**
 *
 * @author joaolopes
 */
public abstract class ClienteBanco implements Verifica {
    private int numeroConta = 0;
    private String nome = "";
    private Endereco ender =  new Endereco();

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) throws NumException {
        if (numeroConta < 0) {
            throw new NumException();
        }
        this.numeroConta = numeroConta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEnder(Endereco ender) {
        this.ender = ender;
    }


    public Endereco getEnder() {
        return this.ender;
    }

    public abstract void verifDoc();

    @Override
    public void validar() {
        if (this.numeroConta % 2 == 0) {
            System.out.println("Numero da conta é par.");
        } else {
            System.out.println("Numero da conta é ímpar.");
        }
    }
}
