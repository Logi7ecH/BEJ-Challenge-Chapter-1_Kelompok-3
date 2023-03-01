package com.ivallavif;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        menu();
    }

   //Method menu, judulProgram, akhirProgram, hitungLuas, hitungVolume,
   // volumeTabung dikerjakan oleh Ivallavi Fahrazi
    private static void menu(){
        while(true){
        //Scanner
        Scanner scan = new Scanner(System.in);

        System.out.println("======================================");
        System.out.println("Kalkulator Penghitung Luas dan Volume");
        System.out.println("======================================");

        System.out.println("Menu");
        System.out.println("1. Hitung Luas Bidang");
        System.out.println("2. Hitung Volum");
        System.out.println("0. Tutup Aplikasi");
        System.out.println("======================================");
        int userChoice = scan.nextInt();

        if(userChoice == 1) hitungLuas();
        else if(userChoice == 2) hitungVolume();
        else if(userChoice == 0) break;
        }
    }
    /*
    ================================================================
    Bagian
    Method
    judulProgram dan akhirProgram
    */
    private static void judulProgram(String judul){
        System.out.println("======================================");
        System.out.println("Anda memilih " + judul);
        System.out.println("======================================");
    }

    private static void akhirProgram(){
        //Scanner
        Scanner scan = new Scanner(System.in);

        System.out.println("======================================");
        System.out.println("Tekan apa saja untuk balik ke menu utama");
        scan.next();
    }

    /*
    ===================================================================
    Bagian
    Method
    Volume
     */
    private static void hitungVolume() {
        //Scanner
        Scanner scan = new Scanner(System.in);

        System.out.println("======================================");
        System.out.println("Pilih bidang yang akan dihitung");
        System.out.println("======================================");

        System.out.println("1. Kubus");
        System.out.println("2. Balok");
        System.out.println("3. Tabung");
        System.out.println("0. Kembali ke menu sebelumnya");

        int userChoice = scan.nextInt();

        switch (userChoice){
            case 0:
                break;
            case 1:
                volumeKubus();
                break;
            case 2:
                volumeBalok();
                break;
            case 3:
                volumeTabung();
                break;
            default:
                System.out.println("Input Salah, mengalihkan ke main menu");
                break;
        }
    }

    private static void volumeTabung() {
        //Scanner
        Scanner scan = new Scanner(System.in);
        judulProgram("Tabung");

        System.out.print("Masukkan tinggi: ");
        int tinggi = scan.nextInt();
        System.out.print("Masukkan jari-jari: ");
        int jariJari = scan.nextInt();

        double volumeTabung = 3.14 * tinggi * jariJari;
        System.out.println("Volume tabung adalah " + volumeTabung);
        akhirProgram();

    }

    private static void volumeBalok() {

    }

    private static void volumeKubus() {

    }

    /*
    =======================================================================
    Bagian
    Method
    Luas
     */
    private static void hitungLuas() {
        //Scanner
        Scanner scan = new Scanner(System.in);

        System.out.println("======================================");
        System.out.println("Pilih bidang yang akan dihitung");
        System.out.println("======================================");

        System.out.println("1. Persegi");
        System.out.println("2. Lingkaran");
        System.out.println("3. Segitiga");
        System.out.println("4. Persegi Panjang");
        System.out.println("0. Kembali ke menu sebelumnya");

        int userChoice = scan.nextInt();

        switch (userChoice){
            case 0:
                break;
            case 1:
                luasPersegi();
                break;
            case 2:
                luasLingkaran();
                break;
            case 3:
                luasSegitiga();
                break;
            case 4:
                luasPersegiPanjang();
                break;
            default:
                System.out.println("Input Salah, mengalihkan ke main menu");
                break;
        }
    }

    private static void luasLingkaran() {


    }

    private static void luasSegitiga() {

    }

    private static void luasPersegiPanjang() {

    }

    private static void luasPersegi() {


    }


}