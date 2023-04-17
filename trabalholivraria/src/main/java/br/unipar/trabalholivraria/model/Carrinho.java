package br.unipar.trabalholivraria.model;

import java.util.ArrayList;

public class Carrinho {

    private int cod_carrinho;
    private ArrayList<Livros> Livros = new ArrayList<>();
    private int qtdVenda;
    private double vlPrecoUnitario;
    private double vlTotal;
    private double vlDescontdo;

    

    public Carrinho() {
        this.Livros = new ArrayList<>();
    }

    public Carrinho(int cod_carrinho, int qtdVenda, double vlPrecoUnitario, double vlTotal,double vlDescontdo, ArrayList<Livros> Livros) {
        this.cod_carrinho = cod_carrinho;
        this.qtdVenda = qtdVenda;
        this.vlPrecoUnitario = vlPrecoUnitario;
        this.vlTotal = vlTotal;
        this.vlDescontdo = vlDescontdo;
        this.Livros = new ArrayList<>();
    }
    
    public int getCod_carrinho() {
        return cod_carrinho;
    }

    public void setCod_carrinho(int cod_carrinho) {
        this.cod_carrinho = cod_carrinho;
    }
    
    public ArrayList<Livros> getLivros() {
        return Livros;
    }

    public void setLivros(ArrayList<Livros> Livros) {
        this.Livros = Livros;
    }

    public int getQtdVenda() {
        return qtdVenda;
    }

    public void setQtdVenda(int qtdVenda) {
        this.qtdVenda = qtdVenda;
        this.vlTotal = (this.vlPrecoUnitario-vlDescontdo) *  this.qtdVenda;
    }

    public double getVlPrecoUnitario() {
        return vlPrecoUnitario;
    }

    public void setVlPrecoUnitario(double vlPrecoUnitario) {
        this.vlPrecoUnitario = vlPrecoUnitario;
        this.vlTotal = (this.vlPrecoUnitario-vlDescontdo) *  this.qtdVenda;
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

}
