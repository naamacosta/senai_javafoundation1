/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula2602.exercicio01;

import java.util.Scanner;

/**
 *
 * @author fic
 */
public class Aula2602Exercicio01 {

    public static void main(String[] args) {
        //System.out.println("Hello World!");
        Scanner scanner = new Scanner(System.in);
        Calculadora calc;
        int operac = 1;
        while(operac != 5){
        
        System.out.print("Digite o primeiro numero: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Digite o segundo numero: ");
        double num2 = scanner.nextDouble();
        
        System.out.println("Escolha a operacao que deseja efetuar:");
        System.out.println(" 1-Somar, 2-Subtrair, 3-Multiplicar, 4-Dividir, 5-Encerrar");
        operac = scanner.nextInt();
        
        calc = new Calculadora(num1, num2);
        
        switch(operac){
            case 1: calc.somar(); calc.exibirResultado("soma"); break;
            case 2: calc.subtrair(); calc.exibirResultado("subtracao"); break;
            case 3: calc.multiplicar(); calc.exibirResultado("multiplicacao"); break;
            case 4: calc.dividir(); calc.exibirResultado("dividir"); break;
        }
        }
        scanner.close();
        /*
        calc.somar();
        calc.exibirResultado("soma");
        
        calc.subtrair();
        calc.exibirResultado("subtracao");
        
        calc.multiplicar();
        calc.exibirResultado("multiplicação");
        
        calc.dividir();
        calc.exibirResultado("divisao");
*/
    }
}

class Calculadora{
    double numero1;
    double numero2;
    double resultado;
    
    public Calculadora(double numero1, double numero2){
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    
    public void somar(){
        resultado = numero1 + numero2;
    }
    
    public void subtrair(){
        resultado = numero2 - numero1;
    }
    
    public void multiplicar(){
        resultado = numero1 * numero2;
    }
    
    public void dividir(){
        if(numero2 !=0 || numero1 !=0){
            resultado = numero1 / numero2;
        }else{
        resultado = Double.NaN;
        System.out.println("Erro: divisao por zero nao e permitida");
        }
    }
    
    public void exibirResultado(String operacao){
        System.out.println("Resultado da " + operacao + ":" + resultado);
    }
}