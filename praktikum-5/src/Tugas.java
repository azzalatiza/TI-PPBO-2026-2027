import java.util.ArrayList;
import java.util.Scanner;

public class Tugas {
    // Method untuk menghitung penjumlahan 2 bilangan
    // Menerima 2 parameter dan mengembalikan hasil penjumlahan
    static double tambah(double a, double b) {
        return a + b;
    }

    // Method overloading untuk menghitung penjumlahan 3 bilangan
    // Menerima 3 parameter dan mengembalikan hasil penjumlahan
    static double tambah(double a, double b, double c) {
        return a + b + c;
    }

    // Method untuk menghitung pengurangan 2 bilangan
    static double kurang(double a, double b) {
        return a - b;
    }

    // Method untuk menghitung perkalian 2 bilangan
    static double kali(double a, double b) {
        return a * b;
    }

    // Method untuk menghitung pembagian 2 bilangan
    static double bagi(double a, double b) {
        return a / b;
    }

    // Method untuk menghitung perpangkatan
    static double pangkat(double a, double b) {
        return Math.pow(a, b);
    }

    // Method untuk menghitung akar kuadrat
    static double akarKuadrat(double a) {
        return Math.sqrt(a);
    }

    // Method untuk mencari nilai maksimum dari array riwayat
    static double riwayatKeMaksimum(double[] riwayat) {
        // Menganggap nilai pertama sebagai nilai maksimum sementara
        double maksimum = riwayat[0];

        // Membandingkan setiap nilai untuk mencari nilai terbesar
        for (double nilai : riwayat) {
            if (nilai > maksimum) {
                maksimum = nilai;
            }
        }

        // Mengembalikan nilai terbesar
        return maksimum;
    }

