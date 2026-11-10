public class Staff extends Pegawai {
    private double tunjanganKinerja;

    public Staff(String nama, String nip, double gajiPokok,
                 double tunjanganKinerja) {
        super(nama, nip, gajiPokok);
        this.tunjanganKinerja = tunjanganKinerja;
    }

    // Getter tunjangan kinerja
    public double getTunjanganKinerja() {
        return tunjanganKinerja;
    }

    // LANGKAH 7: Override hitungGaji() pada Staff
    @Override
    public double hitungGaji() {
        return gajiPokok + tunjanganKinerja;
    }
}