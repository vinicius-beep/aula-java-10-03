/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula5;

/**
 *
 * @author 08199
 */
public class Exercicios {

    public static void main(String[] args) {

        String[] frutas = new String[4];
        frutas[0] = "Maçã";
        frutas[1] = "Pêra";
        frutas[2] = "Uva";
        frutas[3] = "Banana";
       

        for (String fruta : frutas) {
            System.out.println(fruta.toUpperCase());
        }

        for (String fruta : frutas) {
            if (fruta.length() > 5) {
                System.out.println("\n O nome desta fruta tem mais de 5 letras = " + fruta);
            }
        }
        for (int i = 0; i < frutas.length; i++) {
            System.out.print(frutas[i]);
            if (i < frutas.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        String[] lista = {"Caneta: 3.99", "Caderno: 6.79", "Estojo: 35.99", "Canetinha: 22.89"};
        double total = 0;

        for (String item : lista) {
            String[] partes = item.split(": ");
            total += Double.parseDouble(partes[1]);
        }

        System.out.println("Valor total: " + total);
    }
}






