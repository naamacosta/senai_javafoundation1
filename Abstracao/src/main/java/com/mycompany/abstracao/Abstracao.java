/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.abstracao;

/**
 *
 * @author fic
 */
public class Abstracao {

    public static void main(String[] args) {
        Animal cachorro = new Cachorro("Rex", 5);
        Animal gato = new Gato("Salem", 3);
        
        cachorro.emitirSom();
        gato.emitirSom();
    }
}

abstract class Animal{
    protected String nome;
    protected int idade;
    
    public Animal(String nome, int idade){
        this.nome = nome; this.idade = idade;
    }
    
    public abstract void emitirSom();
}

class Cachorro extends Animal{
    public Cachorro(String nome, int idade){
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("O cachorro late");
    }
}

class Gato extends Animal{
    public Gato (String nome, int idade){
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("O gato mia");    
    }
    
}