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
private static List<Conta> contas = new ArrayList<>();
//Banco banco = new Banco(1);
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int escolha = 0;
        
        while (escolha != 5){
        System.out.println("Escolha a opcao desejada:\n1-Criar Conta\n2-Depositar\n3-Sacar\n4-Exibir conta\n5-Sair");
        escolha = scanner.nextInt();
        switch (escolha){
            case 1: criarConta(); break;
            case 2: depositar(); break;
            case 3: sacar(); break;
            case 4: System.out.println("Informe a conta para exibir informacaoes:"); buscar(scanner.nextInt()); break;
            case 5: break;
        }
        
        }
        System.out.println("Obrigado por usar o sistema!");
    }
//}
//    class Banco{
//        List<Conta> contas = new ArrayList<>();
//    
        
     public static void criarConta(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do titular: ");
        String titular = scanner.nextLine();
        
        System.out.print("Digite 1-Conta corrente ou 2-Conta poupanca ");
        int tipoConta = scanner.nextInt();
        
        switch(tipoConta){
            case 1: contas.add(new ContaCorrente(titular, 0, 1)); break;
            case 2: contas.add(new ContaPoupanca(titular, 0, 1)); break;
            default: System.out.println("Opção invalida");
        }
    }
     
     public static void depositar(){
         Scanner scanner = new Scanner(System.in);
         System.out.print("Digite a conta para deposito: ");
         int numeroConta = scanner.nextInt();
         System.out.print("\nDigite o valor para deposito: ");
         double valorDeposito = scanner.nextDouble();
         
         contas.get(numeroConta).depositar(valorDeposito);
     }
     
     public static void sacar(){
         Scanner scanner = new Scanner(System.in);
         System.out.print("Digite a conta para saque: ");
         int numeroConta = scanner.nextInt();
         System.out.print("\nDigite o valor para saque: ");
         double valorDeposito = scanner.nextDouble();
         
         contas.get(numeroConta).sacar(valorDeposito);
     }
     
     public static void buscar(int numeroConta){
         contas.get(numeroConta).exibirInformacoes();
         
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
        saldo = saldo + valor;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("A conta de numero: " + numeroConta + " tem como titular: " + titular + " e o saldo é: " + saldo);
    }

}
