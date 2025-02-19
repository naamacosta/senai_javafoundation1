/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio03.aula03;

import java.util.Scanner;

/**
 *
 * @author fic
 */
public class Exercicio03Aula03 {

    public static void main(String[] args) {
        //System.out.println("Hello World!");
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a nota: ");
        
        int digitado = scanner.nextInt();
        
        if (digitado >=9 && digitado <=10){
            System.out.println("A nota e A");
        }else if(digitado >=7 && digitado <= 8){
            System.out.println("A nota e B");
        }else if (digitado >= 5 && digitado <= 6){
            System.out.println("A nota e C");
        }else if (digitado >= 3 && digitado <= 4){
            System.out.println("A nota e D");
        }else if (digitado >= 0 && digitado <= 2){
            System.out.println("A nota e E");
        }else{
            System.out.println("A nota digitada e invalida");
        }
    }
}
