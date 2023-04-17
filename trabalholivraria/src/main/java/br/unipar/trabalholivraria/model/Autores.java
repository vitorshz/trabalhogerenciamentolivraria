
package br.unipar.trabalholivraria.model;


public class Autores {
    private int cod_autor;
    private String nmAutor;

    public Autores() {
    }

    public Autores(int cod_autor, String nmAutor) {
        this.cod_autor = cod_autor;
        this.nmAutor = nmAutor;
    }

    public int getCod_autor() {
        return cod_autor;
    }

    public void setCod_autor(int cod_autor) {
        this.cod_autor = cod_autor;
    }

    public String getNmAutor() {
        return nmAutor;
    }

    public void setNmAutor(String nmAutor) {
        this.nmAutor = nmAutor;
    }

    @Override
    public String toString() {
        return "Autores{" + "cod_autor=" + cod_autor + ", nmAutor=" + nmAutor + '}';
    }
    
    
  
    
}
