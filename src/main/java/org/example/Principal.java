package org.example;

import org.example.modelos.Episodios;
import org.example.modelos.Filme;
import org.example.modelos.Serie;
import org.example.modelos.Titulo;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        Filme filme01 = new Filme("Filme", "De volta para o futuro", 120);

        filme01.exibeFichaTecnica();
        filme01.avalia(4);
        filme01.avalia(4);
        filme01.avalia(2);
        System.out.println("Total de avaliações: " + filme01.getTotalDeAvaliacoes());
        System.out.println(filme01.getClassificacao());

        System.out.println("\n");

        Filme filme02 = new Filme("Filme", "O Rei Leão", 90);

        filme02.exibeFichaTecnica();
        filme02.avalia(10);
        filme02.avalia(10);
        filme02.avalia(10);
        System.out.println("Total de avaliações " + filme02.getTotalDeAvaliacoes());
        System.out.println(filme02.getClassificacao());

        System.out.println("\n");

        Serie serie01 = new Serie("Serie", "The Chosen", 480, 5, 8, 60);
        Episodios episodios = new Episodios();
        episodios.setNumero(01);
        episodios.setSerie(serie01);
        episodios.setTotatVisualizacoes(600);

        serie01.exibeFichaTecnica();
        System.out.println("Temporadas: " + serie01.getTemporadas() + " Duração episódio: " + serie01.getDuracaoEpisodio() + " minutos.");

        System.out.println("\n");

        Serie serie02 = new Serie("Serie", "Suits", 6480, 9, 12, 40);
        episodios.setNumero(04);
        episodios.setSerie(serie02);
        episodios.setTotatVisualizacoes(460);

        serie02.exibeFichaTecnica();
        System.out.println("Temporadas: " + serie02.getTemporadas() + " Duração episódio: " + serie02.getDuracaoEpisodio() + " minutos.");


        System.out.println("\nEM CARTAZ:");

        //Para adicionar...
        List<Titulo> lista = new LinkedList<>();
        lista.add(filme01);
        lista.add(filme02);
        lista.add(serie01);
        lista.add(serie02);
        for (Titulo titulo : lista) {
            System.out.println(titulo.getNome());
            if (titulo instanceof Filme filme && filme.getDuracao() <= 120 || titulo instanceof Serie serie && serie.getDuracao() <= 500) {
                System.out.println("Ok. Tenho um tempinho para assistir ainda hoje! \n");
            } else {
                System.out.println("Não será possível assitir hoje. Preciso ter tempo. \n");
            }
        }
        // Ordenar a lista por tempo de duração
        Collections.sort(lista, new Comparator<Titulo>() {
            @Override
            public int compare(Titulo t1, Titulo t2) {
                return Integer.compare(t1.getDuracao(), t2.getDuracao());
            }
        });
        // Exibir a lista ordenada
        System.out.println("\nLista ordenada por tempo de duração: ");
        for (Titulo titulo : lista) {
            System.out.println(titulo.getNome() + "\n - Duração: " + titulo.getDuracao() + " minutos");
        }

        //Para alterar um objeto...
        Filme alteraFilme = new Filme("Filme", "O Homem de Ferro", 126);
        alteraFilme.avalia(10);
        lista.set(0, alteraFilme);

        //Para exibir a lista atualizada....
        System.out.println("\nLista atualizada: ");
        for (Titulo tituloAtualizado : lista) {
            System.out.println(tituloAtualizado.getNome());
            if (tituloAtualizado instanceof Filme filme && filme.getDuracao() <= 120 || tituloAtualizado instanceof Serie serie && serie.getDuracao() <= 500) {
                System.out.println("Ok. Tenho um tempinho para assistir ainda hoje! \n");
            } else {
                System.out.println("Não será possível assitir hoje. Preciso ter tempo. \n");
            }

        }
        //Para alterar um atributo de um objeto...
        Titulo primeiroItem = lista.get(0);
        primeiroItem.setNome("O Homem de Ferro");

        if (primeiroItem instanceof Filme) {
            ((Filme) primeiroItem).setNome("Minions");
        }

        System.out.println("\nLista atualizada:");
        for (Titulo titulo : lista) {
            System.out.println(titulo.getNome());
        }

        //Para excluir...
        lista.remove(3);
        //Para exibir atualização...
        System.out.println("\nLista atualizada: ");
        for (Titulo novaAtualizacao : lista) {
            System.out.println(novaAtualizacao.getNome());
        }
    }
}










