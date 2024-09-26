import entidades.Playlist;
import entidades.Usuario;
import entidades.musica;
import entidades.podcast;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bem vindo ao player de musica! ");
        var musica = new musica("Vampire", 480, 0, "Olivia Rodrigo", "Guts");
        var podcast = new podcast("PodPah - 987", 3600, 0, "PodPah","Igão e Mitico", "Podcast com Manoel Gomes");
        var usuario = new Usuario();
        usuario.setNome("Juan");

        var usuario2 = new Usuario();
        usuario2.setNome("Maria Izadora momolinda");

        // Usuario Juan segue e ama Maria Izadora momolinda
        usuario.seguirUsuario(usuario2);

        var playlist = new Playlist();
        playlist.setNome("Pop na estrada");

        playlist.adicionarMidia(musica);
        playlist.adicionarMidia(podcast);

        usuario.getPlaylists().add(playlist);
        System.out.println(usuario);
    }
}