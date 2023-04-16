/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.trabalholivraria.model;

import java.util.ArrayList;

/**
 *
 * @author vinid
 */
public class Livros {
    private int cod_livro;
    private String tituloLivro;
    private double vlPrecoLivro;
    private int qtdEstoqueLivro;
    private int qtdPgs;
    private int anoLancamento;
    
    private ArrayList<Editora> Editoras;
    private ArrayList<Generos> generos;
    private ArrayList<Autores> autores;

    public Livros() {
        this.Editoras = new ArrayList<>();
        this.generos = new ArrayList<>();
        this.autores = new ArrayList<>();
    }

    public Livros(int cod_livro, String tituloLivro, double vlPrecoLivro, int qtdEstoqueLivro, int qtdPgs, int anoLancamento, ArrayList<Editora> Editoras, ArrayList<Generos> generos, ArrayList<Autores> autores) {
        this.cod_livro = cod_livro;
        this.tituloLivro = tituloLivro;
        this.vlPrecoLivro = vlPrecoLivro;
        this.qtdEstoqueLivro = qtdEstoqueLivro;
        this.qtdPgs = qtdPgs;
        this.anoLancamento = anoLancamento;
        this.Editoras = Editoras;
        this.generos = generos;
        this.autores = autores;
    }

    public int getCod_livro() {
        return cod_livro;
    }

    public void setCod_livro(int cod_livro) {
        this.cod_livro = cod_livro;
    }

    public String getTituloLivro() {
        return tituloLivro;
    }

    public void setTituloLivro(String tituloLivro) {
        this.tituloLivro = tituloLivro;
    }

    public double getVlPrecoLivro() {
        return vlPrecoLivro;
    }

    public void setVlPrecoLivro(double vlPrecoLivro) {
        this.vlPrecoLivro = vlPrecoLivro;
    }

    public int getQtdEstoqueLivro() {
        return qtdEstoqueLivro;
    }

    public void setQtdEstoqueLivro(int qtdEstoqueLivro) {
        this.qtdEstoqueLivro = qtdEstoqueLivro;
    }

    public int getQtdPgs() {
        return qtdPgs;
    }

    public void setQtdPgs(int qtdPgs) {
        this.qtdPgs = qtdPgs;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public ArrayList<Editora> getEditoras() {
        return Editoras;
    }

    public void setEditoras(ArrayList<Editora> Editoras) {
        this.Editoras = Editoras;
    }

    public ArrayList<Generos> getGeneros() {
        return generos;
    }

    public void setGeneros(ArrayList<Generos> generos) {
        this.generos = generos;
    }

    public ArrayList<Autores> getAutores() {
        return autores;
    }

    public void setAutores(ArrayList<Autores> autores) {
        this.autores = autores;
    }

    @Override
    public String toString() {
        return "Livros{" + "cod_livro=" + cod_livro + ", tituloLivro=" + tituloLivro + ", vlPrecoLivro=" + vlPrecoLivro + ", qtdEstoqueLivro=" + qtdEstoqueLivro + ", qtdPgs=" + qtdPgs + ", anoLancamento=" + anoLancamento + ", Editoras=" + Editoras + ", generos=" + generos + ", autores=" + autores + '}';
    }
    
    

    
}
