package entidades;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Playlist {
    private String nome;
    private List<midia> midias = new ArrayList<>();

    public void adicionarMidia(midia midia) {
        midias.add(midia);
    }

    public void removerMidia(midia midia) {
        midias.remove(midia);
    }

    public void reproduzir(){
        System.out.println("Reproduzindo playlist: " + this.nome);
        for(var midia : midias){
            midia.reproduzir();
        }
    }

    public void exibir(){
        System.out.println("Playlist:" + this.nome);
        for(var midia : midias){
            System.out.println(midia);
        }
    }

    public Playlist() {
    }

    public Playlist(String nome, List<midia> midias) {
        this.nome = nome;
        this.midias = midias;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<midia> getMidias() {
        return midias;
    }

    public void setMidias(List<midia> midias) {
        this.midias = midias;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Playlist playlist = (Playlist) o;
        return Objects.equals(nome, playlist.nome) && Objects.equals(midias, playlist.midias);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, midias);
    }

    @Override
    public String toString() {
        return "Playlist{" +
                "nome='" + nome + '\'' +
                ", midias=" + midias +
                '}';
    }
}
