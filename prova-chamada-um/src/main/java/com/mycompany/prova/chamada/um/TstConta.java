// Joao Vitor Muniz Lopes
package com.mycompany.prova.chamada.um;

/**
 *
 * @author joaolopes
 */
public class TstConta {
      public static void main(String[] args) throws NumException {
        PessoaJuridica pj = new PessoaJuridica();

        pj.setNumeroConta(199);
        pj.setCnpj(30);        
        pj.getEnder().setRua("Rua Aristides Jose Pereira");        
        pj.getResponsavel().setCpf(15);
        pj.getResponsavel().setNome("Joao Vitor");

        System.out.println("----- Dados da Pessoa Jurídica -----");
        System.out.println("Número da conta: " + pj.getNumeroConta());
        pj.validar();
        System.out.println("CNPJ: " + pj.getCnpj());
        System.out.println("Rua: " + pj.getEnder().getRua());
        
        System.out.println();

        System.out.println("----- Dados do Responsável (Pessoa Física) -----");
        System.out.println("CPF do Responsável pela conta: " + pj.getResponsavel().getCpf());
        pj.getResponsavel().verifDoc();
        System.out.println("Nome do Responsável: " + pj.getResponsavel().getNome());
        pj.verifDoc();
      }
}
