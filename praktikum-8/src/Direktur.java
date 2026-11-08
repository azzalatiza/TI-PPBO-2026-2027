public class Direktur extends Manager {
    private double tunjanganSaham;

    public Direktur(String nama, String nip, double gajiPokok,
                    double tunjanganJabatan, double tunjanganSaham) {
        super(nama, nip, gajiPokok, tunjanganJabatan);

        System.out.println("3. Constructor Direktur dijalankan");
        this.tunjanganSaham = tunjanganSaham;
    }
}
