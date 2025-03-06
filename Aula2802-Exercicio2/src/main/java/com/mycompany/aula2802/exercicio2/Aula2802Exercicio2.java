/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula2802.exercicio2;

import java.util.Scanner;

/**
 *
 * @author fic
 */
public class Aula2802Exercicio2 {

    public static void main(String[] args) {
        Produto produto = new Produto();
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Cadastre nome do produto: ");
        produto.setNome(scanner.nextLine());
        
        System.out.print("Cadastre o preco: ");
        produto.setPreco(scanner.nextDouble());
        
        System.out.print("Cadastre a quantidade: ");
        produto.setQuantidade(scanner.nextInt());
        
        System.out.println("\nCadastro de produto: " + produto.getNome() + "\ncom o preco: " + 
                produto.getPreco() + " e quantidade: " + produto.getQuantidade() + "\nfoi concluido com sucesso!");
        
        System.out.print("\nDigite a quantidade da venda: ");
        produto.vender(scanner.nextInt());
        System.out.println("\nStatus atualizado de produto: " + produto.getNome() + "\ncom o preco: " + 
                produto.getPreco() + " e quantidade: " + produto.getQuantidade() + "\nfoi concluido com sucesso!");
        
        System.out.print("\nDigite a quantidade a ser reabastecida: ");
        produto.reabastecer(scanner.nextInt());
        System.out.println("\nStatus atualizado de produto: " + produto.getNome() + "\ncom o preco: " + 
                produto.getPreco() + " e quantidade: " + produto.getQuantidade() + "\nfoi concluido com sucesso!");
        
        
    }
}

class Produto{
    private String nome;
    private double preco;
    private int quantidade;

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the preco
     */
    public double getPreco() {
        return preco;
    }

    /**
     * @param preco the preco to set
     */
    public void setPreco(double preco) {
        this.preco = preco;
    }

    /**
     * @return the quantidade
     */
    public int getQuantidade() {
        return quantidade;
    }

    /**
     * @param quantidade the quantidade to set
     */
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    public void vender(int qtd){
        if (quantidade < qtd){
            System.out.println("Nao ha estoque suficiente");
        } else{
            this.quantidade -= qtd;
            System.out.println("Venda concluida com sucesso!");
            //System.out.println();
        }
    }
    
    public void reabastecer(int qtd){
        this.quantidade += qtd;
        System.out.println("Reabastecimento concluido com sucesso!");
    }
    
        
}
