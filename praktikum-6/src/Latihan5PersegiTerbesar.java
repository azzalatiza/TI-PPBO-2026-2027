public class Latihan5PersegiTerbesar {
    public static void main(String[] args) {
        Persegi[] daftarPersegi = {
                new Persegi(4),
                new Persegi(7),
                new Persegi(3),
                new Persegi(9),
                new Persegi(5)
        };

        int indeksTerbesar = 0;

        for (int i = 1; i < daftarPersegi.length; i++) {
            if (daftarPersegi[i].hitungLuas()
                    > daftarPersegi[indeksTerbesar].hitungLuas()) {
                indeksTerbesar = i;
            }
        }

        System.out.println("Daftar Luas Persegi:");

        for (int i = 0; i < daftarPersegi.length; i++) {
            System.out.println(
                    "Persegi " + (i + 1)
                            + " - Sisi: " + daftarPersegi[i].sisi
                            + ", Luas: " + daftarPersegi[i].hitungLuas()
            );
        }

        System.out.println("\nPersegi dengan luas terbesar:");
        System.out.println("Sisi: " + daftarPersegi[indeksTerbesar].sisi);
        System.out.println("Luas: " + daftarPersegi[indeksTerbesar].hitungLuas());
    }
}
