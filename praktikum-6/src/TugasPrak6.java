public class TugasPrak6 {
    public static void main(String[] args) {

        // Membuat array berisi lima objek produk
        TugasBarang[] daftarBarang = {
                new TugasBarang("P001", "Laptop", 7500000, 10),
                new TugasBarang("P002", "Mouse", 150000, 20),
                new TugasBarang("P003", "Keyboard", 350000, 15),
                new TugasBarang("P004", "Monitor", 1800000, 8),
                new TugasBarang("P005", "Headset", 250000, 12)
        };

        // Menampilkan seluruh data produk
        System.out.println("========================================");
        System.out.println("             DAFTAR PRODUK");
        System.out.println("========================================");

        for (TugasBarang barang : daftarBarang) {
            barang.tampilkanData();
            System.out.println("----------------------------------------");
        }

        double totalBelanja = 0;

        // Simulasi pembelian pertama: stok mencukupi
        System.out.println("\n========================================");
        System.out.println("       SIMULASI PEMBELIAN PERTAMA");
        System.out.println("========================================");

        TugasBarang barang1 = daftarBarang[0];
        int jumlahBeli1 = 2;

        System.out.println("Nama produk : " + barang1.namaProduk);
        System.out.println("Harga satuan: Rp" +
                String.format("%,.0f", barang1.harga));
        System.out.println("Jumlah beli : " + jumlahBeli1);

        if (jumlahBeli1 > 0 && barang1.stok >= jumlahBeli1) {
            double subtotal1 = barang1.hitungTotalHarga(jumlahBeli1);

            barang1.kurangiStok(jumlahBeli1);
            totalBelanja += subtotal1;

            System.out.println("Subtotal    : Rp" +
                    String.format("%,.0f", subtotal1));
        } else {
            barang1.kurangiStok(jumlahBeli1);
        }

        // Simulasi pembelian kedua: stok tidak mencukupi
        System.out.println("\n========================================");
        System.out.println("       SIMULASI PEMBELIAN KEDUA");
        System.out.println("========================================");

        TugasBarang barang2 = daftarBarang[1];
        int jumlahBeli2 = 25;

        System.out.println("Nama produk : " + barang2.namaProduk);
        System.out.println("Harga satuan: Rp" +
                String.format("%,.0f", barang2.harga));
        System.out.println("Jumlah beli : " + jumlahBeli2);

        if (jumlahBeli2 > 0 && barang2.stok >= jumlahBeli2) {
            double subtotal2 = barang2.hitungTotalHarga(jumlahBeli2);

            barang2.kurangiStok(jumlahBeli2);
            totalBelanja += subtotal2;

            System.out.println("Subtotal    : Rp" +
                    String.format("%,.0f", subtotal2));
        } else {
            barang2.kurangiStok(jumlahBeli2);
        }

        // Menampilkan total belanja
        System.out.println("\n========================================");
        System.out.println("            TOTAL BELANJA");
        System.out.println("========================================");
        System.out.println("Total belanja berhasil: Rp" +
                String.format("%,.0f", totalBelanja));

        // Mencari produk dengan harga termahal
        TugasBarang barangTermahal = daftarBarang[0];

        for (int i = 1; i < daftarBarang.length; i++) {
            if (daftarBarang[i].harga > barangTermahal.harga) {
                barangTermahal = daftarBarang[i];
            }
        }

        System.out.println("\n========================================");
        System.out.println("            PRODUK TERMAHAL");
        System.out.println("========================================");
        barangTermahal.tampilkanData();

        // Menampilkan stok setelah simulasi pembelian
        System.out.println("\n========================================");
        System.out.println("          STOK AKHIR PRODUK");
        System.out.println("========================================");

        for (TugasBarang barang : daftarBarang) {
            System.out.println(
                    barang.namaProduk + " - Stok: " + barang.stok
            );
        }

        System.out.println("========================================");
        System.out.println("          PROGRAM SELESAI");
        System.out.println("========================================");
    }
}





