package ProgramacaoOrientadaAObjetosII.Calculadora;

public class Soma extends ColetarInformacoes implements Calculo {

    @Override
    public void calcular() {
        coletarAsEntradas();
        resultado = n1 + n2;
        mostrarResultado(n1, n2, resultado);
    }

    public void mostrarResultado(double n1, double n2, double resultado) {
        System.out.println("O resultado da soma entre " + n1 + " e " + n2 + " é " + resultado + "\n");
    }
}
