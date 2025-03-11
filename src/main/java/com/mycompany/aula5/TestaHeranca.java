/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula3;

/**
 *
 * @author 08199
 */
public class TestaHeranca {
    public static void main(String[] args){
        Livro livro1 = new Livro(12, "Harry Potter", 497.95, 12, "Fantasia", "J. K. Rowling", 1911);
        System.out.println(livro1);
        
        
        Livro livro3 = new Livro(15, "boot", 89.90, 15, "informatica", "eduardo", 101);
        
        livro3.setPreco(100, 0.15, false);
        System.out.println(livro3);
        
        livro3.setPreco(100, 0.15, true);
        System.out.println(livro3);
        
        Produto prod1 = new Produto(16, "Cadeira Gamer", 1300, 15);
        
        Carrinho carrinho = new Carrinho();
        carrinho.adicionarItem(prod1);
        carrinho.adicionarItem(livro1);
        carrinho.adicionarItem(livro3);
        
        
    }
}
