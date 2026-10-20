public class Latihan3Produk {
    public static void main(String[] args) {
        Produk p1 = new Produk("Laptop", 8500000);
        Produk p2 = new Produk("Mouse", 150000);
        Produk p3 = new Produk("Keyboard", 750000);

        double batasHarga = 1000000;

        System.out.println("Batas Harga: Rp" + batasHarga);
        System.out.println();

        System.out.println("Nama Produk: " + p1.namaProduk);
        System.out.println("Harga: Rp" + p1.harga);
        System.out.println("Mahal: " + p1.isMahal(batasHarga));
        System.out.println();

        System.out.println("Nama Produk: " + p2.namaProduk);
        System.out.println("Harga: Rp" + p2.harga);
        System.out.println("Mahal: " + p2.isMahal(batasHarga));
        System.out.println();

        System.out.println("Nama Produk: " + p3.namaProduk);
        System.out.println("Harga: Rp" + p3.harga);
        System.out.println("Mahal: " + p3.isMahal(batasHarga));
    }
}





