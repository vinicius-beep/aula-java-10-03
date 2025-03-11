/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula3;

/**
 *
 * @author 08199
 */
public class Aula3 {

    public static void main(String[] args) {
        Produto item1 = new Produto(1,"Caneta Bic", 5.99, 10.00);
        System.out.println(item1);
        
        double precoCusto = item1.getPreco();
        System.out.println("Preço de Custo " + precoCusto);
        
        item1.setPreco(precoCusto, 0.45);
        System.out.println(item1);
    }
}
