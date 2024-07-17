package org.example.modelos;
public class Titulo implements Comparable<Titulo> {
    private String tipo;
    private String nome;
    private int duracao;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;


    public Titulo(String tipo, String nome, int duracao) {
        this.tipo = tipo;
        this.nome = nome;
        this.duracao = duracao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    public void exibeFichaTecnica() {
        System.out.println("Tipo: " + tipo);
        System.out.println("Nome: " + nome);
        System.out.println("Duracao: " + duracao);
    }

    public void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    public double pegaMedia() {
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }
}