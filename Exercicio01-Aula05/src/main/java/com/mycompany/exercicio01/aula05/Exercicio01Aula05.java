/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio01.aula05;

import java.util.Scanner;

/**
 *
 * @author fic
 */
public class Exercicio01Aula05 {

    public static void main(String[] args) {
        System.out.print("Informe o valor da compra: ");
        Scanner scanner = new Scanner(System.in);
        double valor = scanner.nextDouble();
        double valorf = 0;
        if (valor > 500){
            valorf = valor * 0.9;
        }else if(valor >= 200 && valor <= 500){
            valorf = valor * 0.95;
        }else if(valor < 200){
            valorf = valor;
        }
        System.out.println("O valor final com desconto e: " + valorf);
    }
}
