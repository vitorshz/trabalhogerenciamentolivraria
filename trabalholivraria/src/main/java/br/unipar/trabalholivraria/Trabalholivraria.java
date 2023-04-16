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
        Livros l1 = new Livros();
        Livraria livrariapoucaporva = new Livraria(1, "62.410.352/0001-72");
        
        Editora editora1 = new Editora();
        editora1.setCod_editora(1);
        editora1.setNmEditora("Vergara e Riba Editoras");
        editora1.setCnpjEditora("02.817.648/0003-42");
        
        Autores autor1 = new Autores(1, "Jeff Kinney");
        
        l1.getEditoras().add(editora1);
        System.out.println(l1.toString());
    


    }
}
