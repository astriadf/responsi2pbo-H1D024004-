public class EWalletPayment implements PaymentMethod {
    String namaLayanan;
    double saldo;
    double nominal;

    EWalletPayment(String nama, double saldo, double nominal) {
        this.namaLayanan = nama;
        this.saldo = saldo;
        this.nominal = nominal;
    }

    @Override
    public void processPayment() {
        if (saldo >= nominal) {
            saldo -= nominal;
            System.out.println("Pembayaran berhasil!");
        } else {
            System.out.println("Pembayaran gagal! Saldo tidak cukup.");
        }
    }

    @Override
    public String getPaymentDetails() {
        return "Pembayaran dilakukan melalui " + namaLayanan;
    }

    @Override
    public double getTransactionFee() {
        return 2000;
    }

    @Override
    public double getBalance() {
        return saldo;
    }
}
