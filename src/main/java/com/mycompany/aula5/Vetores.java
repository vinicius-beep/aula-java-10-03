/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula5;

/**
 *
 * @author 08199
 */
public class Vetores {
    public static void main(String[] args) {
        double [] medias = {80, 85, 90, 75, 80, 70, 65};
        String [] alunos = {"João", "Maria", "Eliza", "Vitor", "Neide"};
        //System.out.println("O segundo aluno é: + alunos[1]");
        //System.out.println("A segunda média é"+ medias[1]);
        
        for(int i = 0; i<medias.length; i++){
            System.out.println("Media "+ (i+1) +" = "+medias[i]);
        }
        
        double soma = 0;
        int tamanho = medias.length;
        
        for(int i = 0; i<medias.length; i++){
            soma = soma + medias[i];
        }
        
        double mediaFinal = soma/tamanho;
        System.out.println("Media final:" + mediaFinal);
        
        String [] cidades = new String[5];
        cidades[0] = "Sapiranga";
        cidades[1] = "Campo bom";
        cidades[2] = "Nova hartz";
        cidades[3] = "Parobé";
        cidades[4] = "Taquara";
        
        int[][] tabuleiro = new int[3][3];
        tabuleiro[0][0] = 1;
        tabuleiro[0][1] = 0;
        tabuleiro[0][2] = 4;
        
        tabuleiro[1][0] = 7;
        tabuleiro[1][1] = 3;
        tabuleiro[1][2] = 0;
        
        tabuleiro[2][0] = 9;
        tabuleiro[2][1] = 6;
        tabuleiro[2][2] = 4;
        
        for(int i=0; i<3; i++){
            System.out.println("\n");
            for(int c = 0; c < 3; c++){
                System.out.println(tabuleiro[i][c]);
                
            }
    }
        
        
        
        
        
    }
    
}
