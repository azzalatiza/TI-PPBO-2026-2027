public class BankDemo {
    public static void main(String[] args) {
        // Membuat objek rekening pertama dengan jenis Tabungan
        RekeningBank rek1 = new RekeningBank(
                "001", "Budi", "Tabungan", 100000
        );

        // Membuat objek rekening kedua dengan jenis Giro
        RekeningBank rek2 = new RekeningBank(
                "002", "Andi", "Giro", 200000
        );

        // Menampilkan data awal kedua rekening
        System.out.println("===== DATA REKENING AWAL =====");
        rek1.cetakMutasi();
        rek2.cetakMutasi();

        // Pengujian method setor
        System.out.println("\n===== PENGUJIAN SETOR =====");

        // Setor berhasil karena jumlah lebih dari nol
        rek1.setor(50000);

        // Setor gagal karena jumlah negatif
        rek1.setor(-1000);

        // Pengujian method tarik
        System.out.println("\n===== PENGUJIAN TARIK =====");

        // Tarik berhasil karena saldo mencukupi
        rek1.tarik(30000);

        // Tarik gagal karena saldo tidak mencukupi
        rek1.tarik(500000);

        // Pengujian method transfer
        System.out.println("\n===== PENGUJIAN TRANSFER =====");

        // Transfer berhasil karena saldo mencukupi
        rek1.transfer(rek2, 50000);

        // Transfer gagal karena saldo tidak mencukupi
        rek1.transfer(rek2, 500000);

        // Menampilkan mutasi akhir rekening pertama dan kedua
        System.out.println("\n===== MUTASI AKHIR REKENING =====");

        rek1.cetakMutasi();
        rek2.cetakMutasi();
    }
}
