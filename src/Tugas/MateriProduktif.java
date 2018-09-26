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
public class MateriProduktif extends Matematika {

    String materi;

    public MateriProduktif(String namaSekolah, String namaGuru, String pelajaran, String materi) {
        super(namaSekolah, namaGuru, pelajaran);
        this.materi = materi;
    }

    public void tampil() {
        System.out.println("Materi : " + materi);
    }

}
