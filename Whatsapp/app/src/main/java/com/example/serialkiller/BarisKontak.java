package com.example.serialkiller;

public class BarisKontak {
    private int foto;
    private String nama, deskripsi;

    public BarisKontak(int fot, String nam, String desk){
        setFoto(fot);
        setNama(nam);
        setDeskripsi(desk);
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int profil) {
        this.foto = profil;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

}
