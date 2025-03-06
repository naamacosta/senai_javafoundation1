/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.polimorfismo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fic
 */
public class Polimorfismo {

    public static void main(String[] args) {
        List<Pagamento> pagamentos = new ArrayList<>();
        
        pagamentos.add(new PagamentoCartao());
        pagamentos.add(new PagamentoPix());
        
        for(Pagamento p : pagamentos){
            p.realizarPagamento();
        }
    }
}

abstract class Pagamento{
    public abstract void realizarPagamento();
        
    }
    
    class PagamentoCartao extends Pagamento{
        
        @Override
        public void realizarPagamento(){
            System.out.println("Pagamento realizado com cartao");
        }
}

class PagamentoPix extends Pagamento{
    
    @Override
    public void realizarPagamento(){
        System.out.println("Pagamento realizado via Pix");
    }
}
