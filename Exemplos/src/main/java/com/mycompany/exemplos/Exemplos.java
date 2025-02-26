/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exemplos;

/**
 *
 * @author fic
 */
class Exemplos {
    private static int variavelEstatica = 100;
    private int variavelInstacia = 50;
    
    public void metodoLocal(){
        int variavelLocal = 10;
        System.out.println("Variavel local: " + variavelLocal);
    }
    public static void main(String[] args) {
        Exemplos exemplo = new Exemplos();
        exemplo.metodoLocal();
        System.out.println("Variavel de instancia: " + exemplo.variavelInstacia);
        System.out.println("Variavel estatica: " + variavelEstatica);
    }
}
