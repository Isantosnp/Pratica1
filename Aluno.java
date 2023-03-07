package Pratica1.Questao3;
public class Aluno {
    public String nome, curso, matricula;
    public int notaAV01, notaAV02, notaAE, periodo, soma = 0;

    public Aluno() {
        this.nome = nome;
        this.curso = curso;
        this.matricula = matricula;
        this.notaAV01 = notaAV01;
        this.notaAV02 = notaAV02;
        this.periodo = periodo;
    }

    public double alteraNotaAV01(int notaAV01) {
        return this.notaAV01 += notaAV01;
    }

    public double alteraNotaAV02(int notaAV02) {
        return this.notaAV02 += notaAV02 ;
    }

    public double alteraNotaAVE(int notaAE) {
        return this.notaAE += notaAE;
    }

    public void avaliarAluno (int soma) {
        soma += notaAV01 + notaAV02;
        if (soma < 60) {
            System.out.println("Recuperação");
        } else if (soma >= 60) {
            System.out.println("Aprovado");
        }
    }
    public void avaliarRecuperacao (int soma){
        soma = notaAE + notaAV01 + notaAV02;
        if (soma < 60) {
            System.out.println("Reprovado");
        } else if (soma >= 60) {
            System.out.println("Aprovado");
        }
    }
}

