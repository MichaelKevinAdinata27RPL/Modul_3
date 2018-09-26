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
public class MateriMat extends Matematika {

    String materi;

    public MateriMat(String namaSekolah, String namaGuru, String pelajaran, String materi) {
        super(namaSekolah, namaGuru, pelajaran);
        this.materi = materi;
    }

    public void tampil() {
        System.out.println("Materi : " + materi);
    }

}
