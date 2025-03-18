/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula5;

/**
 *
 * @author 08199
 */
public class MaisStrings {
    public static void main(String[] args) {
        String str = "Hello World!";
        StringBuffer sb1 = new StringBuffer("SELECT * FROM clientes");
    sb1.append("\nwhere id = 2");
    
        System.out.println(sb1);
        
        StringBuilder sb2 = new StringBuilder();
        sb2.append("SELECT email, senha FROM ");
        sb2.append("clientes\n");
        sb2.append("WHERE email like eu@gmail.com");
        
        System.out.println(sb2);
        System.out.println(sb2.reverse());
    }
    
    
}
