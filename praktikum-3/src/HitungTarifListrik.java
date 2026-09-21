import java.util.Scanner;
public class HitungTarifListrik {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk membaca input dari pengguna
        Scanner input = new Scanner(System.in);

        // Menentukan konstanta tarif listrik per kWh untuk setiap golongan daya
        // Nilai tarif dibuat sebagai konstanta agar tidak berubah selama program berjalan
        final double TARIF_450 = 415;
        final double TARIF_900 = 1352;
        final double TARIF_1300 = 1444.70;
        final double TARIF_2200 = 1444.70;
        final double TARIF_DI_ATAS_2200 = 1444.70;

        // Menampilkan judul dan pilihan golongan daya yang tersedia
        System.out.println("=== PROGRAM HITUNG TARIF LISTRIK ===");
        System.out.println("Pilihan daya: 450, 900, 1300, 2200, atau di atas 2200 VA");

        // Meminta pengguna memasukkan golongan daya listrik dalam satuan VA
        System.out.print("Masukkan golongan daya (VA): ");
        int daya = input.nextInt();

        // Meminta pengguna memasukkan jumlah pemakaian listrik dalam satuan kWh
        System.out.print("Masukkan jumlah pemakaian (kWh): ");
        double kWh = input.nextDouble();

        // Memeriksa apakah jumlah pemakaian kWh valid
        // Jika kWh negatif atau sama dengan 0, program menampilkan pesan error
        // sehingga tagihan tidak dihitung
        if (kWh < 0 || kWh == 0) {
            System.out.println("Error: Pemakaian kWh harus lebih dari 0.");
        } else {
            // Variabel tarif digunakan untuk menyimpan tarif sesuai golongan daya
            double tarif = 0;

            // Variabel golongan digunakan untuk menyimpan nama golongan daya
            String golongan;

            // Menentukan tarif listrik berdasarkan golongan daya yang dipilih
            // Switch-case digunakan untuk memeriksa pilihan daya

            switch (daya) {
                case 450:
                    tarif = TARIF_450;
                    golongan = "450 VA";
                    break;

                case 900:
                    tarif = TARIF_900;
                    golongan = "900 VA";
                    break;

                case 1300:
                    tarif = TARIF_1300;
                    golongan = "1300 VA";
                    break;

                case 2200:
                    tarif = TARIF_2200;
                    golongan = "2200 VA";
                    break;

                default:
                    // Jika daya tidak sama dengan pilihan di atas,
                    // program memeriksa apakah daya lebih dari 2200 VA
                    if (daya > 2200) {
                        tarif = TARIF_DI_ATAS_2200;
                        golongan = "Di atas 2200 VA";
                    } else {
                        // Jika daya tidak sesuai pilihan dan tidak lebih dari 2200 VA,
                        // maka input dianggap tidak valid
                        System.out.println("Error: Golongan daya tidak valid.");
                        return;
                    }

            }

            // Menghitung total tagihan dengan rumus:
            // total tagihan = jumlah pemakaian kWh × tarif per kWh
            double total = kWh * tarif;

            // Menampilkan hasil perhitungan tagihan listrik
            System.out.println("\n=== HASIL PERHITUNGAN ===");
            System.out.println("Golongan daya : " + golongan);
            System.out.println("Pemakaian     : " + kWh + " kWh");
            System.out.println("Tarif per kWh : Rp" + tarif);
            System.out.println("Total tagihan : Rp" + total);
        }

    }
}



