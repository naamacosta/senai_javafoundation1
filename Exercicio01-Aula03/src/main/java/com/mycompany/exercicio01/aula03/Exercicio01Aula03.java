/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio01.aula03;

import java.util.Scanner;

/**
 *
 * @author fic
 */
public class Exercicio01Aula03 {

    public static void main(String[] args) {
        //System.out.println("Hello World!");
        //Criacao do Scanner para capturar entradas do usuario
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite seu peso em Kgs: ");
        double peso = scanner.nextDouble();
        
        System.out.print("Digite sua altura em metros: ");
        double altura = scanner.nextDouble();
        
        double imc = peso/(altura*altura);
        System.out.println("O seu IMC e: " + imc);
        
        if(imc < 18.5){
            System.out.println("Categoria: Voce esta abaixo do peso");
        }else if (imc >= 18.5 && imc < 24.9){
            System.out.println("Categoria: Voce esta com peso normal");
        }else if(imc >= 25 && imc <29.9){
            System.out.println("Categoria: Voce esta com sobrepeso");
        }else{
            System.out.println("Categoria: Voce esta com obesidade");
    }
        scanner.close();
    }
}
