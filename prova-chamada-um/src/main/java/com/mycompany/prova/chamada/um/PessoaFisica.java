// Joao Vitor Muniz Lopes
package com.mycompany.prova.chamada.um;

/**
 *
 * @author joaolopes
 */
public class PessoaFisica extends ClienteBanco {
    private int cpf = 0;

    public int getCpf() {
        return this.cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    
    @Override
    public void verifDoc(){
        if(this.cpf>=10 && this.cpf<=20){
            System.out.println("CPF valido.");
        }else{
            System.out.println("CPF invalido.");
        }
    }
}
