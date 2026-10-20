public class Latihan4ArrayBuku {
    public static void main(String[] args) {
        Buku[] daftarBuku = {
                new Buku("Laskar Pelangi", "Andre Hirata", 2005),
                new Buku("Bumi", "Tere Liye", 2014),
                new Buku("Dilan 1990", "Pidi Baiq", 2018),
                new Buku("Laut Bercerita", "Leila S. Chudori", 2017),
                new Buku("Hujan", "Tere Liye", 2016)
        };

        System.out.println("Buku yang terbit setelah tahun 2015");

        for (int i = 0; i < daftarBuku.length; i++) {
            if (daftarBuku[i].tahunTerbit > 2015) {
                System.out.println(
                        daftarBuku[i].judul + " - "
                                + daftarBuku[i].tahunTerbit
                );
            }
        }
    }
}
