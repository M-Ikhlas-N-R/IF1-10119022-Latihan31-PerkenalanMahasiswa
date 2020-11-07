package com.mikhlasnr;

/*
 * @author
 * Nama              : M Ikhlas N R
 * Kelas             : IF-1
 * NIM               : 10119022
 * Deskripsi Program : Program Perkenalan Mahasiswa Latihan 31
 *
 */
public class Main extends Mahasiswa {
    public static void main(String[] args) {
        // Create instance
        Main mahasiswa1 = new Main();
        Main mahasiswa2 = new Main();
        Main mahasiswa3 = new Main();
        Main mahasiswa4 = new Main();

        // Assign value
        mahasiswa1.nama = "Rizki Adam Kurniawan";
        mahasiswa1.nim = "10110269";

        mahasiswa2.nama = "Indra Tiola";
        mahasiswa2.nim = "10110270";

        mahasiswa3.nama = "Robi Tanzil Ganefi";
        mahasiswa3.nim = "10110271";

        mahasiswa4.nama = "Muhammad Nur Awaludin";
        mahasiswa4.nim = "10110269";

        // Show Film
        mahasiswa1.perkenalkanDiri();
        mahasiswa2.perkenalkanDiri();
        mahasiswa3.perkenalkanDiri();
        mahasiswa4.perkenalkanDiri();
    }
}
