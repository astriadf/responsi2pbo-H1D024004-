public class UjiCustomer {
    public static void main(String[] args) {

        Customer c = new Customer("Budi Santoso", "CST-001", 500000);

        Member m = new Member("Siti Aminah", "MBR-110", 1250000, 240, "Gold");

        System.out.println("=== DATA CUSTOMER BELANJAKU ===");

        System.out.println("Status: Customer Biasa");
        c.tampilkanInfo();

        System.out.println();
        System.out.println("Status: Member");
        m.tampilkanInfo();
    }
}
