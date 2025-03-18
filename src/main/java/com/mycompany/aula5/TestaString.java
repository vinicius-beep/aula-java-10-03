/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula5;

/**
 *
 * @author 08199
 */
public class TestaString {
    public static void main(String[] args) {
        String nome = "Antonio";
        String sobrenome = "Alves";
        //Concatenar strings
        String nomeCompleto = nome +" "+ sobrenome;
        System.out.println(nomeCompleto);
        
        String str = nome.concat(" ").concat(sobrenome);
        System.out.println(str);
                
        //Tamanho da String
        int s = nomeCompleto.length();
        System.out.println(s);
        
        //Qual caractere está na posição 2
        char c = nome.charAt(0);
        System.out.println(c);
        
        //Copia uma parte string
        String email = "antonio@duque.g12.br";
        String dominio = email.substring(7,20);
        System.out.println(dominio);
        
        // Maisculas e minusculas
        System.out.println(email.toUpperCase());
        System.out.println(email.toLowerCase());
        
        //remove espaços em branco
        String cpf = "   000.330.220-55  ";
        System.out.println(cpf.trim());
        
        System.out.println(email.indexOf('#'));
        
        String txtPreco = "R$ 14,95";
        System.out.println(txtPreco.replace(",","."));
        
        System.out.println("Todos".replace('o', 'e'));
        
        String verso = "Ouviram do Ipiranga ás margens plácidas\n"
                + "De um povo heróico o brado retumbante\n"
                + "E o sol da liberdade em raios fugidos\n"
                + "Brilhou no céu da pátria nesse instante\n";
        
        System.out.println(verso);
        
        //usando a função substring
        String arquivo = "c:/fotos/img001.jpg";
        String pasta = arquivo.substring(0,9);
        System.out.println("Pasta: "+ pasta);
        int start = arquivo.indexOf(".");
        int end = arquivo.length();
        String extensao = arquivo.substring(start, end);
        System.out.println("Extensão: " + extensao);
        
        
    }
}
    

