/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula2502.exercicio02;

/**
 *
 * @author fic
 */
public class Aula2502Exercicio02 {
    private static int contador = 0;
    
    public static void incrementarContador(){
        contador++;
    }

    public static void main(String[] args) {
        incrementarContador(); //1
        incrementarContador(); //2
        incrementarContador(); //3
        incrementarContador(); //4
        incrementarContador(); //5
        
        System.out.println("O contador esta em: " + contador);
    }
}
