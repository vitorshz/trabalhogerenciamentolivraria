/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.trabalholivraria.model;

import java.util.ArrayList;

/**
 *
 * @author vitor
 */
public class Cadastro extends Clientes{
    private ArrayList<Clientes> listaClientes = new ArrayList<>();

    public Cadastro() {
    }

    public Cadastro(int cod_cliente, String clienteCpf, String clienteNome, ArrayList<Endereco> enderecos) {
        super(cod_cliente, clienteCpf, clienteNome, enderecos);
    }
    
    public ArrayList<Clientes> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(ArrayList<Clientes> listaClientes) {
        this.listaClientes = listaClientes;
    }
    
}
