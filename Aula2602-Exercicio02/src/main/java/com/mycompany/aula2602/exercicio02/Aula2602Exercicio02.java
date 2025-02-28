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
        Carro carro = new Carro(2000, "Fusca", "preto"); 
        int escolha = 0;
        
        while(escolha != 5){
        System.out.println("Escolha a operacao desejada: ");
        System.out.println(" 1-Aumenta velocidade, 2-Diminui velocidade, 3-Acende farol, 4-Apaga farol, 5-Encerrar");
        escolha = scanner.nextInt();
                        
        switch(escolha){
            case 1: carro.aumentaVelocidade(); break;
            case 2: carro.diminuiVelocidade(); break;
            case 3: carro.acendeFarol(); break;
            case 4: carro.apagaFarol(); break;
            case 5: break;
        }
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
        this.cor = cor; this.velocidade = 0;
        this.farolAceso = false;
    }
    
    public void aumentaVelocidade() {
        this.velocidade = this.velocidade+10;
        System.out.println("Aumentou velocidade!");
        System.out.println("Velocidade atual: " + this.velocidade + "\n");
    }
    
    public void diminuiVelocidade(){
        if(this.velocidade == 0){
            System.out.println("Carro esta ja parado!\n");
        }else if(this.velocidade == 10){
            System.out.println("Carro esta parado!\n");
        }else{
            this.velocidade = this.velocidade -10;
            System.out.println("Velocidade atual: " + this.velocidade + "\n");
        }
    }
    
    public void acendeFarol(){
        if(this.farolAceso == true){
            System.out.println("Farol ja esta aceso!\n");
        }else{
            this.farolAceso = true;
            System.out.println("Farol esta aceso!\n");
        }
    }
    
    public void apagaFarol(){
        if(this.farolAceso == false){
            System.out.println("Farol ja esta apagado!\n");
        }else{
            this.farolAceso = false;
            System.out.println("Farol esta apagado!\n");
        }
    }
}
