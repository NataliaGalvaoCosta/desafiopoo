package org.example.modelos;

import org.example.repository.Midia;

public class Filme extends Titulo implements Midia {
    private String personagem;

    public Filme(String tipo, String nome, int duracao) {
        super(tipo, nome, duracao);
        this.personagem = getPersonagem();
    }
    public String getPersonagem() { return personagem; }
    //public void setPersonagem(String personagem) { this.personagem = personagem; }

    public double getClassificacao() {
        double media = pegaMedia();
        double classificacao = media / 2;
        return Math.round(classificacao * 100.0) / 100;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