    public static void main(String[] args) {

        // Scanner digunakan untuk membaca input dari pengguna
        Scanner input = new Scanner(System.in);

        // ArrayList digunakan untuk menyimpan semua hasil perhitungan
        ArrayList<Double> riwayat = new ArrayList<>();

        // Variabel untuk menyimpan pilihan menu
        int pilihan;

        // Menu akan terus berjalan sampai pengguna memilih 0
        do {
            System.out.println("\n=== KALKULATOR METHOD ===");
            System.out.println("1. Tambah 2 bilangan");
            System.out.println("2. Tambah 3 bilangan");
            System.out.println("3. Kurang");
            System.out.println("4. Kali");
            System.out.println("5. Bagi");
            System.out.println("6. Pangkat");
            System.out.println("7. Akar Kuadrat");
            System.out.println("0. Keluar");

            // Meminta pengguna memilih operasi
            System.out.print("Pilih operasi: ");
            pilihan = input.nextInt();

            // Variabel untuk menyimpan hasil perhitungan
            double hasil = 0;

            // Menentukan operasi berdasarkan pilihan pengguna
            switch (pilihan) {

                // Pilihan 1 untuk penjumlahan 2 bilangan
                case 1:
                    System.out.print("Masukkan bilangan pertama: ");
                    double a1 = input.nextDouble();

                    System.out.print("Masukkan bilangan kedua: ");
                    double b1 = input.nextDouble();

                    // Memanggil method tambah dengan 2 parameter
                    hasil = tambah(a1, b1);

                    // Menampilkan hasil
                    System.out.println("Hasil: " + hasil);

                    // Menyimpan hasil ke riwayat
                    riwayat.add(hasil);
                    break;

                // Pilihan 2 untuk penjumlahan 3 bilangan
                case 2:
                    System.out.print("Masukkan bilangan pertama: ");
                    double a2 = input.nextDouble();

                    System.out.print("Masukkan bilangan kedua: ");
                    double b2 = input.nextDouble();

                    System.out.print("Masukkan bilangan ketiga: ");
                    double c2 = input.nextDouble();

                    // Memanggil method tambah dengan 3 parameter
                    // Ini merupakan contoh method overloading
                    hasil = tambah(a2, b2, c2);

                    // Menampilkan hasil
                    System.out.println("Hasil: " + hasil);

                    // Menyimpan hasil ke riwayat
                    riwayat.add(hasil);
                    break;

                // Pilihan 3 untuk pengurangan
                case 3:
                    System.out.print("Masukkan bilangan pertama: ");
                    double a3 = input.nextDouble();

                    System.out.print("Masukkan bilangan kedua: ");
                    double b3 = input.nextDouble();

                    // Memanggil method kurang
                    hasil = kurang(a3, b3);

                    // Menampilkan hasil
                    System.out.println("Hasil: " + hasil);

                    // Menyimpan hasil ke riwayat
                    riwayat.add(hasil);
                    break;

                // Pilihan 4 untuk perkalian
                case 4:
                    System.out.print("Masukkan bilangan pertama: ");
                    double a4 = input.nextDouble();

                    System.out.print("Masukkan bilangan kedua: ");
                    double b4 = input.nextDouble();

                    // Memanggil method kali
                    hasil = kali(a4, b4);

                    // Menampilkan hasil
                    System.out.println("Hasil: " + hasil);

                    // Menyimpan hasil ke riwayat
                    riwayat.add(hasil);
                    break;

                // Pilihan 5 untuk pembagian
                case 5:
                    System.out.print("Masukkan bilangan pertama: ");
                    double a5 = input.nextDouble();

                    System.out.print("Masukkan bilangan kedua: ");
                    double b5 = input.nextDouble();

                    // Mengecek agar tidak terjadi pembagian dengan nol
                    if (b5 == 0) {
                        System.out.println("Tidak bisa membagi dengan 0.");
                    } else {

                        // Memanggil method bagi
                        hasil = bagi(a5, b5);

                        // Menampilkan hasil
                        System.out.println("Hasil: " + hasil);

                        // Menyimpan hasil ke riwayat
                        riwayat.add(hasil);
                    }
                    break;

                // Pilihan 6 untuk perpangkatan
                case 6:
                    System.out.print("Masukkan bilangan: ");
                    double a6 = input.nextDouble();

                    System.out.print("Masukkan pangkat: ");
                    double b6 = input.nextDouble();

                    // Memanggil method pangkat
                    hasil = pangkat(a6, b6);

                    // Menampilkan hasil
                    System.out.println("Hasil: " + hasil);

                    // Menyimpan hasil ke riwayat
                    riwayat.add(hasil);
                    break;

                // Pilihan 7 untuk akar kuadrat
                case 7:
                    System.out.print("Masukkan bilangan: ");
                    double a7 = input.nextDouble();

                    // Mengecek agar bilangan tidak negatif
                    if (a7 < 0) {
                        System.out.println("Bilangan tidak boleh negatif.");
                    } else {

                        // Memanggil method akarKuadrat
                        hasil = akarKuadrat(a7);

                        // Menampilkan hasil
                        System.out.println("Hasil: " + hasil);

                        // Menyimpan hasil ke riwayat
                        riwayat.add(hasil);
                    }
                    break;

                // Pilihan 0 untuk keluar dari program
                case 0:
                    System.out.println("\nProgram selesai.");

                    // Mengecek apakah sudah ada hasil perhitungan
                    if (!riwayat.isEmpty()) {

                        // Membuat array untuk menyimpan riwayat
                        double[] dataRiwayat = new double[riwayat.size()];

                        // Memindahkan data dari ArrayList ke array
                        for (int i = 0; i < riwayat.size(); i++) {
                            dataRiwayat[i] = riwayat.get(i);
                        }

                        // Menampilkan jumlah perhitungan
                        System.out.println(
                                "Jumlah perhitungan: " + dataRiwayat.length
                        );

                        // Memanggil method untuk mencari nilai maksimum
                        double maksimum = riwayatKeMaksimum(dataRiwayat);

                        // Menampilkan nilai maksimum
                        System.out.println("Nilai maksimum: " + maksimum);

                        // Menampilkan semua hasil perhitungan
                        System.out.println("Riwayat hasil:");

                        for (double nilai : dataRiwayat) {
                            System.out.println("- " + nilai);
                        }
                    } else {
                        // Jika belum ada perhitungan
                        System.out.println("Belum ada hasil perhitungan.");
                    }

                    break;

                // Jika pilihan tidak ada di menu
                default:
                    System.out.println("Pilihan tidak tersedia.");
            }

            // Perulangan berhenti jika pengguna memilih 0
        } while (pilihan != 0);

        // Menutup Scanner
        input.close();
    }
}









