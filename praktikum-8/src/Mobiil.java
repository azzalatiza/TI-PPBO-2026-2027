public class Mobiil extends Kendaraan {
    private int jumlahPintu;

    public Mobiil(String merek, int kecepatanMaks, int jumlahPintu) {
        super(merek, kecepatanMaks);
        this.jumlahPintu = jumlahPintu;
    }

    public void tampilkanInfo() {
        System.out.println("Merek: " + merek);
        System.out.println("Kecepatan Maksimal: " + kecepatanMaks);
    }
}