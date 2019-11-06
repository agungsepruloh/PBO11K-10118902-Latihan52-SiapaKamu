package com.pbo;

public class Mahasiswa extends Manusia {

    private String nim, kelas;

    public String getNim() {
        return nim;
    }

    public String getKelas() {
        return kelas;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public void kelasApa() {
        System.out.println(String.format("Saya %s umur %d tahun sedang belajar di kelas %s",
                getNama(), getUmur(), getKelas()));
    }

    @Override
    public void siapaKamu() {
        System.out.println("Saya Mahasiswa");
    }
}
