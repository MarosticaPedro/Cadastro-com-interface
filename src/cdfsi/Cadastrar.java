package cdfsi;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Cadastrar extends Pai {

    private final ArrayList<Filme> listaF = new ArrayList<Filme>();
    private final ArrayList<Serie> listaS = new ArrayList<Serie>();

    public void InsereF(Filme entidade) {
        listaF.add(entidade);
    }

    public void InsereS(Serie entidade) {
        listaS.add(entidade);
    }
//lista filme

    public String listarF() {
        String txt = "";
        int cd = 1;
        for (Filme filme : listaF) {
            if (filme instanceof Filme) {
                txt += "Codigo do filme: " + cd + " Titulo: " + filme.getTitulo() + " Genero: " + filme.getGenero()
                        + " Duração: " + filme.getDuracao() + " Diretor: " + filme.getDiretor()
                        + " Ano de Lançamento: " + filme.getAno() + "\n";
                cd++;

            }
        }
        return txt;
    }
//lista serie

    public String listarS() {
        String txt = "";
        int cd = 99;
        for (Serie serie : listaS) {
            if (serie instanceof Serie) {
                txt += "Codigo da Serie: " + cd + " Titulo: " + serie.getTitulo() + " Genero: " + serie.getGenero()
                        + " Duração: " + serie.getDuracao() + " Diretor: " + serie.getDiretor()
                        + " Ano de Lançamento: " + serie.getAno() + "\n";
                cd++;

            }
        }
        return txt;
    }
//lista filme e serie

    public String listarT() {
        String txt = "";

        int cdF = 1;
        for (Filme filme : listaF) {
            if (filme instanceof Filme) {
                txt += "Codigo do filme: " + cdF + " Titulo: " + filme.getTitulo() + " Genero: " + filme.getGenero()
                        + " Duração: " + filme.getDuracao() + " Diretor: " + filme.getDiretor()
                        + " Ano de Lançamento: " + filme.getAno() + "\n";
                cdF++;

            }
        }

        int cdS = 1;
        for (Serie serie : listaS) {
            if (serie instanceof Serie) {
                txt += "Codigo da Serie: " + cdS + " Titulo: " + serie.getTitulo() + " Genero: " + serie.getGenero()
                        + " Duração: " + serie.getDuracao() + " Diretor: " + serie.getDiretor()
                        + " Ano de Lançamento: " + serie.getAno() + "\n";
                cdS++;

            }
        }
        return txt;

    }
//visualiza filme

    public String vFilme(int id) {
        id--;
        return listaF.get(id).toString();
    }
//visualiza serie

    public String vSerie(int id) {
        id--;
        return listaS.get(id).toString();
    }
//remove filme

    public void removeF(int id) {
        id--;
        listaF.remove(id);
    }
//remove serie

    public void removeS(int id) {
        id--;
        listaS.remove(id);
    }
//edita filme
    
    public void editF(int id){
        id--;
        
        String Titulo =  JOptionPane.showInputDialog("Digite o novo titulo: ");
        String Genero = JOptionPane.showInputDialog("Digite o novo genero: ");
        int Duracao =  Integer.parseInt(JOptionPane.showInputDialog("Digite a nova duracao: "));
        String Diretor =  JOptionPane.showInputDialog("Digite o novo diretor: ");
        int Ano =  Integer.parseInt(JOptionPane.showInputDialog("Digite O novo ano de lançamento: "));
        
        Filme filme = new Filme(Titulo, Genero, Duracao, Diretor, Ano);
        listaF.remove(id);
        listaF.add(id,filme);
    }
//edita serie
    
    public void editS(int id){
        id--;
        
        String Titulo =  JOptionPane.showInputDialog("Digite o novo titulo: ");
        String Genero = JOptionPane.showInputDialog("Digite o novo genero: ");
        int Duracao =  Integer.parseInt(JOptionPane.showInputDialog("Digite a nova duracao: "));
        String Diretor =  JOptionPane.showInputDialog("Digite o novo diretor: ");
        int Ano =  Integer.parseInt(JOptionPane.showInputDialog("Digite O novo ano de lançamento: "));
        
        Serie serie = new Serie(Titulo, Genero, Duracao, Diretor, Ano);
        listaS.remove(id);
        listaS.add(id,serie);
    }
    
    
    @Override
    public String toString() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
