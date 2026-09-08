import java.util.Scanner;

public class KonversiSuhu {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan suhu celcius: ");
        double celcius = sc.nextDouble();

        double fahrenheit = celcius * 9 / 5 + 32;

        System.out.println("Suhu Fahrenheeit: " + fahrenheit);

        sc.close();
    }
}
