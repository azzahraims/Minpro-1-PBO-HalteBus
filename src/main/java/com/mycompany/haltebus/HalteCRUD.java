/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.haltebus;

/**
 *
 * @author user
 */
import java.util.ArrayList;

public class HalteCRUD {

    private ArrayList<Halte> daftarHalte;

    public HalteCRUD() {
        daftarHalte = new ArrayList<>();
    }

    // CREATE
    public void tambahHalte(Halte halte) {
        daftarHalte.add(halte);
        System.out.println("Data halte berhasil ditambahkan.");
    }

    // READ
    public void tampilkanSemuaHalte() {
        if (daftarHalte.isEmpty()) {
            System.out.println("Belum ada data halte.");
            return;
        }

        System.out.println("\n=== DAFTAR HALTE ===");

        for (Halte halte : daftarHalte) {
            halte.tampilkanInfo();
            System.out.println("---------------------------");
        }
    }

    public Halte cariHalte(String idHalte) {
        for (Halte halte : daftarHalte) {
            if (halte.getIdHalte().equalsIgnoreCase(idHalte)) {
                return halte;
            }
        }

        return null;
    }

    // UPDATE
    public void ubahHalte(String idHalte, String namaBaru,
                          String lokasiBaru, int kapasitasBaru,
                          String ruteBaru) {

        Halte halte = cariHalte(idHalte);

        if (halte != null) {
            halte.setNamaHalte(namaBaru);
            halte.setLokasi(lokasiBaru);
            halte.setKapasitas(kapasitasBaru);
            halte.setRuteBus(ruteBaru);

            System.out.println("Data halte berhasil diubah.");
        } else {
            System.out.println("Halte tidak ditemukan.");
        }
    }

    // DELETE
    public void hapusHalte(String idHalte) {
        Halte halte = cariHalte(idHalte);

        if (halte != null) {
            daftarHalte.remove(halte);
            System.out.println("Data halte berhasil dihapus.");
        } else {
            System.out.println("Halte tidak ditemukan.");
        }
    }
}