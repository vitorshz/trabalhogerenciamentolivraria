package br.unipar.trabalholivraria;

import br.unipar.trabalholivraria.model.Autores;
import br.unipar.trabalholivraria.model.Cadastro;
import br.unipar.trabalholivraria.model.Carrinho;
import br.unipar.trabalholivraria.model.Cidade;
import br.unipar.trabalholivraria.model.Clientes;
import br.unipar.trabalholivraria.model.Editora;
import br.unipar.trabalholivraria.model.Endereco;
import br.unipar.trabalholivraria.model.Estado;
import br.unipar.trabalholivraria.model.Fr_Pagamento;
import br.unipar.trabalholivraria.model.Generos;
import br.unipar.trabalholivraria.model.Livraria;
import br.unipar.trabalholivraria.model.Livros;
import br.unipar.trabalholivraria.model.Pais;
import br.unipar.trabalholivraria.model.Vendas;
import br.unipar.trabalholivraria.model.Vendedor;
import javax.swing.JOptionPane;

public class Trabalholivraria {

    public static void main(String[] args) {

        String input;
        int n1;

        //Declarando os dados da Livraria
        Livraria livrariapoucaporva = new Livraria(1, "62.410.352/0001-72");
        Livros l1 = new Livros();

        //Declarando os dados do livro 1
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

        //Declarando os dados do livro 2
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

        //Declarando os dados do livro 3
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

        //Declarando as formas de pagamento
        Fr_Pagamento pix = new Fr_Pagamento(1, "PIX");
        Fr_Pagamento cartao_debito = new Fr_Pagamento(2, "CARTAO_DEBITO");

        //Inicio do Cadastro/atualizacao dos dados do cliente
        JOptionPane.showMessageDialog(null, "Bem vindo a livraria Poucaporva");

        input = JOptionPane.showInputDialog("Deseja Criar um cadastro ou atulizar um cliente? \n"
                + "1 - Criar \n"
                + "2 - Atualizar");
        n1 = Integer.parseInt(input);

        if (n1 == 1) {
            //criando um cliente
            Clientes c1 = new Clientes();
            c1.setCod_cliente(1);
            input = JOptionPane.showInputDialog("Qual o nome do cliente ?");
            c1.setClienteNome(input);

            input = JOptionPane.showInputDialog("Qual o CPF do cliente ?");
            c1.setClienteCpf(input);

            //criando o endereco
            Endereco endereco1 = new Endereco();
            endereco1.setCod_Endereco(1);
            input = JOptionPane.showInputDialog("Qual  o nome da rua ?");
            endereco1.setNmRua(input);
            input = JOptionPane.showInputDialog("Qual o numero o numero da casa ?");
            int nrCasa = Integer.parseInt(input);
            endereco1.setNrCasa(nrCasa);
            input = JOptionPane.showInputDialog("Algum complemento?");
            endereco1.setDsComplemento(input);
            c1.getEnderecos().add(endereco1);

            //Criando a cidade
            Cidade cidade1 = new Cidade();
            cidade1.setCodCidade(1);
            input = JOptionPane.showInputDialog("Qual o nome da cidade?");
            cidade1.setNomeCidade(input);
            endereco1.getCidades().add(cidade1);

            //criando o pais
            Pais p1 = new Pais();
            p1.setCodPais(1);
            input = JOptionPane.showInputDialog("Qual o Pais?");
            p1.setNomePais(input);
            input = JOptionPane.showInputDialog("Qual a silga do Pais?");
            p1.setSiglaPais(input);

            //criando estado 
            Estado estado1 = new Estado();
            estado1.setCodEstado(1);
            input = JOptionPane.showInputDialog("Qual o nome do Estado?");
            estado1.setNomeEstado(input);
            input = JOptionPane.showInputDialog("Qual a silga do estado?");
            estado1.setSiglaUF(input);
            estado1.getPaises().add(p1);

            System.out.println(c1.toString());

            //Atualizando cadastro do cliente
        } else if (n1 == 2) {
            JOptionPane.showMessageDialog(null, "Atualizar cadastro do cliente");

        } else {
            JOptionPane.showMessageDialog(null, "Comandao invalido");
        }

        //Itens da livraria
        int n = 0;
        input = JOptionPane.showInputDialog("Deseja qual livro? " + "\n"
                + "1 - Diario de um Banana Volume 1 " + "\n"
                + "2 - Harry Potter e a Pedra Filosofal" + "\n"
                + "3 - Piratas dos caribe volume 1");
        n = Integer.parseInt(input);

        //caso escolha o livro 1
        if (n == 1) {
            //Inicio dos Dados da venda
            Vendas venda = new Vendas();
            venda.setCod_Venda(l1.getCod_livro());
            //baixa no carrinho
            Carrinho carrinho = new Carrinho();
            carrinho.setCod_carrinho(1);
            carrinho.setQtdVenda(1);
            carrinho.setVlDescontdo(10);
            carrinho.setLivros(l1);
            carrinho.setVlPrecoUnitario(l1.getVlPrecoLivro());
            venda.getCarrinho().add(carrinho);

            //Pergunta ao cliente sbre a forma de pagamento
            n = 0;
            input = JOptionPane.showInputDialog("Qual a forma de pagamento\n"
                    + "1 - para PIX "
                    + "\n 2 - PARA DÉBITO");
            n = Integer.parseInt(input);
            //caso escolha PIX
            if (n == 1) {
                venda.getFr_Pagamento().add(pix);

                //baixa no estoque
                l1.setQtdEstoqueLivro(l1.getQtdEstoqueLivro() - carrinho.getQtdVenda());

                System.out.println(carrinho.toString());
                System.out.println(l1.toString());
                System.out.println(venda.toString());
                //caso escolha debito
            } else if (n == 2) {
                venda.getFr_Pagamento().add(cartao_debito);

                //baixa no estoque
                l1.setQtdEstoqueLivro(l1.getQtdEstoqueLivro() - carrinho.getQtdVenda());

                System.out.println(carrinho.toString());
                System.out.println(l1.toString());
                System.out.println(venda.toString());
            } else {
                JOptionPane.showMessageDialog(null, "método invalido! ");
            }

            //caso escolha o livro 2
        } else if (n == 2) {
            Vendas venda = new Vendas();
            venda.setCod_Venda(l2.getCod_livro());

            Carrinho carrinho = new Carrinho();
            carrinho.setCod_carrinho(1);
            carrinho.setQtdVenda(1);
            carrinho.setVlDescontdo(10);
            carrinho.setLivros(l2);
            carrinho.setVlPrecoUnitario(l2.getVlPrecoLivro());
            venda.getCarrinho().add(carrinho);

            //Pergunta ao cliente sbre a forma de pagamento
            n = 0;
            input = JOptionPane.showInputDialog("Qual a forma de pagamento\n"
                    + "1 - para PIX "
                    + "\n 2 - PARA DÉBITO");
            n = Integer.parseInt(input);
            //caso escolha pix
            if (n == 1) {
                venda.getFr_Pagamento().add(pix);

                //baixa no estoque
                l2.setQtdEstoqueLivro(l2.getQtdEstoqueLivro() - carrinho.getQtdVenda());

                System.out.println(carrinho.toString());
                System.out.println(l2.toString());
                System.out.println(venda.toString());
                //caso escolha debito
            } else if (n == 2) {
                venda.getFr_Pagamento().add(pix);

                //baixa no estoque
                l2.setQtdEstoqueLivro(l2.getQtdEstoqueLivro() - carrinho.getQtdVenda());

                System.out.println(carrinho.toString());
                System.out.println(l2.toString());
                System.out.println(venda.toString());
            } else {
                JOptionPane.showMessageDialog(null, "método invalido! ");
            }

            //caso escolha o livro 3
        } else if (n == 3) {
            Vendas venda = new Vendas();
            venda.setCod_Venda(l3.getCod_livro());

            Carrinho carrinho = new Carrinho();
            carrinho.setCod_carrinho(1);
            carrinho.setQtdVenda(1);
            carrinho.setVlDescontdo(10);
            carrinho.setLivros(l3);
            carrinho.setVlPrecoUnitario(l3.getVlPrecoLivro());
            venda.getCarrinho().add(carrinho);

            //Pergunta ao cliente sbre a forma de pagamento
            n = 0;
            input = JOptionPane.showInputDialog("Qual a forma de pagamento\n"
                    + "1 - para PIX "
                    + "\n 2 - PARA DÉBITO");
            n = Integer.parseInt(input);
            //caso seja pix
            if (n == 1) {
                venda.getFr_Pagamento().add(pix);

                //baixa no estoque
                l3.setQtdEstoqueLivro(l3.getQtdEstoqueLivro() - carrinho.getQtdVenda());

                System.out.println(carrinho.toString());
                System.out.println(l3.toString());
                System.out.println(venda.toString());
                //caso seja no debito
            } else if (n == 2) {
                venda.getFr_Pagamento().add(pix);

                //baixa no estoque
                l3.setQtdEstoqueLivro(l3.getQtdEstoqueLivro() - carrinho.getQtdVenda());

                System.out.println(carrinho.toString());
                System.out.println(l3.toString());
                System.out.println(venda.toString());
            } else {
                JOptionPane.showMessageDialog(null, "método invalido! ");
            }
        } else {
            JOptionPane.showMessageDialog(null, "");
        }

    }

}
