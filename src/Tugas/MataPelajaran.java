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
public class MataPelajaran {

    String namaSekolah;

    public MataPelajaran(String namaSekolah) {
        this.namaSekolah = namaSekolah;
    }

    public void tampil() {
        System.out.println("Nama Sekolah : " + namaSekolah);
    }

}
