public class OperasiArrayy {
    public static void main(String[] args) {
        // langkah 9 - hitung total dan rata rata
        int[] nilai = {80, 75, 90, 60, 88};
        int total = 0;

        for (int n : nilai) {
            total += n; // sama dengan total = total + n;
        }
        double rataRata = (double) total / nilai.length;

        System.out.println("Total: " + total);
        System.out.println("Rata-rata: " + rataRata);

        // langkah 10 - cari nilai maksimum dan minimum
        int max = nilai[0];
        int min = nilai[0];
        for (int i = 1; i < nilai.length; i++) {
            if (nilai[i] > max) {
                max = nilai[i];
            }
            if (nilai[i] < min) {
                min = nilai[i];
            }
        }
        System.out.println("Nilai Maksimum: " + max);
        System.out.println("Nilai Minimum: " + min);

        //langkah 11 - pencarian data (linear search)
        int cari = 90;
        int posisi = -1; // -1 berarti belum/tidak ditemukan
        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] == cari) {
                posisi = i;
                break; //hentikan pencarian begitu ditemukan
            }
        }
        if (posisi != -1) {
            System.out.println("Nilai " + cari + " ditemukan di indeks " + posisi);
        } else {
            System.out.println("Nilai " + cari + " tidak ditemukan");
        }
    }
}
