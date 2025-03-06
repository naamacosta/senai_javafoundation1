/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula2802.exercicio1;

/**
 *
 * @author fic
 */
public class Aula2802Exercicio1 {

    public static void main(String[] args) {
        Gerente gerente = new Gerente("Paulo", 15000, 10000);
        gerente.exibeInformacoes();
        
        Programador programador = new Programador("Jose", 10000, "Java");
        programador.exibeInformacoes();
    }
}

class Funcionario{
    protected String nome;
    protected double salario;
    
    public Funcionario(String nome, double salario) {
    this.nome = nome;
    this.salario = salario;
    }
    
    public void exibeInformacoes(){
        System.out.println("O funcionario de nome: " + nome + " tem o salario de R$" + salario);
    }
}

class Gerente extends Funcionario{
    private double bonus;
    
    public Gerente(String nome, double salario, double bonus) {
        super(nome, salario);
        this.bonus = bonus;
    }
    
    @Override
    public void exibeInformacoes(){
        System.out.println("O Gerente de nome: " + nome + " tem o salario de R$" + salario + " e Bonus de R$" + bonus);
    }
    
}

class Programador extends Funcionario{
    private String linguagem;
    
    public Programador(String nome, double salario, String linguagem) {
        super(nome, salario);
        this.linguagem = linguagem;
    }
    
    @Override
    public void exibeInformacoes(){
        System.out.println("O Programador de nome: " + nome + " tem o salario de R$" + salario + " e programa em " + linguagem);
    }
    
}