package com.pbo;

public class Main {

    public static void main(String[] args) {
	    Dosen dosen = new Dosen();
        dosen.setNip("41227829930");
        dosen.setNama("Adam Kurniawan");
        dosen.setUmur(27);
        dosen.setMataKuliah("PBO");

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.setNim("10110269");
        mahasiswa.setNama("Nindi");
        mahasiswa.setUmur(17);
        mahasiswa.setKelas("PBO2");

        System.out.println("NIP DOSEN\t: ".concat(dosen.getNip()));
        dosen.siapaKamu();
        dosen.mengajarApa();

        System.out.println();
        System.out.println("NIM MAHASISWA\t: ".concat(mahasiswa.getNim()));
        mahasiswa.siapaKamu();
        mahasiswa.kelasApa();
    }
}
