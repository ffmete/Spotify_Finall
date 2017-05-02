import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mete on 25.04.2017.
 */
public class Kullanici {

    public int Id;
    public String KullaniciAdi,Ad,Parola,SoyAd;

    public Kullanici(int id, String kullaniciAdi,String parola,String ad,String soyAd) {
        this.Id = id;
        this.KullaniciAdi = kullaniciAdi;
        this.Parola = parola;
        this.Ad = ad;
        this.SoyAd = soyAd;


    }
    public List<Sarki> calmaListesi = new ArrayList<Sarki>();

}