/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.haltebus;

/**
 *
 * @author user
 */
public class Halte {
    private String idHalte;
    private String namaHalte;
    private String lokasi;
    private int kapasitas;
    private String ruteBus;

    public Halte(String idHalte, String namaHalte, String lokasi,
                 int kapasitas, String ruteBus) {
        this.idHalte = idHalte;
        this.namaHalte = namaHalte;
        this.lokasi = lokasi;
        this.kapasitas = kapasitas;
        this.ruteBus = ruteBus;
    }

    public String getIdHalte() {
        return idHalte;
    }

    public String getNamaHalte() {
        return namaHalte;
    }

    public String getLokasi() {
        return lokasi;
    }

    public int getKapasitas() {
        return kapasitas;
    }

    public String getRuteBus() {
        return ruteBus;
    }

    public void setNamaHalte(String namaHalte) {
        this.namaHalte = namaHalte;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }

    public void setKapasitas(int kapasitas) {
        this.kapasitas = kapasitas;
    }

    public void setRuteBus(String ruteBus) {
        this.ruteBus = ruteBus;
    }

    public void tampilkanInfo() {
        System.out.println("ID Halte   : " + idHalte);
        System.out.println("Nama Halte : " + namaHalte);
        System.out.println("Lokasi     : " + lokasi);
        System.out.println("Kapasitas  : " + kapasitas);
        System.out.println("Rute Bus   : " + ruteBus);
    }
}