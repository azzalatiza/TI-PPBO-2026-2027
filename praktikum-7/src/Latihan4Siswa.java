public class Latihan4Siswa {
    public static void main(String[] args) {
        Siswa siswa = new Siswa();

        System.out.println("=== PENGUJIAN NILAI SISWA ===");

        siswa.setNilai(90);
        System.out.println("Nilai: 90");
        System.out.println("Nilai huruf: " + siswa.getNilaiHuruf());

        System.out.println();

        siswa.setNilai(72);
        System.out.println("Nilai: 72");
        System.out.println("Nilai huruf: " + siswa.getNilaiHuruf());

        System.out.println();

        siswa.setNilai(110);
        System.out.println("Nilai huruf setelah penolakan: " + siswa.getNilaiHuruf());

        System.out.println();

        siswa.setNilai(45);
        System.out.println("Nilai: 45");
        System.out.println("Nilai huruf: " + siswa.getNilaiHuruf());
    }
}
