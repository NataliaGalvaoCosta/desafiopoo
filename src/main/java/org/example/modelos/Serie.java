package org.example.modelos;

public class Serie extends Titulo {
    private int temporadas;
    private int episodioPorTemporada;
    private int duracaoEpisodio;

    public Serie(String tipo, String nome, int duracao, int temporadas, int episodioPorTemporada, int duracaoEpisodio) {
        super(tipo, nome, duracao);
        this.temporadas = temporadas;
        this.episodioPorTemporada = episodioPorTemporada;
        this.duracaoEpisodio = duracaoEpisodio;
    }

    public int getTemporadas() { return temporadas; }
    public void setTemporadas(int temporadas) { this.temporadas = temporadas; }
    public int getEpisodioPorTemporada() { return episodioPorTemporada; }
    public void setEpisodioPorTemporada(int episodioPorTemporada) { this.episodioPorTemporada = episodioPorTemporada; }
    public int getDuracaoEpisodio() { return duracaoEpisodio; }
    public void setDuracaoEpisodio(int duracaoEpisodio) { this.duracaoEpisodio = duracaoEpisodio; }

    @Override
    public String toString() {
        return super.toString();
    }
}
