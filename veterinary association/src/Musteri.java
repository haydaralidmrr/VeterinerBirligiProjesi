import java.util.ArrayList;

public class Musteri extends Kisi {
    private String adres;
    private ArrayList<Hayvan>musteriHayvanlari;


    public Musteri(String isim, String tc,String adres) {
        super(isim, tc);
        this.adres=adres;
        musteriHayvanlari=new ArrayList<>();
    }
    public void hayvanEkle(Hayvan hayvan) {
        musteriHayvanlari.add(hayvan);
        System.out.println(hayvan+" " +getIsim()+" musterisine eklendi");
    }
    public void hayvanlariListele() {
        for (Hayvan a:musteriHayvanlari) {
            System.out.println(a);
        }
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    @Override
    void kendiniTanit() {
        System.out.println(this.toString()+"Ben bir musteriyim");

    }

    @Override
    public String toString() {
        return super.toString()+"Musteri{" +
                "adres='" + adres + '\'' +
                '}';
    }
}
