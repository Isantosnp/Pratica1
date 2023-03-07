package Pratica1.Questão2;

public class EmpregoFaculdade {
    private String nome;
    private double salario;
    private int horasAula;

    public EmpregoFaculdade(String nome, double salario, int horasAula) {
        this.nome = nome;
        this.salario = salario;
        this.horasAula = horasAula;
    }

    double getGastos(){

        return this.salario + (this.horasAula * 40);

    }
    String getInfo() {
        return "Nome: " + this.nome + ", Salário: R$ " + String.format("%.2f", this.getGastos());
    }
}
