package entidades;

import java.util.Objects;

public class musica extends midia{
    private String artista;
    private String album;

    public musica(String vampire, int i, int i1) {
    }

    @Override
    public void reproduzir(){
        System.out.println("Reproduzindo musica: " + this.getTitulo());
    }

    public musica() {
    }

    public musica(String titulo, int duracao, int numeroDeReproducoes, String artista, String album) {
        super(titulo, duracao, numeroDeReproducoes);
        this.artista = artista;
        this.album = album;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        musica musica = (musica) o;
        return Objects.equals(artista, musica.artista) && Objects.equals(album, musica.album);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), artista, album);
    }

    @Override
    public String toString() {
        return "musica{" +
                "artista='" + artista + '\'' +
                ", album='" + album + '\'' +
                "} " + super.toString();
    }
}
