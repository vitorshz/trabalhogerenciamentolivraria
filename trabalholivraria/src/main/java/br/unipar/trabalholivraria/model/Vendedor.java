package br.unipar.trabalholivraria.model;
import  br.unipar.trabalholivraria.model.Livraria;
public class Vendedor {
        private int cod_usuario;
        
        private String nome;
        private String cpf;
        private Livraria livraria;

    public Vendedor() {
    }

    public Vendedor(int cod_usuario, String nome, String cpf, Livraria livraria) {
        this.cod_usuario = cod_usuario;
        this.nome = nome;
        this.cpf = cpf;
        this.livraria = livraria;
    }
    

    public int getCod_usuario() {
        return cod_usuario;
    }

    public void setCod_usuario(int cod_usuario) {
        this.cod_usuario = cod_usuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Livraria getLivraria() {
        return livraria;
    }

    public void setLivraria(Livraria livraria) {
        this.livraria = livraria;
    }
        
        
            
}
