package br.unipar.trabalholivraria.model;

import java.util.ArrayList;

public class Cidade {
    private int codCidade;
    private String nomeCidade;
    private ArrayList<Estado> estados;
    
    public Cidade(){
    }
    
    public Cidade(int codCidade, String nomeCidade, ArrayList<Estado> estados){
        this.codCidade = codCidade;
        this.nomeCidade = nomeCidade;
        this.estados = estados;
    }

    public int getCodCidade() {
        return codCidade;
    }

    public void setCodCidade(int codCidade) {
        this.codCidade = codCidade;
    }

    public String getNomeCidade() {
        return nomeCidade;
    }

    public void setNomeCidade(String nomeCidade) {
        this.nomeCidade = nomeCidade;
    }

    public ArrayList<Estado> getEstados() {
        return estados;
    }

    public void setEstados(ArrayList<Estado> estados) {
        this.estados = estados;
    }

    @Override
    public String toString() {
        return "Cidade{" + "codCidade=" + codCidade + ", nomeCidade=" + nomeCidade + ", estados=" + estados + '}';
    }

}
