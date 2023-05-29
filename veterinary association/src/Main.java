public class Main {
    public static void main(String[] args) {
        ilkNesneleriOlustur();

    }

    private static void ilkNesneleriOlustur() {
        Kedi kedi=new Kedi("Minnoş","Beyaz","01-01-2019",true,"Siyam");
        Kedi kedi1=new Kedi("Tontis","Siyah","01-08-2020",true,"Tekir");
        Kedi kedi2=new Kedi("Gunes","Sari","01-07-2021",true,"Van Kedisi");
        Kopek kopek=new Kopek("Coni","Sarı","23-01-2008",true,"Golden",3);
        Kopek kopek1=new Kopek("Toni","Beyaz","23-01-2021",true,"Av Kopegi",2);
        Kopek kopek2=new Kopek("Barko","Kahverengi","23-01-2021",true,"Sus Kopegi",0);
        //kedi.bilgileriGoster();
        //System.out.println(kedi);
        //kopek.bilgileriGoster();
        Musteri m1=new Musteri("Ali","4011774123","Antep");
        Musteri m2=new Musteri("Haydar","50211145","Adana");
        Musteri m3=new Musteri("Demir","598124245","Mersin");
        //System.out.println(m1);
        //m1.kendiniTanit();
        m1.hayvanEkle(kedi);
        m1.hayvanEkle(kopek);
        m2.hayvanEkle(kedi1);
        m2.hayvanEkle(kopek1);
        m3.hayvanEkle(kedi2);
        m3.hayvanEkle(kopek2);
        Veteriner v1=new Veteriner("Melek","53266742","Cukurova",2);
        Veteriner v2=new Veteriner("Naz","53666212","ODTU",5);
        Veteriner v3=new Veteriner("Melek","33760782","Bogazici",1);
        //v1.kendiniTanit();
        v1.musteriEkle(m1);
        v2.musteriEkle(m2);
        v3.musteriEkle(m3);
        v1.musterileriListele();
        SehirVeterinerlikleri adana=new SehirVeterinerlikleri("adana");
        adana.sehirdekiveterinerEkle(v1);
        adana.sehirdekiveterinerEkle(v2);
        SehirVeterinerlikleri mersin=new SehirVeterinerlikleri("mersin");
        mersin.sehirdekiveterinerEkle(v3);
        adana.toplamVeteriner();
        mersin.toplamVeteriner();
        YonetimPaneli <Hayvan> hayvanYonetimPaneli=new YonetimPaneli<>();
        hayvanYonetimPaneli.bilgileriGoster(kedi);
        YonetimPaneli<Kisi> kisiYonetimPaneli=new YonetimPaneli<>();
        kisiYonetimPaneli.bilgileriGoster(m1);
        kisiYonetimPaneli.sahipOldugumHayvanlar(m1);

    }

}
