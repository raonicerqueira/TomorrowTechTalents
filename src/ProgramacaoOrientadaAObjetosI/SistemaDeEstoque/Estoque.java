package ProgramacaoOrientadaAObjetosI.SistemaDeEstoque;

import java.util.ArrayList;

public class Estoque {

    public String nome;
    private static int contadorEstoque;
    private int idEstoque;

    public ArrayList<Produto> listaProdutos;


    public Estoque(String nome) {
        this.idEstoque = ++contadorEstoque;
        this.nome = nome;
        this.listaProdutos = new ArrayList<>();
    }

    public int getIdEstoque() {
        return this.idEstoque;
    }

    public void listarProdutos() {
        if (this.listaProdutos.isEmpty()) {
            System.out.println("Não existe produtos cadastrados no estoque");
        } else {
            System.out.println("Produtos em Estoque:");
            for (Produto produto : this.listaProdutos) {
                System.out.println(produto.getNome());
            }
        }
    }

    public void inserirProduto(Produto novoProduto) {
        for (Produto produto : this.listaProdutos) {
            if (novoProduto.getMarca().toLowerCase().equals(produto.getMarca().toLowerCase()) && novoProduto.getNome().toLowerCase().equals(produto.getNome().toLowerCase())) {
                produto.setQtdEstoque(produto.getQtdEstoque() + novoProduto.getQtdEstoque());
                System.out.println("Produto já cadastrado, estoque adicionado com sucesso");
            } else {
                this.listaProdutos.add(novoProduto);
                System.out.println("Produto adicionado com sucesso!");
            }
        }
    }

    public void lerDadosProduto(String nomeDoProduto) {
        for (Produto produto : this.listaProdutos) {
            if (produto.getNome().toLowerCase().equals(nomeDoProduto.toLowerCase())) {
                System.out.println("ID: " + produto.getIdProduto());
                System.out.println("Nome: " + produto.getNome());
                System.out.println("Sessão: " + produto.getSessao());
                System.out.println("Tipo: " + produto.getTipo());
                System.out.println("Quantidade em Estoque: " + produto.getQtdEstoque());
                System.out.println("Marca: " + produto.getMarca());
                System.out.println("Produto cadastrado com sucesso!");
            } else {
                System.out.println("Produto não encontrado");
            }
        }
    }

    public void editarDadosProduto(String nomeDoProduto, String sessao, String tipo, int qtdEstoque, String marca) {
        for (Produto produto : this.listaProdutos) {
            if (produto.getNome().toLowerCase().equals(nomeDoProduto.toLowerCase())) {
                produto.setSessao(sessao);
                produto.setTipo(tipo);
                produto.setQtdEstoque(qtdEstoque);
                produto.setMarca(marca);
                System.out.println("Produto de ID: " + produto.getIdProduto() + " editado com sucesso!");
            } else {
                System.out.println("Produto não encontrado");
            }
        }
    }

    public void deletarProdutoEstoque(String nomeDoProduto) {
        for (Produto produto : this.listaProdutos) {
            if (produto.getNome().toLowerCase().equals(nomeDoProduto.toLowerCase())) {
                this.listaProdutos.remove(produto);
                System.out.println("Produto excluido com sucesso!");
                break;
            } else {
                System.out.println("Produto não encontrado");
            }
        }
    }

    public void encontrarProduto (int idProduto){
        for (Produto produto : this.listaProdutos){
            if (produto.getIdProduto() == idProduto){
                System.out.println("Produto encontrado no estoque");
            } else {
                System.out.println("Produto não encontrado");
            }
        }
    }
}

