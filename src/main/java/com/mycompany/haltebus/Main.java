/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.haltebus;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        HalteCRUD halteCRUD = new HalteCRUD();

        int pilihan;

        do {

            System.out.println("\n=================================");
            System.out.println("   SISTEM MANAJEMEN HALTE BUS");
            System.out.println("=================================");
            System.out.println("1. Tambah Halte");
            System.out.println("2. Lihat Data Halte");
            System.out.println("3. Ubah Data Halte");
            System.out.println("4. Hapus Halte");
            System.out.println("5. Keluar");
            System.out.println("=================================");

            pilihan = InputValidator.inputMenu(input);

            switch (pilihan) {

                case 1:

                    System.out.println("\n=== TAMBAH HALTE ===");

                    String idHalte =
                            InputValidator.inputTidakKosong(
                                    input,
                                    "ID Halte: "
                            );

                    if (halteCRUD.cariHalte(idHalte) != null) {
                        System.out.println(
                                "ID halte sudah digunakan."
                        );
                        break;
                    }

                    String namaHalte =
                            InputValidator.inputTidakKosong(
                                    input,
                                    "Nama Halte: "
                            );

                    String lokasi =
                            InputValidator.inputTidakKosong(
                                    input,
                                    "Lokasi Halte: "
                            );

                    int kapasitas =
                            InputValidator.inputAngkaPositif(
                                    input,
                                    "Kapasitas Halte: "
                            );

                    String ruteBus =
                            InputValidator.inputTidakKosong(
                                    input,
                                    "Rute Bus: "
                            );

                    Halte halteBaru = new Halte(
                            idHalte,
                            namaHalte,
                            lokasi,
                            kapasitas,
                            ruteBus
                    );

                    halteCRUD.tambahHalte(halteBaru);

                    break;

                case 2:

                    halteCRUD.tampilkanSemuaHalte();

                    break;

                case 3:

                    System.out.println("\n=== UBAH DATA HALTE ===");

                    String idUpdate =
                            InputValidator.inputTidakKosong(
                                    input,
                                    "Masukkan ID Halte: "
                            );

                    Halte halteDitemukan =
                            halteCRUD.cariHalte(idUpdate);

                    if (halteDitemukan == null) {
                        System.out.println(
                                "Halte tidak ditemukan."
                        );
                        break;
                    }

                    System.out.println("\nData halte ditemukan:");
                    halteDitemukan.tampilkanInfo();

                    System.out.println("\nMasukkan data baru.");

                    String namaBaru =
                            InputValidator.inputTidakKosong(
                                    input,
                                    "Nama Halte Baru: "
                            );

                    String lokasiBaru =
                            InputValidator.inputTidakKosong(
                                    input,
                                    "Lokasi Baru: "
                            );

                    int kapasitasBaru =
                            InputValidator.inputAngkaPositif(
                                    input,
                                    "Kapasitas Baru: "
                            );

                    String ruteBaru =
                            InputValidator.inputTidakKosong(
                                    input,
                                    "Rute Bus Baru: "
                            );

                    halteCRUD.ubahHalte(
                            idUpdate,
                            namaBaru,
                            lokasiBaru,
                            kapasitasBaru,
                            ruteBaru
                    );

                    break;

                case 4:

                    System.out.println("\n=== HAPUS HALTE ===");

                    String idHapus =
                            InputValidator.inputTidakKosong(
                                    input,
                                    "Masukkan ID Halte: "
                            );

                    halteCRUD.hapusHalte(idHapus);

                    break;

                case 5:

                    System.out.println(
                            "\nTerima kasih telah menggunakan "
                            + "Sistem Manajemen Halte Bus."
                    );

                    break;
            }

        } while (pilihan != 5);

        input.close();
    }
}