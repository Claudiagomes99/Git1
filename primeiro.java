/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project2;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class primeiro {
    public static void main (String[] args){
        //Projeto novo dados primitivos
        byte tempo = 8; // Armazena horarios (numeros pequenos )
        short quantidade = 200; // Armazena quantidades (numeros maiores)
        int populacaocondominio = 600; // Armazena tipos comum de numero inteiro
        long populacaocidade = 20000; // Armazena numeros longos
        
        float largura = 90f; // Necessita 'f' para float ( metros)
        double peso = 70; // Mais preciso que o float
        
        char inicial = 'c'; // Armazena um único caracter 
        boolean ativo = true; // Armazena verdadeiro ou falso
        
        
        //Exibição dos valores 
        System.out.println("Tempo" + tempo);
        System.out.println("Quantidade" + quantidade);
        System.out.println("População do condominio" + populacaocondominio);
        System.out.println("população da cidade" + populacaocidade);
        System.out.println("Largura" + largura);
        System.out.println("Peso" + peso);
        System.out.println("Inicial"+ inicial);
        System.out.println("Ativo" + ativo);
    }
}
   
