package com.example.kredifaiz;


public class Kullanici {
    private String kullaniciAdi;
    private String kullaniciSifre;
    private String kullaniciUID;
    private String homeDizi;
    private String acilisTarih;
    private String kalanSure;

    public String getKullaniciUID() {
        return kullaniciUID;
    }

    public void setKullaniciUID(String kullaniciUID) {
        this.kullaniciUID = kullaniciUID;
    }

    public String getHomeDizi() {
        return homeDizi;
    }

    public void setHomeDizi(String homeDizi) {
        this.homeDizi = homeDizi;
    }

    public String getAcilisTarih() {
        return acilisTarih;
    }

    public void setAcilisTarih(String acilisTarih) {
        this.acilisTarih = acilisTarih;
    }

    public String getKalanSure() {
        return kalanSure;
    }

    public void setKalanSure(String kalanSure) {
        this.kalanSure = kalanSure;
    }

    public Kullanici(String kullaniciAdi, String kullaniciSifre) {
        this.kullaniciAdi = kullaniciAdi;
        this.kullaniciSifre = kullaniciSifre;
    }//kanka nerede kayıt ediyorduk
    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }

    public String getKullaniciSifre() {
        return kullaniciSifre;
    }

    public void setKullaniciSifre(String kullaniciSifre) {
        this.kullaniciSifre = kullaniciSifre;
    }
}
