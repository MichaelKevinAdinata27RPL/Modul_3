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
public class Uji {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MataPelajaran mapel = new MataPelajaran("SMK Telkom Malang");
        Matematika mat = new Matematika("SMK Telkom Malang", "Pak Tulus", "Matematika");
        BahasaInd indo = new BahasaInd("SMK Telkom Malang", "Pak Agus", "Bahasa Indonesia");
        Produktif prod = new Produktif("SMK Telkom Malang", "Pak Arifin", "Produktif RPL");
        MateriIndo materi1 = new MateriIndo("SMK Telkom Malang", "Pak Agus", "Bahasa Indonesia", "Teks eksposisi");
        MateriMat materi = new MateriMat("SMK Telkom Malang", "Pak Tulus", "Matematika", "Logaritma");
        MateriProduktif materi2 = new MateriProduktif("SMK Telkom Malang", "Pak Arifin", "Produktif RPL", "PBO");
        
        mapel.tampil();
        System.out.println("");
        mat.tampil();
        materi.tampil();
        System.out.println("");
        indo.tampil();
        materi1.tampil();
        System.out.println("");
        prod.tampil();
        materi2.tampil();
        System.out.println("");
        
    }
    
}
