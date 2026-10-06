import java.util.Scanner;

public class Latihan5 {

    static int hitungTotal(int[] data) {
        int total = 0;

        for (int nilai : data) {
            total += nilai;
        }

        return total;
    }

    static int[] filterDiAtasRataRata(int[] data) {
        double rataRata = (double) hitungTotal(data) / data.length;

        int jumlah = 0;

        for (int nilai : data) {
            if (nilai > rataRata) {
                jumlah++;
            }
        }

        int[] hasil = new int[jumlah];
        int index = 0;

        for (int nilai : data) {
            if (nilai > rataRata) {
                hasil[index] = nilai;
                index++;
            }
        }

        return hasil;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah data: ");
        int jumlah = input.nextInt();

        int[] data = new int[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan data ke-" + (i + 1) + ": ");
            data[i] = input.nextInt();
        }

        int total = hitungTotal(data);
        double rataRata = (double) total / data.length;

        System.out.println("\nTotal: " + total);
        System.out.println("Rata-rata: " + rataRata);

        int[] hasil = filterDiAtasRataRata(data);

        System.out.print("Nilai di atas rata-rata: ");

        for (int nilai : hasil) {
            System.out.print(nilai + " ");
        }

        input.close();
    }
}
