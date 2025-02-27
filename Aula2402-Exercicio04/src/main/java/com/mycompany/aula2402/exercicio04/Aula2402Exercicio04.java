/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula2402.exercicio04;

import java.util.Scanner;

/**
 *
 * @author fic
 */
public class Aula2402Exercicio04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero para fatoriar: ");
        int fator = scanner.nextInt();
        int fatorial = 0;
        while(fator >= 1){
            fatorial = fator * (fator-1);
            fator--;
        }
        System.out.println("O fatorial e: " + fatorial);
    }
}
