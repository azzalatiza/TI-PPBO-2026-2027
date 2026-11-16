public class BangunDatar {
    // Atribut protected sesuai ketentuan (a)
    protected String namaBangun;

    // Constructor untuk inisialisasi namaBangun
    public BangunDatar(String namaBangun) {
        this.namaBangun = namaBangun;
    }

    // Method default hitungLuas() mengembalikan 0
    public double hitungLuas() {
        return 0;
    }

    // Method default hitungKeliling() mengembalikan 0
    public double hitungKeliling() {
        return 0;
    }

    // Ketentuan (c): TIDAK di-override, memanggil hitungLuas() & hitungKeliling() secara polimorfik
    public void tampilkanInfo() {
        System.out.println("Nama Bangun : " + namaBangun);
        System.out.println("Luas        : " + hitungLuas());
        System.out.println("Keliling    : " + hitungKeliling());
        System.out.println("------------------------------------");
    }
}