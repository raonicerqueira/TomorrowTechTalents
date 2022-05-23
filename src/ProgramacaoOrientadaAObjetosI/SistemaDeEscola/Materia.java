package ProgramacaoOrientadaAObjetosI.SistemaDeEscola;

import java.util.ArrayList;

public class Materia {

    private String nome;
    private ArrayList<Double> notas;

    public Materia(String nome) {
        this.nome = nome;
        this.notas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Double> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Double> notas) {
        this.notas = notas;
    }
}
