import java.util.ArrayList;
import java.util.List;

/**
 * Created by ffmete on 2.05.2017.
 */
public class Album {
    String AlbumAdi;
    List<Sarki> sarkilar = new ArrayList<Sarki>();

    public Album(String albumAdi, List<Sarki> sarkilar) {
        AlbumAdi = albumAdi;
        this.sarkilar = sarkilar;
    }

    public Album(String albumAdi) {
        AlbumAdi = albumAdi;
    }
}