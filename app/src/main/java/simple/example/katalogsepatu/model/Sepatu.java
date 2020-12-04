package simple.example.katalogsepatu.model;

public class Sepatu {
    private String jenis;
    private String tipe;
    private String buatan;
    private String deskripsi;
    private int drawableRes;

    public Sepatu(String jenis, String tipe, String buatan, String deskripsi, int drawableRes) {
        this.jenis = jenis;
        this.tipe = tipe;
        this.buatan = buatan;
        this.deskripsi = deskripsi;
        this.drawableRes = drawableRes;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getTipe() {
        return tipe;
    }

    public void setTipe(String ras) {
        this.tipe = tipe;
    }

    public String getBuatan() {
        return buatan;
    }

    public void setBuatan(String asal) {
        this.buatan = buatan;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public int getDrawableRes() {
        return drawableRes;
    }

    public void setDrawableRes(int drawableRes) {
        this.drawableRes = drawableRes;
    }
}