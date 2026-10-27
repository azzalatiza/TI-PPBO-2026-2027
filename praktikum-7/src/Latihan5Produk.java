public class Latihan5Produk {
    public static void main(String[] args) {
        Produk produk = new Produk("P001", "Keyboard", 150000, 10);

        System.out.println("=== DATA PRODUK AWAL ===");
        produk.tampilkanProduk();

        System.out.println("\n=== MENAMBAH STOK ===");
        produk.tambahStok(5);
        System.out.println("Stok sekarang: " + produk.getStok());

        System.out.println("\n=== MENGURANGI STOK ===");
        produk.kurangiStok(3);
        System.out.println("Stok sekarang: " + produk.getStok());

        System.out.println("\n=== PENGUJIAN VALIDASI ===");
        produk.setHarga(-50000);
        produk.tambahStok(0);
        produk.kurangiStok(-2);
        produk.kurangiStok(20);

        System.out.println("\n=== DATA PRODUK AKHIR ===");
        produk.tampilkanProduk();
    }
}
