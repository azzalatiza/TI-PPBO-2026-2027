import java.util.Scanner;

public class BilanganTerbesar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan pertama: ");
        int a = input.nextInt();

        System.out.print("Masukkan bilangan kedua: ");
        int b = input.nextInt();

        System.out.print("Masukkan bilangan ketiga: ");
        int c = input.nextInt();

        if (a >= b) {
            if (a >= c) {
                System.out.println("Bilangan terbesar: " + a);
            } else {
                System.out.println("Bilangan terbesar: " + c);
            }
        } else {
            if (b >= c) {
                System.out.println("Bilangan terbesar: " + b);
            } else {
                System.out.println("Bilangan terbesar: " + c);
            }
        }
    }
}