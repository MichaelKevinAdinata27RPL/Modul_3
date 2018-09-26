/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author HP
 */
public class Matematika extends MataPelajaran {

    String namaGuru, pelajaran;

    public Matematika(String namaSekolah, String namaGuru, String pelajaran) {
        super(namaSekolah);
        this.namaGuru = namaGuru;
        this.pelajaran = pelajaran;
    }

    public void tampil() {
        System.out.println("Nama Guru : " + namaGuru);
        System.out.println("Pelajaran : " + pelajaran);
    }
}
