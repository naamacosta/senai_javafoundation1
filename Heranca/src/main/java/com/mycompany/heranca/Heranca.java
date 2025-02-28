/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.heranca;

/**
 *
 * @author fic
 */
public class Heranca {

    public static void main(String[] args) {
        Carro carro = new Carro("Toyota", "Corolla", 2020, 4);
        Moto moto = new Moto("Honda", "CB 500", 2019, 500);
        
        System.out.println("Detalhes do carro: ");
        carro.exibirDetalhes();
        
        System.out.println("\n\nDetalhes da moto: ");
        moto.exibirDetalhes();
    }
}

class Veiculo{
    protected int ano;
    protected String modelo;
    protected String marca;
    
    public Veiculo(String marca, String modelo, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }
    
    public void exibirDetalhes(){
        System.out.print("Marca: " + marca + ", Modelo: " + modelo + ", Ano: " + ano);
    }    
}

class Carro extends Veiculo{
    private int qtdPortas;
    
    public Carro(String marca, String modelo, int ano, int qtdPortas) {
        super(marca, modelo, ano);
        this.qtdPortas = qtdPortas;
    }
    
    @Override
    public void exibirDetalhes(){
        System.out.print("Marca: " + marca + ", Modelo: " + modelo + ", Ano: " + ano + ", Qtd de Portas: " + qtdPortas);
    }
}

class Moto extends Veiculo{
    private int cilindradas;
    
    public Moto(String marca, String modelo, int ano, int cilindradas) {
        super(marca, modelo, ano);
        this.cilindradas = cilindradas;
    }
    
    @Override
    public void exibirDetalhes(){
        System.out.print("Marca: " + marca + ", Modelo: " + modelo + ", Ano: " + ano + ", Qtd de cilindradas: " + cilindradas);
    }
}