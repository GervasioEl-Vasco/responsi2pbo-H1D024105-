package pert7;
public class EWalletPayment implements PaymentMethod {
    // Atribut yang diperlukan
    private String namaPenyedia;
    private double saldo;
    private double nominalTransaksi;
    private static final double BIAYA_TRANSAKSI = 2000.0;
    
    // Constructor untuk mengisi nilai atribut
    public EWalletPayment(String namaPenyedia, double saldoAwal, double nominalTransaksi) {
        this.namaPenyedia = namaPenyedia;
        this.saldo = saldoAwal;
        this.nominalTransaksi = nominalTransaksi;
    }
    
    // Implementasi method dari interface PaymentMethod
    
    @Override
    public void processPayment() {
        double totalBayar = nominalTransaksi + getTransactionFee();
        
        if (saldo >= totalBayar) {
            saldo -= totalBayar;
            System.out.println("Pembayaran berhasil!");
            System.out.println("Sisa saldo: " + saldo);
        } else {
            System.out.println("Pembayaran gagal! Saldo tidak cukup.");
            System.out.println("Dibutuhkan: " + totalBayar + ", Saldo tersedia: " + saldo);
        }
    }
    
    @Override
    public String getPaymentDetails() {
        return "Pembayaran dilakukan melalui " + namaPenyedia + 
               "\nNominal: " + nominalTransaksi + 
               "\nBiaya transaksi: " + getTransactionFee() + 
               "\nTotal yang harus dibayar: " + (nominalTransaksi + getTransactionFee());
    }
    
    @Override
    public double getTransactionFee() {
        return BIAYA_TRANSAKSI;
    }
    
    @Override
    public double getBalance() {
        return saldo;
    }
    
    // Getter tambahan untuk keperluan testing
    public String getNamaPenyedia() {
        return namaPenyedia;
    }
    
    public double getNominalTransaksi() {
        return nominalTransaksi;
    }
}