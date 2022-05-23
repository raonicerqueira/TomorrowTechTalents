package ProgramacaoOrientadaAObjetosI.SistemaDeEscola;

//TODO

import java.util.ArrayList;

public class SistemaEscola {
    String nomeEscola;
    ArrayList<Aluno> listaAlunos;
    ArrayList<Funcionario> listaFuncionarios;
    ArrayList<Professor> listaProfessores;

    public SistemaEscola(String nome) {
        this.nomeEscola = nome;
        this.listaAlunos = new ArrayList<Aluno>();
        this.listaFuncionarios = new ArrayList<Funcionario>();
        this.listaProfessores = new ArrayList<Professor>();
    }

    //    MÉTODOS PARA ADICIONAR

    public void adicionarAluno(Aluno novoAluno) {
        if (buscarPosicaoAluno(novoAluno.getCpf()) != -1) {
            System.out.println("Aluno já cadastrado!");
        } else {
            this.listaAlunos.add(novoAluno);
            System.out.println("Novo aluno cadastrado no sistema com sucesso!");
        }
    }

    public void adicionarFuncionario(Funcionario novoFuncionario) {
        if (buscarPosicaoFuncionario(novoFuncionario.getCpf()) != -1) {
            System.out.println("Funcionário já cadastrado!");
        } else {
            this.listaFuncionarios.add(novoFuncionario);
            System.out.println("Novo funcionário cadastrado no sistema com sucesso!");
        }
    }

    public void adicionarProfessor(Professor novoProfessor) {
        if (buscarPosicaoProfessor(novoProfessor.getCpf()) != -1) {
            System.out.println("Professor já cadastrado!");
        } else {
            this.listaProfessores.add(novoProfessor);
            System.out.println("Novo professor cadastrado no sistema com sucesso!");
        }
    }


    //    MÉTODOS PARA MODIFICAR
    public void modificarAluno(Aluno alunoAtualizado) {
        int posicao = buscarPosicaoAluno(alunoAtualizado.getCpf());
        if (posicao != -1) {
            Aluno alunoSelecionado = this.listaAlunos.get(posicao);
            alunoSelecionado.setNome(alunoAtualizado.getNome());
            alunoSelecionado.setCpf(alunoAtualizado.getCpf());
            alunoSelecionado.setRg(alunoAtualizado.getRg());
            alunoSelecionado.setIdade(alunoAtualizado.getIdade());
            alunoSelecionado.setTurma(alunoAtualizado.getTurma());
            System.out.println("O cadastro de " + alunoAtualizado.getNome() + " foi atualizado com sucesso!");
        } else {
            System.out.println("Aluno não cadastrado, por favor cadastre o aluno para que possa fazer modificações no mesmo");
        }
    }

    public void modificarFuncionario(Funcionario funcionarioAtualizado) {
        int posicao = buscarPosicaoFuncionario(funcionarioAtualizado.getCpf());
        if (posicao != -1) {
            Funcionario funcionarioSelecionado = this.listaFuncionarios.get(posicao);
            funcionarioSelecionado.setNome(funcionarioAtualizado.getNome());
            funcionarioSelecionado.setCpf(funcionarioAtualizado.getCpf());
            funcionarioSelecionado.setRg(funcionarioAtualizado.getRg());
            funcionarioSelecionado.setCargo(funcionarioAtualizado.getCargo());
            funcionarioSelecionado.setSalario(funcionarioAtualizado.getSalario());
            System.out.println("O cadastro de " + funcionarioAtualizado.getNome() + " foi atualizado com sucesso!");
        } else {
            System.out.println("Funcionário não cadastrado, por favor cadastre o funcionário para que possa fazer modificações no mesmo");
        }
    }

    public void modificarProfessor(Professor professorAtualizado) {
        int posicao = buscarPosicaoProfessor(professorAtualizado.getCpf());
        if (posicao != -1) {
            Professor professorSelecionado = this.listaProfessores.get(posicao);
            professorSelecionado.setNome(professorAtualizado.getNome());
            professorSelecionado.setCpf(professorAtualizado.getCpf());
            professorSelecionado.setRg(professorAtualizado.getRg());
            professorSelecionado.setCargo(professorAtualizado.getCargo());
            professorSelecionado.setSalario(professorAtualizado.getSalario());
            System.out.println("O cadastro de " + professorAtualizado.getNome() + " foi atualizado com sucesso!");
        } else {
            System.out.println("Professor não cadastrado, por favor cadastre o professor para que possa fazer modificações no mesmo");
        }
    }

    //    MÉTODOS PARA LISTAR
    public void listarAlunos() {
        if (listaAlunos.isEmpty()) {
            System.out.println("Não existem alunos cadastrados");
        } else {
            for (Aluno aluno : this.listaAlunos) {
                System.out.println("Aluno: " + aluno.getNome());
                System.out.println("CPF: " + aluno.getCpf());
                System.out.println("RG: " + aluno.getRg());
                System.out.println("Turma: " + aluno.getTurma());
                System.out.println("Idade: " + aluno.getIdade() + "\n");
            }
        }
    }

