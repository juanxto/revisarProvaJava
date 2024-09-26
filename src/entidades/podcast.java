package entidades;

import java.util.Objects;

public class podcast extends midia{
    private String nomePodcast;
    private String autor;
    private String descricao;

    @Override
    public void reproduzir(){
        System.out.println("Reproduzindo podcast: " + this.nomePodcast);
    }

    public podcast() {
    }

    public podcast(String titulo, int duracao, int numeroDeReproducoes, String nomePodcast, String autor, String descricao) {
        super(titulo, duracao, numeroDeReproducoes);
        this.nomePodcast = nomePodcast;
        this.autor = autor;
        this.descricao = descricao;
    }

    public String getNomePodcast() {
        return nomePodcast;
    }

    public void setNomePodcast(String nomePodcast) {
        this.nomePodcast = nomePodcast;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        podcast podcast = (podcast) o;
        return Objects.equals(nomePodcast, podcast.nomePodcast) && Objects.equals(autor, podcast.autor) && Objects.equals(descricao, podcast.descricao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), nomePodcast, autor, descricao);
    }

    @Override
    public String toString() {
        return "podcast{" +
                "nomePodcast='" + nomePodcast + '\'' +
                ", autor='" + autor + '\'' +
                ", descricao='" + descricao + '\'' +
                "} " + super.toString();
    }
}
