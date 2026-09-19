import java.util.Scanner;

public class GanjilGenap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan bulat:");
        int bilangan = input.nextInt();

        if (bilangan % 2 == 0) {
            System.out.println("Bilangan bulat tersebut adalah GENAP");
        } else {
            System.out.println("Bilangan bulat tersebut adalah GANJIL");
        }
    }
}
