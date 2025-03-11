/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projetobancario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author fic
 */
public class ProjetoBancario {
List<Conta> contas = new ArrayList<>();
    public static void main(String[] args) {
        
        int escolha;
        
        
        //switch(escolha){
        //    case 1: Banco.criarConta();
            
        }
    
     public void criarConta(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do titular: ");
        String titular = scanner.nextLine();
        
        System.out.print("Digite 1-Conta corrente ou 2-Conta poupanca ");
        int tipoConta = scanner.nextInt();
        
        switch(tipoConta){
            case 1: contas.add(new ContaCorrente(titular, 0, 1));
            case 2: contas.add(new ContaPoupanca(titular, 0, 1));
            default: System.out.println("Opção invalida");
        }
    }
     
     public void depositar(){
         Scanner scanner = new Scanner(System.in);
         
     }
     
     public  buscar(int numeroConta){
         contas.get(numeroConta);
         
         return contas;
     }
    

    
    class Banco{
        
           
        
}
    }

abstract class Conta{

protected String titular;
protected double saldo;
protected int numeroConta;

public Conta(String titular, double saldo, int numeroConta){
    this.titular = titular;
    this.saldo = saldo;
    this.numeroConta = numeroConta;
}

public abstract void depositar(double valor);

public abstract void sacar(double valor);

public abstract void exibirInformacoes();

}




class ContaCorrente extends Conta{

    public ContaCorrente(String titular, double saldo, int numeroConta) {
        super(titular, saldo, numeroConta);
    }

    @Override
    public void sacar(double valor) {
        saldo = saldo - valor -5;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("A conta de numero: " + numeroConta + " tem como titular: " + titular + " e o saldo é: " + saldo);
    }

    
}

class ContaPoupanca extends Conta{

    public ContaPoupanca(String titular, double saldo, int numeroConta) {
        super(titular, saldo, numeroConta);
    }

    @Override
    public void sacar(double valor) {
        if (saldo > 0 && saldo >= valor){
            saldo -= valor;
        }else{
            System.out.println("Valor de saque não autorizado");
        }
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("A conta de numero: " + numeroConta + " tem como titular: " + titular + " e o saldo é: " + saldo);
    }

}
