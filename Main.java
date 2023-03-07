package Pratica1.Questao3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Aluno aluno = new Aluno();
        System.out.println("Informe o seu nome:");
        aluno.nome = teclado.nextLine();
        System.out.println("Informe o seu curso:");
        aluno.curso = teclado.nextLine();
        System.out.println("Informe a sua matricula:");
        aluno.matricula = teclado.nextLine();
        System.out.println("Informe a sua nota AV01:");
        aluno.notaAV01 = teclado.nextInt();
        System.out.println("Informe a sua nota:");
        aluno.notaAV02 = teclado.nextInt();
        System.out.println("Informe o seu periodo em número.");
        aluno.periodo = teclado.nextInt();


        aluno.avaliarAluno(aluno.soma);
        aluno.avaliarRecuperacao(aluno.notaAE);

    }
}
