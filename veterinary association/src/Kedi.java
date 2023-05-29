public class Kedi extends Hayvan {
    private String tur;
    private String cins;

    public Kedi(String isim, String renk, String dogumTarihi, boolean kayit,String cins) {
        super(isim, renk, dogumTarihi, kayit);
        tur="Kedi";
        this.cins=cins;
    }
    public String getTur() {
        return tur;
    }

    public void setTur(String tur) {
        this.tur = tur;
    }

    public String getCins() {
        return cins;
    }

    public void setCins(String cins) {
        this.cins = cins;
    }

    @Override
    void bilgileriGoster() {
        System.out.println(super.toString()+toString());

    }

    @Override
    public String toString() {
        return super.toString()+"Kedi{" +
                "tur='" + tur + '\'' +
                ", cins='" + cins + '\'' +
                '}';
    }
}
