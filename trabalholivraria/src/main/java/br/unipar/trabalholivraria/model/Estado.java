package br.unipar.trabalholivraria.model;

import java.util.ArrayList;

public class Estado {
    private int codEstado;
    private String nomeEstado;
    private String siglaUF;
    private ArrayList<Pais> paises;
    
    public Estado(){
        this.paises = new ArrayList<>();
    }
    
    public Estado(int codEstado, String nomeEstado, String siglaUF, ArrayList<Pais> paises){
        this.codEstado = codEstado;
        this.nomeEstado = nomeEstado;
        this.paises = paises;
        this.siglaUF = siglaUF;
    }

    public int getCodEstado() {
        return codEstado;
    }

    public void setCodEstado(int codEstado) {
        this.codEstado = codEstado;
    }

    public String getNomeEstado() {
        return nomeEstado;
    }

    public void setNomeEstado(String nomeEstado) {
        this.nomeEstado = nomeEstado;
    }

    public String getSiglaUF() {
        return siglaUF;
    }

    public void setSiglaUF(String siglaUF) {
        this.siglaUF = siglaUF;
    }

    public ArrayList<Pais> getPaises() {
        return paises;
    }

    public void setPaises(ArrayList<Pais> paises) {
        this.paises = paises;
    }

    @Override
    public String toString() {
        return "Estado{" + "codEstado=" + codEstado + ", nomeEstado=" + nomeEstado + ", siglaUF=" + siglaUF + ", paises=" + paises + '}';
    }
}

