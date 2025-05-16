
package com.mycompany.escolajava;


public class Aluno {
    private String matricula;
    private String nome;
    private double notaProva1;
    private double notaProva2;
    private double notaTrabalho;

    public Aluno(String matricula, String nome, double notaProva1, double notaProva2, double notaTrabalho) {
        this.matricula = matricula;
        this.nome = nome;
        this.notaProva1 = notaProva1;
        this.notaProva2 = notaProva2;
        this.notaTrabalho = notaTrabalho;
    }

    public double media() {
        return (notaProva1 * 2.5 + notaProva2 * 2.5 + notaTrabalho * 2) / 7;
    }

    public boolean aprovacao() {
        return media() >= 6;
    }

    public String getNome() {
        return nome;
    }
}

