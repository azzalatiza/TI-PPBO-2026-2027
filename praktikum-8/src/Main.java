// Praktikum 8 - Inheritance
public class Main {
    public static void main(String[] args) {

        // Membuat objek Manager
        System.out.println("=== DATA MANAGER ===");
        Manager manager = new Manager(
                "Andi", "001", 8000000, 2000000
        );
        manager.tampilkanData();

        System.out.println();

        // Membuat objek Staff
        System.out.println("=== DATA STAFF ===");
        Staff staff = new Staff(
                "Budi", "002", 5000000, 1000000
        );
        staff.tampilkanData();

        System.out.println();

        // Membuat objek Direktur
        System.out.println("=== DATA DIREKTUR ===");
        Direktur direktur = new Direktur(
                "Citra", "003", 12000000, 3000000, 5000000
        );
        direktur.tampilkanData();
    }
}


