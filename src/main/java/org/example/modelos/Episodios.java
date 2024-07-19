package org.example.modelos;

import org.example.repository.Midia;

public class Episodios implements Midia {
    private int numero;
    private Serie serie;
    private int totatVisualizacoes;

    public int getTotatVisualizacoes() {
        return totatVisualizacoes;
    }
    public void setTotatVisualizacoes(int totatVisualizacoes) {
        this.totatVisualizacoes = totatVisualizacoes;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public Serie getSerie() {
        return serie;
    }
    public void setSerie(Serie serie) {
        this.serie = serie;
    }
    public double getClassificacao() {
        if (totatVisualizacoes > 100) {
            return 4;
        } else {
            return 2;
        }
    }
}
 //teste