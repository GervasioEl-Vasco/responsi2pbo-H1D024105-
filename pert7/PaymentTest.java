package pert7;
public class PaymentTest {
    public static void main(String[] args) {
        System.out.println("=== PROGRAM SISTEM PEMBAYARAN (E-WALLET) ===\n");
        
        // Membuat objek EWalletPayment
        EWalletPayment pembayaran = new EWalletPayment("OVO", 150000.0, 50000.0);
        
        // 1. Menampilkan data sebelum transaksi
        System.out.println("=== DATA SEBELUM TRANSAKSI ===");
        System.out.println("Saldo awal: " + pembayaran.getBalance());
        System.out.println("Nama penyedia: " + pembayaran.getNamaPenyedia());
        System.out.println("Nominal transaksi: " + pembayaran.getNominalTransaksi());
        System.out.println("Biaya transaksi: " + pembayaran.getTransactionFee());
        System.out.println();
        
        // 2. Memproses pembayaran
        System.out.println("Memproses pembayaran sebesar " + pembayaran.getNominalTransaksi() + "...");
        System.out.println();
        
        pembayaran.processPayment();
        System.out.println();
        
        // 3. Menampilkan data setelah transaksi
        System.out.println("=== DATA SETELAH TRANSAKSI ===");
        System.out.println("Detail Transaksi: " + pembayaran.getPaymentDetails());
        System.out.println();
        
        // Contoh transaksi lain dengan saldo tidak cukup
        System.out.println("\n=== UJI TRANSAKSI DENGAN SALDO TIDAK CUKUP ===");
        EWalletPayment pembayaran2 = new EWalletPayment("Dana", 10000.0, 9000.0);
        System.out.println("Saldo awal: " + pembayaran2.getBalance());
        System.out.println("Memproses pembayaran sebesar " + pembayaran2.getNominalTransaksi() + "...");
        pembayaran2.processPayment();
    }
}