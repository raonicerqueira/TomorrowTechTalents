package POO.aula03;

public class Produto {

    private String nome;
    private String sessao;
    private String tipo;
    private int qtdEstoque;
    private String marca;
    private final int idProduto;
    private static int contadorProduto;

    public Produto() {
        contadorProduto++;
        idProduto = contadorProduto;
    }

    public int getIdProduto() {
        return idProduto;
    }
}
