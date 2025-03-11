/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula3;

/**
 *
 * @author 08199
 */
public class Livro extends Produto{
    private String genero;
    private String autor;
    private int paginas;
    private final int ESTOQUE_MIN = 5;

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
    //exemplo de sobrecarga(OVERLOADING)
    public void setPreco(double preco, double percentual, boolean promocao){
        if(promocao){
            this.preco = this.preco * (1 - percentual);
        }else{
            
        }
    }

    public Livro( int id, String nome, double preco, double estoque,String genero, String autor, int paginas) {
        super(id, nome, preco, estoque);// construtor da classe pai
        this.genero = genero;
        this.autor = autor;
        this.paginas = paginas;
    }
    
    
}
