import java.util.List;

/**
 * Created by ffmete on 2.05.2017.
 */
public interface Medify {
    void registerUser(String userName, String password,String ad, String soyad);
    List<Kullanici> findAllUsers();
    void createSinger(Sarkici singer);
    List<Sarkici> findAllSingers();
    List<Sarkici> findSingersBy(String name);
    void createAlbum(Sarkici sarkici, Album album);
    List<Album> findAllAlbumsBy(String name);
    List<Album> findAllAlbumsBy(Sarkici sarkici);
    void createPlaylist(Kullanici user, CalmaListesi playlist);
    List<CalmaListesi> findPlaylistBy(Kullanici user);
    List<CalmaListesi> findPlaylistBy(Kullanici user,String name);
    CalmaListesi getPlaylistDetail(Kullanici user,String name);
    void createSong (Sarkici sarkici,Album album, Sarki song);
    Sarki getSongDetail(Sarkici sarkici,String name);

}