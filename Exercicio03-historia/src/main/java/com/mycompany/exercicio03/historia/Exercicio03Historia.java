/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio03.historia;

import java.util.Scanner;

/**
 *
 * @author fic
 */
public class Exercicio03Historia {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Questionario para selecao empregos:");
        
        System.out.print("Digite o nome: ");//1
        String nome = scanner.nextLine();
        
        System.out.print("Digite um ano de nascimento: ");//2
        int anoNascimento = scanner.nextInt();
        
        System.out.print("Digite a cidade de nascimento: ");//3
        String naturalidade = scanner.nextLine();
        
        System.out.print("Digite o cargo pretendido: ");//4
        String cargo = scanner.nextLine();
        
        System.out.print("Digite a distancia da moradia: ");//5
        String distancia = scanner.nextLine();
        
        System.out.print("Digite o ultimo salario: ");//6
        String ultSalario = scanner.nextLine();
        
        System.out.print("Digite o tempo de experiencia: ");//7
        String experiencia = scanner.nextLine();
        
        System.out.print("Digite a rendaFamiliar: ");//8
        String rendaFamiliar = scanner.nextLine();
        
        System.out.print("Digite o numero de pessoas no lar: ");//9
        String pessoasLar = scanner.nextLine();
        
        System.out.print("Digite o ultimo chefe: ");//10
        String chefe = scanner.nextLine();
        
        
        System.out.println();
    }
}
