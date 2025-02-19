/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula02.tiposdedados;

import java.util.Scanner;

/**
 *
 * @author fic
 */
public class Aula02TiposDeDados {

    public static void main(String[] args) {
        // Criando o scanner = O scanner serve para possibilitar que facamos os inputs
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o seu nome: ");
        String nome = scanner.nextLine();
        
        System.out.print("Digite a sua idade: ");
        int idade = scanner.nextInt();
        
        System.out.print("Digite a sua altura: ");
        float altura = scanner.nextFloat();
        
        System.out.println("Cadastro realizado!");
        System.out.println("Seu nome e: " + nome);
        System.out.println("Sua idade e: " + idade);
        System.out.println("Sua altura e: " + altura);
        scanner.close();
    }
}
