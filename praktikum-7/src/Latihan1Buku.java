
public class Latihan1Buku {
    public static void main(String[] args) {
        Buku buku1 = new Buku("Laskar Pelangi", "Andrea Hirata", 2005);
        Buku buku2 = new Buku("Bumi", "Tere Liye", 2014);

        buku1.setJudul("Sang Pemimpi");
        buku1.setPengarang("Andrea Hirata");

        buku1.tampilkanData();
        buku2.tampilkanData();
    }
}