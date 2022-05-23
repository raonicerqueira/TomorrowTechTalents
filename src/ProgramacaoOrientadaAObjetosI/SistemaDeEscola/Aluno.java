package ProgramacaoOrientadaAObjetosI.SistemaDeEscola;

import java.util.ArrayList;

public class Aluno extends Pessoa {
    private int idade;
    private String turma;

    private ArrayList<Materia> materias;

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public int getIdade() {
        return idade;
    }

    public String getTurma() {
        return turma;
    }

    public Aluno(String nome, String cpf, String rg, int idade, String turma) {
        super(nome, cpf, rg);
        this.idade = idade;
        this.turma = turma;
        this.materias = new ArrayList<>();
    }

    public void mediaAluno(Aluno aluno) {
        double somatorio = 0, contador = 0;
        for (Materia materia : materias) {
            System.out.println(materia.getNome());
            for (double nota : materia.getNotas()) {
                if (nota >= 0) {
                    somatorio += nota;
                }
            }
            double media = somatorio / materia.getNotas().size();
            System.out.printf("O aluno %s, na matéria %s possui média geral de %.2f", aluno.getNome(), materia.getNome(), media);
        }
    }
}
