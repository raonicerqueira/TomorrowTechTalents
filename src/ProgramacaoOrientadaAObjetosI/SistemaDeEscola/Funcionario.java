package ProgramacaoOrientadaAObjetosI.SistemaDeEscola;

public class Funcionario extends Pessoa {
    protected String cargo;
    protected double salario;

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public double getSalario() {
        return salario;
    }

    public Funcionario(String nome, String cpf, String rg, double salario, String cargo) {
        super(nome, cpf, rg);
        this.cargo = cargo;
        this.salario = salario;
    }
}