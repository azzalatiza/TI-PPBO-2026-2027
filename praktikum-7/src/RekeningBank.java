public class RekeningBank {

        // Atribut private untuk menyimpan data rekening
    private String nomorRekening;
    private String pemilik;
    private String jenisRekening;
    private double saldo;

    // Constructor untuk menginisialisasi data rekening
    public RekeningBank(String nomor, String pemilik,
    String jenisRekening, double saldoAwal) {
        this.nomorRekening = nomor;
        this.pemilik = pemilik;
        this.jenisRekening = jenisRekening;

        // Memastikan saldo awal tidak bernilai negatif
        this.saldo = (saldoAwal >= 0) ? saldoAwal : 0;
    }
    // Getter untuk mengambil nomor rekening
    public String getNomorRekening() {
        return nomorRekening;
    }

    // Getter untuk mengambil nama pemilik rekening
    public String getPemilik() {
        return pemilik;
    }

    // Setter untuk mengubah nama pemilik rekening
    public void setPemilik(String pemilik) {
        if (pemilik != null && !pemilik.trim().isEmpty()) {
            this.pemilik = pemilik;
        } else {
            System.out.println("Nama pemilik tidak boleh kosong.");
        }
    }

    // Getter untuk mengambil jenis rekening
    // Tidak menyediakan setter karena jenis rekening bersifat read-only
    public String getJenisRekening() {
        return jenisRekening;
    }

    // Getter untuk mengambil saldo rekening
    // Saldo hanya dapat diubah melalui transaksi yang tervalidasi
    public double getSaldo() {
        return saldo;
    }
    // Method untuk melakukan penyetoran uang
    public void setor(double jumlah) {

        // Memeriksa apakah jumlah setor valid
        if (jumlah <= 0) {
            System.out.println("Setor gagal! Jumlah harus lebih dari 0.");
            return;
        }

        // Menambahkan jumlah setoran ke saldo
        saldo += jumlah;

        System.out.println("Setor berhasil sebesar Rp" + jumlah);
        System.out.println("Saldo sekarang: Rp" + saldo);
    }

    // Method untuk melakukan penarikan uang
    public void tarik(double jumlah) {

        // Memeriksa apakah jumlah penarikan valid
        if (jumlah <= 0) {
            System.out.println("Tarik gagal! Jumlah harus lebih dari 0.");
        }

        // Memeriksa apakah saldo mencukupi
        else if (jumlah > saldo) {
            System.out.println("Tarik gagal! Saldo tidak mencukupi.");
        }

        // Mengurangi saldo jika semua validasi terpenuhi
        else {
            saldo -= jumlah;

            System.out.println("Tarik berhasil sebesar Rp" + jumlah);
            System.out.println("Saldo sekarang: Rp" + saldo);
        }
    }

    // Method untuk melakukan transfer ke rekening lain
    public void transfer(RekeningBank tujuan, double jumlah) {
        // Memastikan rekening tujuan tersedia
        if (tujuan == null) {
            System.out.println("Transfer gagal! Rekening tujuan tidak valid.");
            return;
        }

        // Memastikan transfer tidak dilakukan ke rekening sendiri
        if (tujuan == this) {
            System.out.println("Transfer gagal! Tidak dapat transfer ke rekening sendiri.");
            return;
        }

        // Memastikan jumlah transfer harus lebih dari nol
        if (jumlah <= 0) {
            System.out.println("Transfer gagal! Jumlah harus lebih dari 0.");
            return;
        }

        // Memastikan saldo pengirim mencukupi
        if (jumlah > saldo) {
            System.out.println("Transfer gagal! Saldo tidak mencukupi.");
            return;
        }

        // Mengurangi saldo pengirim dan menambahkan saldo penerima
        saldo -= jumlah;
        tujuan.saldo += jumlah;

        System.out.println("Transfer berhasil sebesar Rp" + jumlah);
        System.out.println("Dari rekening: " + nomorRekening);
        System.out.println("Ke rekening: " + tujuan.nomorRekening);
        System.out.println("Sisa saldo pengirim: Rp" + saldo);
    }

    // Method untuk menampilkan mutasi atau informasi rekening
    public void cetakMutasi() {

        System.out.println("\n================================");
        System.out.println("        MUTASI REKENING");
        System.out.println("================================");
        System.out.println("Nomor Rekening : " + nomorRekening);
        System.out.println("Nama Pemilik   : " + pemilik);
        System.out.println("Jenis Rekening : " + jenisRekening);
        System.out.println("Saldo          : Rp" + saldo);
        System.out.println("================================");
    }
}











