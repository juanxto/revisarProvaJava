package entidades;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Usuario {
    private String nome;
    private List<Playlist> playlists = new ArrayList<>();
    private List<Usuario> usuariosSeguidos = new ArrayList<>();

    public void seguirUsuario(Usuario usuario) {
        usuariosSeguidos.add(usuario);
    }

    public void deixarDeSeguirUsuario(Usuario usuario) {
        usuariosSeguidos.remove(usuario);
    }

    public Usuario() {
    }

    public Usuario(String nome, List<Playlist> playlists, List<Usuario> usuariosSeguidos) {
        this.nome = nome;
        this.playlists = playlists;
        this.usuariosSeguidos = usuariosSeguidos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Playlist> getPlaylists() {
        return playlists;
    }

    public void setPlaylists(List<Playlist> playlists) {
        this.playlists = playlists;
    }

    public List<Usuario> getUsuariosSeguidos() {
        return usuariosSeguidos;
    }

    public void setUsuariosSeguidos(List<Usuario> usuariosSeguidos) {
        this.usuariosSeguidos = usuariosSeguidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(nome, usuario.nome) && Objects.equals(playlists, usuario.playlists) && Objects.equals(usuariosSeguidos, usuario.usuariosSeguidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, playlists, usuariosSeguidos);
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nome='" + nome + '\'' +
                ", playlists=" + playlists +
                ", usuariosSeguidos=" + usuariosSeguidos +
                '}';
    }
}
