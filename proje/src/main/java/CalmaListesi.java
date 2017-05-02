import java.util.List;

/**
 * Created by Mete on 25.04.2017.
 */
public class CalmaListesi {

    public int Id;
    public List<Sarki> SarkiListesi;
    public String Ad;
    public int Sure;

    public CalmaListesi(int id, String ad, List<Sarki> sarkiListesi, int sure) {
        this.Id = id;
        this.SarkiListesi = sarkiListesi;
        this.Ad = ad;
        this.Sure = sure;
    }

}