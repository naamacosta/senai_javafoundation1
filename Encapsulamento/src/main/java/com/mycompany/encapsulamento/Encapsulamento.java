/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.encapsulamento;

/**
 *
 * @author fic
 */
public class Encapsulamento {

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        conta.setTitular("João Silva");
        System.out.println("Titular: " + conta.getTitular());

        conta.depositar(500);
        System.out.println("Saldo atual: R$" + conta.getSaldo());

        conta.sacar(200);
        System.out.println("Saldo após saque: R$" + conta.getSaldo());

        conta.sacar(400); // Tentativa de saque maior que o saldo
            }
}

class ContaBancaria{
    private String titular;
    private double saldo;
    
    public void setTitular(String titular){
        this.titular = titular;
    }
    
    public String getTitular(){
        return titular;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    public void depositar(double valor){
        if (valor > 0){
            saldo += valor;
            System.out.println("Deposito de R$" + valor + " realizado com sucesso");
        }else{
            System.out.println("Valor invalido para deposito");
        }
    }
    
    public void sacar(double valor){
        if (valor > 0 && saldo >= valor){
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso");
        }else{
            System.out.println("Saldo insuficiente ou valor invalido");
        }
    }
}
