public class YonetimPaneli <T>{
    public void bilgileriGoster(T a) {
        System.out.println(a);
    }
    public <T extends Musteri>void sahipOldugumHayvanlar(T b) {
        b.hayvanlariListele();

    }
}
