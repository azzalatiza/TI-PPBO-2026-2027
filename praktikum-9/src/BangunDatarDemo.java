public class BangunDatarDemo {
    public static void main(String[] args) {
        BangunDatar[] daftarBangun = {
                new Lingkaran(7),
                new Persegi(4),
                new Lingkaran(10),
                new Persegi(5)
        };

        double totalLuas = 0;
        int nomor = 1; // Counter untuk penomoran bangun
        for (BangunDatar bd : daftarBangun) {
            double luas = bd.hitungLuas(); // dynamic binding
            totalLuas += luas;
            System.out.println("Luas bangun ke-" + nomor + ": " + luas);
            nomor++;
        }

        System.out.println("TOTAL luas seluruh bangun: " + totalLuas);
    }
}