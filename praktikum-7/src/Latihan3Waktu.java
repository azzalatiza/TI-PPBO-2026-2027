public class Latihan3Waktu {
    public static void main(String[] args) {
        Waktu waktu = new Waktu(10, 30, 45);

        System.out.println("Waktu awal:");
        waktu.tampilkanWaktu();

        System.out.println("\nPengujian nilai di luar rentang:");
        waktu.setJam(25);
        waktu.setMenit(70);
        waktu.setDetik(80);

        System.out.println("\nWaktu setelah validasi:");
        waktu.tampilkanWaktu();

        System.out.println("\nPengujian getter:");
        System.out.println("Jam: " + waktu.getJam());
        System.out.println("Menit: " + waktu.getMenit());
        System.out.println("Detik: " + waktu.getDetik());
    }
}



