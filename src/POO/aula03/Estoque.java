package POO.aula03;

import java.util.ArrayList;
import java.util.List;

public class Estoque {

    public String nome;
    private static int contadorEstoque;
    private final int idEstoque;

    public List<String> getListaProdutos() {
        return listaProdutos;
    }

    public void setListaProdutos(List<String> listaProdutos) {
        this.listaProdutos = listaProdutos;
    }

    private List<String> listaProdutos = new ArrayList<>();

    Estoque() {
        contadorEstoque++;
        idEstoque = contadorEstoque;
    }

    public int getIdEstoque(){
        return this.idEstoque;
    }
}

