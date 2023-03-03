import java.util.Scanner;

public class HitungVolume {
    private static void volumeKubus(){
        // Input
        Scanner input = new Scanner(System.in);
        JudulProgram("Kubus");
        
        // Perhitungan
        System.out.print("Masukkan panjang sisi kubus: ");
        double sisi = input.nextDouble();
        double volumeKubus = sisi * sisi * sisi;
        System.out.println("");
        System.out.println("Processing...");

        // Hasil Perhitungan
        System.out.println("Volume kubus adalah: " + volumeKubus);
    }

    private static void volumeBalok() {
        // Input
        Scanner input = new Scanner(System.in);
        JudulProgram("Balok");
        
        // Perhitungan
        System.out.print("Masukkan panjang balok: ");
        double panjang = input.nextDouble();
        System.out.print("Masukkan lebar balok: ");
        double lebar = input.nextDouble();
        System.out.print("Masukkan tinggi balok: ");
        double tinggi = input.nextDouble();
        double volumeBalok = panjang * lebar * tinggi;
        System.out.println("");
        System.out.println("Processing...");

        // Hasil Perhitungan
        System.out.println("Volume balok adalah: " + volumeBalok);
    }
}
