public class Kopek extends Hayvan {
    private String tur;
    private String cins;
    private int asiSayisi;

    public Kopek(String isim, String renk, String dogumTarihi, boolean kayit,String cins,int asiSayisi) {
        super(isim, renk, dogumTarihi, kayit);
        tur="Köpek";
        this.cins=cins;
        if(asiSayisi<=0) {
            this.asiSayisi=0;
        }else {
            this.asiSayisi=asiSayisi;
        }

    }


    @Override
    void bilgileriGoster() {
        System.out.println(super.toString()+toString());
    }

    @Override
    public String toString() {
        return super.toString()+"Kopek{" +
                "tur='" + tur + '\'' +
                ", cins='" + cins + '\'' +
                ", asiSayisi=" + asiSayisi +
                '}';
    }
}
