/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula2502.exercicio01;

import java.util.Scanner;

/**
 *
 * @author fic
 */
public class Aula2502Exercicio01 {
    static double taxaDesconto = 0.1;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Produto produto = new Produto();
        
        System.out.print("Digite o nome do produto: ");
        produto.nome = scanner.nextLine();
        
        System.out.print("Digite o preco do produto: ");
        produto.preco = Double.parseDouble(scanner.nextLine());
        
        aplicarDesconto(produto);
        
        System.out.println("Produto: " + produto.nome);
        System.out.println("Preco com desconto: " + produto.preco);
        
        scanner.close();
    }
    
    public static void aplicarDesconto(Produto p){
        p.preco -= p.preco * taxaDesconto;
    }
}

class Produto{
    String nome;
    double preco;
}
