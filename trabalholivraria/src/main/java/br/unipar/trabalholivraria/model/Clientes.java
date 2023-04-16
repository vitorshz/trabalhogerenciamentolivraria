package br.unipar.trabalholivraria.model;

import java.util.ArrayList;

public class Clientes {
    private String clienteCpf;
    private String clienteNome;
    private ArrayList<Endereco> enderecos;
    
    public Clientes(){
        this.enderecos = new ArrayList<>();
    }
    
    public Clientes(String clienteCpf, String clienteNome, ArrayList<Endereco> enderecos){
        this.clienteCpf = clienteCpf;
        this.clienteNome = clienteNome;
        this.enderecos = enderecos;
    }

    public String getClienteCpf() {
        return clienteCpf;
    }

    public void setClienteCpf(String clienteCpf) {
        this.clienteCpf = clienteCpf;
    }

    public String getClienteNome() {
        return clienteNome;
    }

    public void setClienteNome(String clienteNome) {
        this.clienteNome = clienteNome;
    }

    public ArrayList<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(ArrayList<Endereco> enderecos) {
        this.enderecos = enderecos;
    }

    @Override
    public String toString() {
        return "Clientes{" + "clienteCpf=" + clienteCpf + ", clienteNome=" + clienteNome + ", enderecos=" + enderecos + '}';
    }

}
