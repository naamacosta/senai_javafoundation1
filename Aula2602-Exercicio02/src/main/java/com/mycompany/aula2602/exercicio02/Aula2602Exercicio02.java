/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula2602.exercicio02;

import java.util.Scanner;

/**
 *
 * @author fic
 */
public class Aula2602Exercicio02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Carro carro;
        System.out.print("Escolha a operacao desejada: ");
        System.out.println(" 1-Aumenta velocidade, 2-Diminui velocidade, 3-Acende farol, 4-Apaga farol, 5-Encerrar");
        int escolha = scanner.nextInt();
        
        carro = new Carro(2000, "Fusca", "preto");
        
        switch(escolha){
            case 1: carro.aumentaVelocidade(); 
        }
    }
}

class Carro{
    int ano;
    String modelo;
    String cor;
    int velocidade;
    boolean farolAceso;
    
    public Carro(int ano, String modelo, String cor){
        this.ano = ano; this.modelo = modelo;
        this.cor = cor; this. velocidade = 0;
        this.farolAceso = false;
    }
    
    public void aumentaVelocidade() {
        velocidade = velocidade+10;
        System.out.println("Aumentou velocidade!");
        System.out.println("Velocidade atual: " + velocidade);
    }
    
    public void diminuiVelocidade(){
        if(velocidade == 0){
            System.out.println("Carro esta parado!");
        }else{
            velocidade = velocidade -10;
        }
    }
    
    public void acendeFarol(){
        if(farolAceso == true){
            System.out.println("Farol ja esta aceso!");
        }else{
            farolAceso = true;
            System.out.println("Farol esta aceso!");
        }
    }
    
    public void apagaFarol(){
        if(farolAceso == false){
            System.out.println("Farol ja esta apagado!");
        }else{
            farolAceso = false;
            System.out.println("Farol esta apagado!");
        }
    }
}
