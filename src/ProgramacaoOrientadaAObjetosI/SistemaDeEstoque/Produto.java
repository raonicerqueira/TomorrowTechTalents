package ProgramacaoOrientadaAObjetosI.SistemaDeEstoque;

public class Produto {


    private String nome;
    private String sessao;
    private String tipo;
    private int qtdEstoque;
    private String marca;
    private int idProduto;
    private static int contadorProduto;


    public Produto(String nome, String sessao, String tipo, int qtdEstoque, String marca) {
        this.nome = nome;
        this.sessao = sessao;
        this.tipo = tipo;
        this.qtdEstoque = qtdEstoque;
        this.marca = marca;
    }

    public Produto() {
        this.idProduto = ++contadorProduto;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSessao(String sessao) {
        this.sessao = sessao;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNome() {
        return nome;
    }

    public String getSessao() {
        return sessao;
    }

    public String getTipo() {
        return tipo;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public String getMarca() {
        return marca;
    }

    public int getIdProduto() {
        return idProduto;
    }
}
