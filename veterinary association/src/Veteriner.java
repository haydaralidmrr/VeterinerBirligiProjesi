import java.util.ArrayList;

public class Veteriner extends Kisi{
    private String mezunOlduguOkul;
    private int calismaSuresi;
    private ArrayList<Musteri>veterinerMusterileri;
    private int musteriSayisi;
    public Veteriner(String isim, String tc,String mezunOlduguOkul,int calismaSuresi) {
        super(isim, tc);
        this.mezunOlduguOkul=mezunOlduguOkul;
        this.calismaSuresi=calismaSuresi;
        veterinerMusterileri=new ArrayList<>();
        musteriSayisi=0;
    }
    public void musteriEkle(Musteri musteri) {
        veterinerMusterileri.add(musteri);
        System.out.println(musteri+" " +getIsim()+" veterinerine atandı");
        musteriSayisi++;
    }
    public void musterileriListele() {
        for(Musteri m:veterinerMusterileri) {
            System.out.println(m);
        }
    }

    public String getMezunOlduguOkul() {
        return mezunOlduguOkul;
    }

    public void setMezunOlduguOkul(String mezunOlduguOkul) {
        this.mezunOlduguOkul = mezunOlduguOkul;
    }

    public int getCalismaSuresi() {
        return calismaSuresi;
    }

    public void setCalismaSuresi(int calismaSuresi) {
        this.calismaSuresi = calismaSuresi;
    }

    @Override
    void kendiniTanit() {
        System.out.println(this.toString()+"ben bir veterinerim");

    }

    @Override
    public String toString() {
        return super.toString()+"Veteriner{" +
                "mezunOlduguOkul='" + mezunOlduguOkul + '\'' +
                ", calismaSuresi=" + calismaSuresi +
                '}';
    }
}
