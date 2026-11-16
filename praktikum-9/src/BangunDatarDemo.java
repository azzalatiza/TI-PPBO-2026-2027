public class BangunDatarDemo {
    public static void main(String[] args) {
        // Ketentuan d: Array bertipe BangunDatar minimal 5 objek campuran ketiga subclass
        BangunDatar[] daftarBangun = {
                new Lingkaran("Lingkaran A", 7),
                new Persegi("Persegi B", 5),
                new PersegiPanjang("Persegi Panjang C", 8, 4),
                new Lingkaran("Lingkaran D", 10),
                new PersegiPanjang("Persegi Panjang E", 12, 6)
        };

        double totalLuas = 0;
        BangunDatar bangunTerbesar = daftarBangun[0];

        System.out.println("=== INFORMASI SETIAP BANGUN DATAR ===");
        // Satu perulangan untuk menampilkan info, menghitung total luas, dan mencari luas terbesar
        for (BangunDatar bd : daftarBangun) {
            // Memanggil tampilkanInfo() secara polimorfik
            bd.tampilkanInfo();

            double luasSaatIni = bd.hitungLuas();
            totalLuas += luasSaatIni;

            // Logika pencarian bangun dengan luas terbesar
            if (luasSaatIni > bangunTerbesar.hitungLuas()) {
                bangunTerbesar = bd;
            }
        }

        // Menampilkan rekapitulasi total luas dan bangun terluas
        System.out.println("=== HASIL PERHITUNGAN ===");
        System.out.println("TOTAL luas seluruh bangun : " + totalLuas);
        System.out.println("Bangun dengan LUAS TERBESAR:");
        System.out.println("- Nama Bangun : " + bangunTerbesar.namaBangun);
        System.out.println("- Nilai Luas  : " + bangunTerbesar.hitungLuas());
    }
}