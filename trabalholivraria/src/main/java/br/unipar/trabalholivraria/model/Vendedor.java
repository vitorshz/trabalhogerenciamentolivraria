package br.unipar.trabalholivraria.model;
import  br.unipar.trabalholivraria.model.Livraria;
public class Vendedor {
        private int cod_usuario;
        
        private String nome_Vendedor;
        private String cpf_Vendedor;
        private Livraria livraria;

    public Vendedor() {
    }

    public Vendedor(int cod_usuario, String nome_Vendedor, String cpf_Vendedor, Livraria livraria) {
        this.cod_usuario = cod_usuario;
        this.nome_Vendedor = nome_Vendedor;
        this.cpf_Vendedor = cpf_Vendedor;
        this.livraria = livraria;
    }

    public int getCod_usuario() {
        return cod_usuario;
    }

    public void setCod_usuario(int cod_usuario) {
        this.cod_usuario = cod_usuario;
    }

    public String getNome_Vendedor() {
        return nome_Vendedor;
    }

    public void setNome_Vendedor(String nome_Vendedor) {
        this.nome_Vendedor = nome_Vendedor;
    }

    public String getCpf_Vendedor() {
        return cpf_Vendedor;
    }

    public void setCpf_Vendedor(String cpf_Vendedor) {
        this.cpf_Vendedor = cpf_Vendedor;
    }

    public Livraria getLivraria() {
        return livraria;
    }

    public void setLivraria(Livraria livraria) {
        this.livraria = livraria;
    }

    @Override
    public String toString() {
        return "Vendedor{" + "cod_usuario=" + cod_usuario + ", nome_Vendedor=" + nome_Vendedor + ", cpf_Vendedor=" + cpf_Vendedor + ", livraria=" + livraria + '}';
    }
    

    
        
            
}
