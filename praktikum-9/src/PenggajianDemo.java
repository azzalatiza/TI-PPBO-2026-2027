public class PenggajianDemo {
    public static void main(String[] args) {
        Pegawai[] daftarPegawai = {
                new Manager("Budi", "M001", 3000000, 1000000),
                new Staff("Siti", "S001", 2000000, 500000),
                new Staff("Andi", "S002", 2000000, 300000),
                // Penambahan object Direktur (Latihan 4 & 5)
                new Direktur("Rina", "D001", 5000000, 2000000, 1500000)
        };

        double totalGaji = 0;
        for (Pegawai pg : daftarPegawai) {
            double gaji = pg.hitungGaji(); // versi sesuai jenis object aslinya
            System.out.println(pg.nama + ": " + gaji);
            totalGaji += gaji;
        }

        System.out.println("Total gaji: " + totalGaji);
    }
}