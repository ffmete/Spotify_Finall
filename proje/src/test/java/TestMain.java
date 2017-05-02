import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertTrue;

/**
 * Created by ffmete on 2.05.2017.
 */
public class TestMain {
    List<Kullanici> kullaniciListesi = new ArrayList<Kullanici>();
    List<Sarkici> sarkiciListesi = new ArrayList<Sarkici>();
    List<Album> albumListesi = new ArrayList<Album>();
    List<Sarki> sarkiListesi = new ArrayList<Sarki>();

    @Test
    public void MedifyTest(){
        Medify medify = new Medify() {
            public void registerUser(String kullaniciAdi, String parola, String ad, String soyad) {
                Kullanici kullanici = new Kullanici(1, kullaniciAdi, parola, ad, soyad);
                kullaniciListesi.add(kullanici);
                assertTrue(kullaniciListesi.get(0).equals(kullanici));

            }
            @Test
            public List<Kullanici> findAllUsers() {

                for (Kullanici kullanici:kullaniciListesi){
                    System.out.println(kullanici.Ad+" "+kullanici.SoyAd);
                }
                return null;
            }
            @Test
            public void createSinger(Sarkici sarkici) {
                sarkiciListesi.add(sarkici);
                assertTrue(sarkiciListesi.get(0).equals(sarkici));
            }
            @Test
            public List<Sarkici> findAllSingers() {
                for (Sarkici sarkici:sarkiciListesi){
                    System.out.println(sarkici.Ad+" "+sarkici.SoyAd);
                }
                return null;
            }
            @Test
            public List<Sarkici> findSingersBy(String name) {
                for (Sarkici sarkici:sarkiciListesi){
                    if(sarkici.Ad.equalsIgnoreCase(name)){
                        System.out.println(sarkici.Ad+" "+sarkici.SoyAd);
                    }
                }
                return null;
            }
            @Test
            public void createAlbum(Sarkici sarkici, Album album) {
                sarkiciListesi.add(sarkici);
                albumListesi.add(album);
            }
            @Test
            public List<Album> findAllAlbumsBy(String ad) {
                for (Album album:albumListesi){
                    if (album.AlbumAdi.equalsIgnoreCase(ad)){
                        List<Album> a = new ArrayList<Album>();
                        a.add(album);
                        return a;
                    }
                }
                List<Album> a = new ArrayList<Album>();

                return a;
            }
            @Test
            public List<Album> findAllAlbumsBy(Sarkici sarkici) {

                for (Sarkici sarkici1:sarkiciListesi){
                    if (sarkici1.Ad.equalsIgnoreCase(sarkici.Ad)){


                    }
                }
                List<Album> a = new ArrayList<Album>();

                return a;
            }
            @Test
            public void createPlaylist(Kullanici kullanici, CalmaListesi playlist) {

            }
            @Test
            public List<CalmaListesi> findPlaylistBy(Kullanici kullanici) {
                return null;
            }
            @Test
            public List<CalmaListesi> findPlaylistBy(Kullanici kullanici, String ad) {
                return null;
            }
            @Test
            public CalmaListesi getPlaylistDetail(Kullanici kullanici, String ad) {
                return null;
            }
            @Test
            public void createSong(Sarkici sarkici, Album album, Sarki sarki) {
                sarkiciListesi.add(sarkici);
                albumListesi.add(album);
                sarkiListesi.add(sarki);
            }
            @Test
            public Sarki getSongDetail(Sarkici sarkici, String name) {
                return null;
            }
        };
    }
    @Test
    public void sarkiEkle(){
        final Sarki sarki = new Sarki(1, "royals", 3,"https://www.youtube.com/watch?v=nlcIKh6sBtc");
        System.out.println(sarki.Ad);

        assertTrue(sarki.Ad.equals("royals"));
    }
    @Test
    public void sarkiciEkle(){
        final Sarkici sarkici = new Sarkici(1,"Bulent","Ersoy");
        assertTrue(sarkici.Ad.equalsIgnoreCase("BULENT"));
        assertTrue(sarkici.SoyAd.equalsIgnoreCase("ERSOY"));
    }

}