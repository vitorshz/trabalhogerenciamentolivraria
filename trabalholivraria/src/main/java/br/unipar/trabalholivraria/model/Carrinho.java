package br.unipar.trabalholivraria.model;
public class Carrinho {
    private int cod_carrinho;
    private Livros livros;
    private int qtdVenda;
    private double vlPrecoUnitario;
    private double vlTotal;

    public Carrinho() {
    }

    public Carrinho(int cod_carrinho, Livros livros, int qtdVenda, double vlPrecoUnitario, double vlTotal) {
        this.cod_carrinho = cod_carrinho;
        this.livros = livros;
        this.qtdVenda = qtdVenda;
        this.vlPrecoUnitario = vlPrecoUnitario;
        this.vlTotal = vlTotal;
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
    }

    public double getVlPrecoUnitario() {
        return vlPrecoUnitario;
    }

    public void setVlPrecoUnitario(double vlPrecoUnitario) {
        this.vlPrecoUnitario = vlPrecoUnitario;
    }

    public double getVlTotal() {
        return vlTotal;
    }

    public void setVlTotal(double vlTotal) {
        this.vlTotal = vlTotal;
    }

    @Override
    public String toString() {
        return "Carrinho{" + "cod_carrinho=" + cod_carrinho + ", livros=" + livros + ", qtdVenda=" + qtdVenda + ", vlPrecoUnitario=" + vlPrecoUnitario + ", vlTotal=" + vlTotal + '}';
    }
    
    
}
