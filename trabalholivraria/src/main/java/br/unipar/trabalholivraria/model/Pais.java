package br.unipar.trabalholivraria.model;

public class Pais {
    private int codPais;
    private String nomePais;
    private String siglaPais;

    public Pais() {
    }

    public Pais(int codPais, String nomePais, String siglaPais) {
        this.codPais = codPais;
        this.nomePais = nomePais;
        this.siglaPais = siglaPais;
    }

    public int getCodPais() {
        return codPais;
    }

    public void setCodPais(int codPais) {
        this.codPais = codPais;
    }

    public String getNomePais() {
        return nomePais;
    }

    public void setNomePais(String nomePais) {
        this.nomePais = nomePais;
    }

    public String getSiglaPais() {
        return siglaPais;
    }

    public void setSiglaPais(String siglaPais) {
        this.siglaPais = siglaPais;
    }

    @Override
    public String toString() {
        return "Pais{" + "codPais=" + codPais + ", nomePais=" + nomePais + ", siglaPais=" + siglaPais + '}';
    }
    
}
