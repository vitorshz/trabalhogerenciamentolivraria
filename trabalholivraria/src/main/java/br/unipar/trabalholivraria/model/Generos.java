
package br.unipar.trabalholivraria.model;


public class Generos {
    private int cod_generos;
    private String dsGeneros;

    public Generos() {
    }
    public Generos(int cod_generos, String dsGeneros){
        this.cod_generos = cod_generos;
        this.dsGeneros = dsGeneros;
    }
    
    public void setCod_generos(int cod_generos){
        this.cod_generos = cod_generos;
    }
    public int getCod_generos(){
        return this.cod_generos;
    }
    public void setDsGeneros(String dsGeneros){
        this.dsGeneros = dsGeneros;
    }
    public String getDsGeneros(){
        return this.dsGeneros;
    }

    @Override
    public String toString() {
        return "Generos{" + "cod_generos=" + cod_generos + ", dsGeneros=" + dsGeneros + '}';
    }
    
}
