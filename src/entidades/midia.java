package entidades;

import java.util.Objects;

public class midia {
    private String titulo;
    private int duracao;
    private int numeroDeReproducoes;

    public void reproduzir() {
        System.out.println("Reproduzindo mídia: " + this.titulo);
    }

    public midia() {
    }

    public midia(String titulo, int duracao, int numeroDeReproducoes) {
        this.titulo = titulo;
        this.duracao = duracao;
        this.numeroDeReproducoes = numeroDeReproducoes;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public int getNumeroDeReproducoes() {
        return numeroDeReproducoes;
    }

    public void setNumeroDeReproducoes(int numeroDeReproducoes) {
        this.numeroDeReproducoes = numeroDeReproducoes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        midia midia = (midia) o;
        return duracao == midia.duracao && numeroDeReproducoes == midia.numeroDeReproducoes && Objects.equals(titulo, midia.titulo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, duracao, numeroDeReproducoes);
    }

    @Override
    public String toString() {
        return "midia{" +
                "título='" + titulo + '\'' +
                ", duracao=" + duracao +
                ", numeroDeReproducoes=" + numeroDeReproducoes +
                '}';
    }
}
