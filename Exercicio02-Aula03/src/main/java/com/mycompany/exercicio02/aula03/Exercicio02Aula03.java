/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio02.aula03;

import java.util.Scanner;

/**
 *
 * @author fic
 */
public class Exercicio02Aula03 {

    public static void main(String[] args) {
        //System.out.println("Hello World!");
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um numero: ");
        int digitado = scanner.nextInt();
        double resto = digitado%2;
        if(resto==0){
            System.out.println("Este numero e par");
        }else{
            System.out.println("Este numero e impar");
        }
    }
}
