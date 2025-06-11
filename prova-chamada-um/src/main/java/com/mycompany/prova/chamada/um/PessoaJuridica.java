// Joao Vitor Muniz Lopes
package com.mycompany.prova.chamada.um;

public final class PessoaJuridica extends ClienteBanco {
    private int cnpj = 0;
    private PessoaFisica responsavel = new PessoaFisica();

    public int getCnpj() {
        return this.cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    public void setResponsavel(PessoaFisica responsavel) {
        this.responsavel = responsavel;
    }

    public PessoaFisica getResponsavel() {
        return this.responsavel;
    }

    @Override
    public void verifDoc() {
        if (this.responsavel.getNome().length() > 30) {
            System.out.println("Nome invalido para Responsavel");
        } else {
            System.out.println("Nome valido para Responsavel");
        }
    }
}