package ProgramacaoOrientadaAObjetosI.SistemaDeEscola;

import java.util.ArrayList;

public class Professor extends Funcionario {


    public void setTurmas(ArrayList<String> turmas) {
        this.turmas = turmas;
    }

    public void setDisciplinas(ArrayList<String> disciplinas) {
        this.disciplinas = disciplinas;
    }

    private ArrayList<String> turmas = new ArrayList<>();
    private ArrayList<String> disciplinas = new ArrayList<>();

    public ArrayList<String> getTurmas() {
        return turmas;
    }

    public ArrayList<String> getDisciplinas() {
        return disciplinas;
    }

    public Professor(String nome, String cpf, String rg, ArrayList<String> turmas, ArrayList<String> disciplinas, double salario) {
        super(nome, cpf, rg, salario, "Professor");
        this.turmas = turmas;
        this.disciplinas = disciplinas;
    }
}
