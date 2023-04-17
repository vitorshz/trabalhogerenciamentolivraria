package br.unipar.trabalholivraria.model;

import java.util.ArrayList;

public class Carrinho {

    private int cod_carrinho;
    private Livros livros;
    private int qtdVenda;
    private double vlPrecoUnitario;
    private double vlTotal;
    private double vlDescontdo;

    public Carrinho() {

    }

    public Carrinho(int cod_carrinho, Livros livros, int qtdVenda, double vlPrecoUnitario, double vlTotal, double vlDescontdo) {
        this.cod_carrinho = cod_carrinho;
        this.livros = livros;
        this.qtdVenda = qtdVenda;
        this.vlPrecoUnitario = vlPrecoUnitario;
        this.vlTotal = vlTotal;
        this.vlDescontdo = vlDescontdo;
    }

    public int getCod_carrinho() {
        return cod_carrinho;
    }

    public void setCod_carrinho(int cod_carrinho) {
        this.cod_carrinho = cod_carrinho;
    }

    public Livros getLivros() {
        return livros;
    }

    public void setLivros(Livros livros) {
        this.livros = livros;
    }

    public int getQtdVenda() {
        return qtdVenda;
    }

    public void setQtdVenda(int qtdVenda) {
        this.qtdVenda = qtdVenda;
        this.vlTotal = (this.vlPrecoUnitario - vlDescontdo) * this.qtdVenda;

    }

    public double getVlPrecoUnitario() {
        return vlPrecoUnitario;
    }

    public void setVlPrecoUnitario(double vlPrecoUnitario) {
        this.vlPrecoUnitario = vlPrecoUnitario;
        this.vlTotal = (this.vlPrecoUnitario - vlDescontdo) * this.qtdVenda;
    }

    public double getVlTotal() {
        return vlTotal;
    }

    public void setVlTotal(double vlTotal) {
        this.vlTotal = vlTotal;

    }

    public double getVlDescontdo() {
        return vlDescontdo;
    }

    public void setVlDescontdo(double vlDescontdo) {
        this.vlDescontdo = vlDescontdo;
    }

    @Override
    public String toString() {
        return getLivros().getTituloLivro()
                + "\n qtdComprada= " + qtdVenda
                + "\n vlPrecoUnitario= " + vlPrecoUnitario
                + "\n vlDesconto " + vlDescontdo
                + "\n vlTotal= " + vlTotal;
    }

}
