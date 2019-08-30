package com.example.recyclercardkel10.recyclerview;

public class Entity_Mail {

    String judul;
    String subJudul;
    String about;
    String waktu;
    String logo;

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getLogo() {
        return logo;
    }

    public Entity_Mail(String judul, String subJudul, String about, String waktu, String logo){
       this.judul = judul;
       this.subJudul = subJudul;
       this.about = about;
       this.waktu = waktu;
       this.logo = logo;

    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getSubJudul() {
        return subJudul;
    }

    public void setSubJudul(String subJudul) {
        this.subJudul = subJudul;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getWaktu() {
        return waktu;
    }

    public void setWaktu(String waktu) {
        this.waktu = waktu;
    }


}