    public void listarProfessores() {
        if (listaProfessores.isEmpty()) {
            System.out.println("Não existem professores cadastrados");
        } else {
            for (Professor professor : this.listaProfessores) {
                System.out.println("Professor: " + professor.getNome());
                System.out.println("CPF: " + professor.getCpf());
                System.out.println("RG: " + professor.getRg());
                System.out.println("Turmas: " + professor.getTurmas());
                System.out.println("Disciplinas que leciona: " + professor.getDisciplinas());
                System.out.println("Salário: " + professor.getSalario() + "\n");
            }
        }
    }

    public void listarFuncionarios() {
        if (listaFuncionarios.isEmpty()) {
            System.out.println("Não existem funcionários cadastrados");
        } else {
            for (Funcionario funcionario : this.listaFuncionarios) {
                System.out.println("Funcionário: " + funcionario.getNome());
                System.out.println("CPF: " + funcionario.getCpf());
                System.out.println("RG: " + funcionario.getRg());
                System.out.println("Cargo: " + funcionario.getCargo());
                System.out.println("Salário: " + funcionario.getSalario() + "\n");
            }
        }
    }

    //MÉTODOS PARA DELETAR
    public void deletarAluno(Aluno aluno) {
        int posicao = buscarPosicaoAluno(aluno.getCpf());
        if (posicao != -1) {
            listaAlunos.remove(posicao);
            System.out.println("Aluno removido do sistema com sucesso!");
        } else {
            System.out.println("Aluno não encontrado.");
        }
    }

    public void deletarFuncionario(Funcionario funcionario) {
        int posicao = buscarPosicaoFuncionario(funcionario.getCpf());
        if (posicao != -1) {
            listaFuncionarios.remove(posicao);
            System.out.println("Funcionário removido do sistema com sucesso!");
        } else {
            System.out.println("Funcionário não encontrado.");
        }
    }

    public void deletarProfessor(Professor professor) {
        int posicao = buscarPosicaoProfessor(professor.getCpf());
        if (posicao != -1) {
            listaProfessores.remove(posicao);
            System.out.println("Professor removido do sistema com sucesso!");
        } else {
            System.out.println("Professor não encontrado.");
        }
    }


    // MÉTODOS PARA ENCONTRAR A POSIÇÃO DO OBJETO
    public int buscarPosicaoAluno(String cpf) {
        for (Pessoa aluno : this.listaAlunos) {
            if (cpf.equals(aluno.getCpf())) {
                return listaAlunos.indexOf(aluno);
            }
        }
        return -1;
    }

    public int buscarPosicaoFuncionario(String cpf) {
        for (Funcionario funcionario : this.listaFuncionarios) {
            if (cpf.equals(funcionario.getCpf())) {
                return listaFuncionarios.indexOf(funcionario);
            }
        }
        return -1;
    }

    public int buscarPosicaoProfessor(String cpf) {
        for (Professor professor : this.listaProfessores) {
            if (cpf.equals(professor.getCpf())) {
                return listaProfessores.indexOf(professor);
            }
        }
        return -1;
    }

    public void exibirDadosAluno(Aluno aluno) {
        int posicaoAluno = buscarPosicaoAluno(aluno.getCpf());
        if (posicaoAluno != -1) {
            aluno = this.listaAlunos.get(posicaoAluno);
            System.out.println("Aluno: " + aluno.getNome());
            System.out.println("CPF: " + aluno.getCpf());
            System.out.println("RG: " + aluno.getRg());
            System.out.println("Turma: " + aluno.getTurma());
            System.out.println("Idade: " + aluno.getIdade() + "\n");
        } else {
            System.out.println("Aluno não encontrado");
        }
    }

    public void exibirDadosProfessor(Professor professor) {
        int posicaoProfessor = buscarPosicaoProfessor(professor.getCpf());
        if (posicaoProfessor != -1) {
            professor = this.listaProfessores.get(posicaoProfessor);
            System.out.println("Professor: " + professor.getNome());
            System.out.println("CPF: " + professor.getCpf());
            System.out.println("RG: " + professor.getRg());
            System.out.println("Turmas: " + professor.getTurmas());
            System.out.println("Disciplinas que leciona: " + professor.getDisciplinas());
            System.out.println("Salário: " + professor.getSalario() + "\n");
        } else {
            System.out.println("Professor não encontrado");
        }
    }

    public void exibirDadosFuncionario(Funcionario funcionario) {
        int posicaoFuncionario = buscarPosicaoFuncionario(funcionario.getCpf());
        if (posicaoFuncionario != -1) {
            funcionario = this.listaFuncionarios.get(posicaoFuncionario);
            System.out.println("Funcionário: " + funcionario.getNome());
            System.out.println("CPF: " + funcionario.getCpf());
            System.out.println("RG: " + funcionario.getRg());
            System.out.println("Cargo: " + funcionario.getCargo());
            System.out.println("Salário: " + funcionario.getSalario() + "\n");
        } else {
            System.out.println("Funcionario não encontrado");
        }
    }
}

