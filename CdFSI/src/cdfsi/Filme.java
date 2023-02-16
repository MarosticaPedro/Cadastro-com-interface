/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cdfsi;

import javax.swing.Icon;

/**
 *
 * @author phalm
 */
public class Filme extends Pai {
   
    private String Titulo;
    private String Genero;
    private int Duracao;
    private String Diretor;
    private int Ano;
    private Icon imagem;

    public Filme(String Titulo, String Genero, int Duracao, String Diretor, int Ano, Icon imagem) {
        this.Titulo = Titulo;
        this.Genero = Genero;
        this.Duracao = Duracao;
        this.Diretor = Diretor;
        this.Ano = Ano;
        this.imagem = imagem;
    }

   public Filme(String Titulo, String Genero, int Duracao, String Diretor, int Ano) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Icon getImagem() {
        return imagem;
    }

    public void setImagem(Icon imagem) {
        this.imagem = imagem;
    }
    
    
    
    


    public String getTitulo() {
        return Titulo;
    }




    public void setTitulo(String titulo) {
        Titulo = titulo;
    }




    public String getGenero() {
        return Genero;
    }




    public void setGenero(String genero) {
        Genero = genero;
    }




    public int getDuracao() {
        return Duracao;
    }




    public void setDuracao(int duracao) {
        Duracao = duracao;
    }




    public String getDiretor() {
        return Diretor;
    }




    public void setDiretor(String diretor) {
        Diretor = diretor;
    }




    public int getAno() {
        return Ano;
    }




    public void setAno(int ano) {
        Ano = ano;
    }




    @Override
    public String toString() {
        String retorno = "\n";
        retorno += "Titulo: " + this.Titulo + "\n";
        retorno += "Gênero: " + this.Genero + "\n";
        retorno += "Duração: " + this.Duracao + " minutos\n ";
        retorno += "Diretor: " + this.Diretor + "\n";
        retorno += "Ano de Lançamento: " + this.Ano + "\n";
        

        return retorno;
    }
    
 


    
}
