import java.util.ArrayList;

public class SehirVeterinerlikleri {
    private String sehir;
    private int toplam;
    private ArrayList<Veteriner>sehirdekiVeterinerler;

    public SehirVeterinerlikleri(String sehir) {
        this.sehir = sehir;
        sehirdekiVeterinerler=new ArrayList<>();
    }
    public void sehirdekiveterinerEkle(Veteriner veteriner) {
        sehirdekiVeterinerler.add(veteriner);

    }
    public void toplamVeteriner(){
        System.out.println("Sehirdeki toplam veteriner sayisi " +sehirdekiVeterinerler.size());
    }
}
