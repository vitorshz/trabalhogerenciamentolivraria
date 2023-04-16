package br.unipar.trabalholivraria;

import br.unipar.trabalholivraria.model.Autores;
import br.unipar.trabalholivraria.model.Carrinho;
import br.unipar.trabalholivraria.model.Cidade;
import br.unipar.trabalholivraria.model.Clientes;
import br.unipar.trabalholivraria.model.Editora;
import br.unipar.trabalholivraria.model.Endereco;
import br.unipar.trabalholivraria.model.Estado;
import br.unipar.trabalholivraria.model.Estoque;
import br.unipar.trabalholivraria.model.Fr_Pagamento;
import br.unipar.trabalholivraria.model.Generos;
import br.unipar.trabalholivraria.model.Livraria;
import br.unipar.trabalholivraria.model.Livros;
import br.unipar.trabalholivraria.model.Pais;
import br.unipar.trabalholivraria.model.Vendas;
import br.unipar.trabalholivraria.model.Vendedor;

public class Trabalholivraria {

    public static void main(String[] args) {
        Livraria livrariapoucaporva = new Livraria(1, "62.410.352/0001-72");
        Livros l1 = new Livros();

        Editora editora1 = new Editora(1, "Vergara e Riba Editoras", "02.817.648/0003-42");
        Autores autor1 = new Autores(1, "Jeff Kinney");
        Generos g1 = new Generos(1, "Romance Infantil");

        l1.getEditoras().add(editora1);
        l1.getAutores().add(autor1);
        l1.getGeneros().add(g1);
        l1.setCod_livro(1);
        l1.setTituloLivro("Diario de um Banana Volume 1");
        l1.setAnoLancamento(2007);
        l1.setQtdPgs(244);
        l1.setQtdEstoqueLivro(3);
        l1.setVlPrecoLivro(59.99);
        
        
        Livros l2 = new Livros();

        Editora editora2 = new Editora(1, "Bloomsbury ", "02.100.212/0001-29");
        Autores autor2 = new Autores(1, " J. K. Rowling");
        Generos g2 = new Generos(1, "fantasia e ficção");

        l2.getEditoras().add(editora2);
        l2.getAutores().add(autor2);
        l2.getGeneros().add(g2);
        l2.setCod_livro(2);
        l2.setTituloLivro("Harry Potter e a Pedra Filosofa");
        l2.setAnoLancamento(1997);
        l2.setQtdPgs(208);
        l2.setQtdEstoqueLivro(10);
        l2.setVlPrecoLivro(35.90);
        
        Livros l3 = new Livros();

        Editora editora3 = new Editora(1, "Disney Press", "04.200.901/0003-18");
        Autores autor3 = new Autores(1, " Rob Kidd");
        Generos g3 = new Generos(1, "fantasia e ficção");

        l3.getEditoras().add(editora3);
        l3.getAutores().add(autor3);
        l3.getGeneros().add(g3);
        l3.setCod_livro(3);
        l3.setTituloLivro("Pirata dos caribe volume 1");
        l3.setAnoLancamento(2006);
        l3.setQtdPgs(144);
        l3.setQtdEstoqueLivro(15);
        l3.setVlPrecoLivro(65.99);
        
        Fr_Pagamento pix = new Fr_Pagamento(1, "PIX");
        Fr_Pagamento cartao_debito = new Fr_Pagamento(2, "CARTAO_DEBITO");
        
    }
}
