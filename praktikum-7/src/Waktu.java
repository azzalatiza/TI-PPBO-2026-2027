public class Waktu {
    private int jam;
    private int menit;
    private int detik;


    public Waktu(int jam, int menit, int detik) {
        this.jam = 0;
        this.menit = 0;
        this.detik = 0;

        setJam(jam);
        setMenit(menit);
        setDetik(detik);
    }

    public int getJam() {
        return jam;
    }

    public void setJam(int jam) {
        if (jam >= 0 && jam <= 23) {
            this.jam = jam;
        } else {
            System.out.println("Penolakan: Jam harus antara 0-23!");
        }
    }

    public int getMenit() {
        return menit;
    }

    public void setMenit(int menit) {
        if (menit >= 0 && menit <= 59) {
            this.menit = menit;
        } else {
            System.out.println("Penolakan: Menit harus antara 0-59!");
        }
    }

    public int getDetik() {
        return detik;
    }

    public void setDetik(int detik) {
        if (detik >= 0 && detik <= 59) {
            this.detik = detik;
        } else {
            System.out.println("Penolakan: Detik harus antara 0-59!");
        }
    }

    public void tampilkanWaktu() {
        System.out.printf("%02d:%02d:%02d%n", jam, menit, detik);
    }
}
