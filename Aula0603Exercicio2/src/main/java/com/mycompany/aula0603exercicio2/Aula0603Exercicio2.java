/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula0603exercicio2;

/**
 *
 * @author fic
 */
public class Aula0603Exercicio2 {

    public static void main(String[] args) {
        Pagamento pagtoCartao = new PagtoCartao();
        Pagamento pagtoPix = new PagtoPix();
        
        pagtoCartao.realizarPagamento(40);
        pagtoPix.realizarPagamento(60.80);
    }
}

abstract class Pagamento{
    public abstract void realizarPagamento(double valor);
    
}

class PagtoCartao extends Pagamento{

    @Override
    public void realizarPagamento(double valor) {
        System.out.println("Pagamento de R$" + valor + " realizado com cartão");
    }
    
}

class PagtoPix extends Pagamento{

    @Override
    public void realizarPagamento(double valor) {
        System.out.println("Pagamento de R$" + valor + " realizado com PIX");
    }
    
}
