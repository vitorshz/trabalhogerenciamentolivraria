package br.unipar.trabalholivraria.model;

import java.util.ArrayList;

public class Endereco {
    private String nmRua;
    private String dsComplemento;
    private int nrCasa;
    private ArrayList<Cidade> cidades;

    public Endereco() {
        this.cidades = new ArrayList<>();
    }

    public Endereco(String nmRua, String dsComplemento, int nrCasa, ArrayList<Cidade> cidades) {
        this.nmRua = nmRua;
        this.dsComplemento = dsComplemento;
        this.nrCasa = nrCasa;
        this.cidades = cidades;
    }

    public String getNmRua() {
        return nmRua;
    }

    public void setNmRua(String nmRua) {
        this.nmRua = nmRua;
    }

    public String getDsComplemento() {
        return dsComplemento;
    }

    public void setDsComplemento(String dsComplemento) {
        this.dsComplemento = dsComplemento;
    }

    public int getNrCasa() {
        return nrCasa;
    }

    public void setNrCasa(int nrCasa) {
        this.nrCasa = nrCasa;
    }

    public ArrayList<Cidade> getCidades() {
        return cidades;
    }

    public void setCidades(ArrayList<Cidade> cidades) {
        this.cidades = cidades;
    }

    @Override
    public String toString() {
        return "Endereco{" + "nmRua=" + nmRua + ", dsComplemento=" + dsComplemento + ", nrCasa=" + nrCasa + ", cidades=" + cidades + '}';
    }

}
