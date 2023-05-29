abstract public class Hayvan {
    private String isim;
    private String renk;
    private String dogumTarihi;
    private boolean kayit;

    public Hayvan(String isim, String renk, String dogumTarihi, boolean kayit) {
        this.isim = isim;
        this.renk = renk;
        this.dogumTarihi = dogumTarihi;
        this.kayit = kayit;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getDogumTarihi() {
        return dogumTarihi;
    }

    public void setDogumTarihi(String dogumTarihi) {
        this.dogumTarihi = dogumTarihi;
    }

    public boolean isKayit() {
        return kayit;
    }

    public void setKayit(boolean kayit) {
        this.kayit = kayit;
    }
    abstract void bilgileriGoster();

    @Override
    public String toString() {
        return "Hayvan{" +
                "isim='" + isim + '\'' +
                ", renk='" + renk + '\'' +
                ", dogumTarihi='" + dogumTarihi + '\'' +
                ", kayit=" + kayit +
                '}';
    }
}
