package br.unipar.trabalholivraria.model;
public class Livraria {
    private int cod_Livraria;
    private String cnpj_Livraria;

    public Livraria() {
    }

    public Livraria(int cod_Livraria, String cnpj_Livraria) {
        this.cod_Livraria = cod_Livraria;
        this.cnpj_Livraria = cnpj_Livraria;
    }

    public int getCod_Livraria() {
        return cod_Livraria;
    }

    public void setCod_Livraria(int cod_Livraria) {
        this.cod_Livraria = cod_Livraria;
    }

    public String getCnpj_Livraria() {
        return cnpj_Livraria;
    }

    public void setCnpj_Livraria(String cnpj_Livraria) {
        this.cnpj_Livraria = cnpj_Livraria;
    }

    @Override
    public String toString() {
        return "Livraria{" + "cod_Livraria=" + cod_Livraria + ", cnpj_Livraria=" + cnpj_Livraria + '}';
    }
   
    
    
}
