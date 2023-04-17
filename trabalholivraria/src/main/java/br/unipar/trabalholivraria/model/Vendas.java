package br.unipar.trabalholivraria.model;

import java.util.ArrayList;

public class Vendas {

    private int cod_Venda;
    private Clientes clientes;
    private ArrayList<Carrinho> Carrinho;
    private ArrayList<Fr_Pagamento> Fr_Pagamento;

    public Vendas() {

        this.Carrinho = new ArrayList<>();
        this.Fr_Pagamento = new ArrayList<>();
    }

    public Vendas(int cod_Venda, Clientes clientes, ArrayList<Carrinho> Carrinho, ArrayList<Fr_Pagamento> Fr_Pagamento) {
        this.cod_Venda = cod_Venda;
        this.clientes = clientes;
        this.Carrinho = Carrinho;
        this.Fr_Pagamento = Fr_Pagamento;
    }

    public int getCod_Venda() {
        return cod_Venda;
    }

    public void setCod_Venda(int cod_Venda) {
        this.cod_Venda = cod_Venda;
    }

    public Clientes getClientes() {
        return clientes;
    }

    public void setClientes(Clientes clientes) {
        this.clientes = clientes;
    }

    public ArrayList<Carrinho> getCarrinho() {
        return Carrinho;
    }

    public void setCarrinho(ArrayList<Carrinho> Carrinho) {
        this.Carrinho = Carrinho;
    }

    public ArrayList<Fr_Pagamento> getFr_Pagamento() {
        return Fr_Pagamento;
    }

    public void setFr_Pagamento(ArrayList<Fr_Pagamento> Fr_Pagamento) {
        this.Fr_Pagamento = Fr_Pagamento;
    }

    @Override
    public String toString() {
        return "Vendas para o" + " cliente " + clientes + 
                "\n Carrinho " + Carrinho + 
                  Fr_Pagamento;
    }

}
