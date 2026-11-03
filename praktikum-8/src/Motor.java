public class Motor extends Kendaraan {
    private String jenisMotor;

    public Motor(String merek, int kecepatanMaks, String jenisMotor) {
        super(merek, kecepatanMaks);
        this.jenisMotor = jenisMotor;
    }
}