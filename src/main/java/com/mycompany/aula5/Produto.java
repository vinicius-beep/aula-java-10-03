/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula3;

/**
 *
 * @author 08199
 */
public class Produto {
    private int id;
    private String nome;
    protected double preco;
    private double estoque;
    private final int ESTOQUE_MIN = 3;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getEstoque() {
        return estoque;
    }

    public void setEstoque(double estoque) {
        this.estoque = estoque;
    }
    
    /**
     * 
     * @param preco
     * @param lucro 
     * Para o lucro digite um valor entre 001 e 0.09
     */
    
    
    public void setPreco(double preco, double lucro){
        this.preco = preco * (1 + lucro);
        
        
    }

    public Produto() {
    }

    public Produto(int id, String nome, double preco, double estoque) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    @Override
    public String toString() {
        return this.id+" - "+this.nome+"\n"+"R$ "+ this.preco;
    }
    
    
}
