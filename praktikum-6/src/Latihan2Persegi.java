public class Latihan2Persegi {
    public static void main(String[] args) {
        Persegi p1 = new Persegi(4);
        Persegi p2 = new Persegi(6);
        Persegi p3 = new Persegi(8);

        System.out.println("Persegi 1");
        System.out.println("Sisi: " + p1.sisi);
        System.out.println("Luas: " + p1.hitungLuas());
        System.out.println("Keliling: " + p1.hitungKeliling());

        System.out.println("\nPersegi 2");
        System.out.println("Sisi: " + p2.sisi);
        System.out.println("Luas: " + p2.hitungLuas());
        System.out.println("Keliling: " + p2.hitungKeliling());

        System.out.println("\nPersegi 3");
        System.out.println("Sisi: " + p3.sisi);
        System.out.println("Luas: " + p3.hitungLuas());
        System.out.println("Keliling: " + p3.hitungKeliling());
    }
}
