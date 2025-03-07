/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula0603exercicio1;

/**
 *
 * @author fic
 */
public class Aula0603Exercicio1 {

    public static void main(String[] args) {
        Guitarra guitarra = new Guitarra();
        Piano piano = new Piano();
        
        guitarra.tocar();
        piano.tocar();
    }
}

abstract class InstrumentoMusical {
    public abstract void tocar();
        
}

class Guitarra extends InstrumentoMusical {

    @Override
    public void tocar() {
        System.out.println("A guitarra está sendo tocada.");
    }
    
}

class Piano extends InstrumentoMusical {

    @Override
    public void tocar() {
        System.out.println("O piano está sendo tocado.");
    }
    
}