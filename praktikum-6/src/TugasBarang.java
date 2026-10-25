public class TugasBarang {
    String kodeProduk;
    String namaProduk;
    double harga;
    int stok;

    // Constructor
    public TugasBarang(String kodeProduk, String namaProduk, double harga, int stok) {
        this.kodeProduk = kodeProduk;
        this.namaProduk = namaProduk;
        this.harga = harga;
        this.stok = stok;
    }

    // Method menghitung total harga pembelian
    public double hitungTotalHarga(int jumlahBeli) {
        return harga * jumlahBeli;
    }

    // Method mengurangi stok produk
    public void kurangiStok(int jumlah) {
        if (jumlah > 0 && stok >= jumlah) {
            stok -= jumlah;
            System.out.println("Pembelian berhasil!");
            System.out.println("Jumlah dibeli : " + jumlah);
            System.out.println("Sisa stok     : " + stok);
        } else {
            System.out.println("Pembelian gagal! Stok tidak mencukupi.");
            System.out.println("Stok tersedia : " + stok);
            System.out.println("Jumlah diminta: " + jumlah);
        }
    }

    // Method menampilkan data produk
    public void tampilkanData() {
        System.out.println("Kode Produk : " + kodeProduk);
        System.out.println("Nama Produk : " + namaProduk);
        System.out.println("Harga       : Rp" + String.format("%,.0f", harga));
        System.out.println("Stok        : " + stok);
    }
}
