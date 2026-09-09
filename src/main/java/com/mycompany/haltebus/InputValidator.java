/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.haltebus;

/**
 *
 * @author user
 */
import java.util.Scanner;

public class InputValidator {

    public static String inputTidakKosong(Scanner input, String pesan) {
        String data;

        do {
            System.out.print(pesan);
            data = input.nextLine();

            if (data.isEmpty()) {
                System.out.println("Input tidak boleh kosong.");
            }

        } while (data.isEmpty());

        return data;
    }

    public static int inputAngkaPositif(Scanner input, String pesan) {
        int angka;

        do {
            System.out.print(pesan);
            angka = input.nextInt();
            input.nextLine();

            if (angka <= 0) {
                System.out.println("Angka harus lebih dari 0.");
            }

        } while (angka <= 0);

        return angka;
    }

    public static int inputMenu(Scanner input) {
        int pilihan;

        do {
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine();

            if (pilihan < 1 || pilihan > 5) {
                System.out.println("Menu hanya tersedia dari 1 sampai 5.");
            }

        } while (pilihan < 1 || pilihan > 5);

        return pilihan;
    }
}