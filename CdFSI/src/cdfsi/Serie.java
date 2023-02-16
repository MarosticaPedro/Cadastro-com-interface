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
public class Serie extends Pai {
     private String Titulo;
    private String Genero;
    private int Duracao;
    private String Diretor;
    private int Ano;
    private Icon imagem;

    public Serie(String Titulo, String Genero, int Duracao, String Diretor, int Ano, Icon imagem) {
        this.Titulo = Titulo;
        this.Genero = Genero;
        this.Duracao = Duracao;
        this.Diretor = Diretor;
        this.Ano = Ano;
        this.imagem = imagem;
    }

    Serie(String Titulo, String Genero, int Duracao, String Diretor, int Ano) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

 
    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public int getDuracao() {
        return Duracao;
    }

    public void setDuracao(int Duracao) {
        this.Duracao = Duracao;
    }

    public String getDiretor() {
        return Diretor;
    }

    public void setDiretor(String Diretor) {
        this.Diretor = Diretor;
    }

    public int getAno() {
        return Ano;
    }

    public void setAno(int Ano) {
        this.Ano = Ano;
    }

    public Icon getImagem() {
        return imagem;
    }

    public void setImagem(Icon imagem) {
        this.imagem = imagem;
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
