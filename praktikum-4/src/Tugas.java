import java.util.Scanner;

public class Tugas {
    public static void main(String[] args) {

        // Membuat objek Scanner untuk membaca input dari pengguna
        Scanner input = new Scanner(System.in);

        // Menentukan nilai KKM
        int KKM = 70;

        // Meminta jumlah mahasiswa
        System.out.print("Masukkan jumlah mahasiswa: ");
        int N = input.nextInt();

        // Membuat array untuk menyimpan nilai mahasiswa
        int[] nilai = new int[N];

        // Membaca nilai setiap mahasiswa menggunakan perulangan for
        for (int i = 0; i < N; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = input.nextInt();
        }

        // Menampilkan array nilai sebelum diurutkan
        System.out.println("\n========================================");
        System.out.println("           LAPORAN NILAI KELAS");
        System.out.println("========================================");

        System.out.print("Nilai sebelum diurutkan : ");
        for (int i = 0; i < N; i++) {
            System.out.print(nilai[i]);
            if (i < N - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        // Menentukan nilai tertinggi dan terendah
        int nilaiTertinggi = nilai[0];
        int nilaiTerendah = nilai[0];

        for (int i = 1; i < N; i++) {
            if (nilai[i] > nilaiTertinggi) {
                nilaiTertinggi = nilai[i];
            }
            if (nilai[i] < nilaiTerendah) {
                nilaiTerendah = nilai[i];
            }
        }

        // Menghitung total nilai dan jumlah mahasiswa lulus/tidak lulus
        int totalNilai = 0;
        int jumlahLulus = 0;
        int jumlahTidakLulus = 0;

        for (int i = 0; i < N; i++) {
            totalNilai += nilai[i];

            if (nilai[i] >= KKM) {
                jumlahLulus++;
            } else {
                jumlahTidakLulus++;
            }
        }

        // Menghitung nilai rata-rata kelas
        double rataRata = (double) totalNilai / N;

        // Mengurutkan nilai menggunakan algoritma Bubble Sort
        for (int i = 0; i < N - 1; i++) {
            for (int j = 0; j < N - 1 - i; j++) {
                if (nilai[j] > nilai[j + 1]) {
                    int temp = nilai[j];
                    nilai[j] = nilai[j + 1];
                    nilai[j + 1] = temp;
                }
            }
        }

        // Menampilkan hasil pengolahan nilai
        System.out.println("----------------------------------------");
        System.out.println("Jumlah mahasiswa       : " + N);
        System.out.printf("Nilai rata-rata        : %.2f%n", rataRata);
        System.out.println("Nilai tertinggi        : " + nilaiTertinggi);
        System.out.println("Nilai terendah         : " + nilaiTerendah);
        System.out.println("KKM                    : " + KKM);
        System.out.println("Jumlah mahasiswa lulus : " + jumlahLulus);
        System.out.println("Jumlah tidak lulus     : " + jumlahTidakLulus);

        // Menampilkan array setelah diurutkan
        System.out.print("Nilai setelah diurutkan : ");
        for (int i = 0; i < N; i++) {
            System.out.print(nilai[i]);
            if (i < N - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        System.out.println("========================================");

        // Menutup Scanner
        input.close();
    }
}