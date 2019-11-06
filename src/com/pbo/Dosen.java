package com.pbo;

public class Dosen extends Manusia {

    private String nip, mataKuliah;

    public String getNip() {
        return nip;
    }

    public String getMataKuliah() {
        return mataKuliah;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public void setMataKuliah(String mataKuliah) {
        this.mataKuliah = mataKuliah;
    }

    public void mengajarApa() {
        System.out.println(String.format("Saya %s umur %d tahun sedang sedang mengajar matakuliah %s ",
                getNama(), getUmur(), getMataKuliah()));
    }

    @Override
    public void siapaKamu() {
        System.out.println("Saya Dosen");
    }
}
