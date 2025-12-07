public class PaymentTest {

    public static void main(String[] args) {

        EWalletPayment e = new EWalletPayment("OVO", 150000, 50000);

        System.out.println("=== PROGRAM SISTEM PEMBAYARAN (E-WALLET) ===");
        System.out.println("Saldo awal: " + e.getBalance());
        System.out.println("Memproses pembayaran sebesar " + 50000);
        e.processPayment();
        System.out.println("Sisa saldo: " + e.getBalance());
        System.out.println("Detail Transaksi: " + e.getPaymentDetails());
    }
}
