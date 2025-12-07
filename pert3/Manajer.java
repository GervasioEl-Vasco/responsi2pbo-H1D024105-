package pert3;
class Manajer extends Karyawan {
    // Variabel tambahan
    double tunjangan;

    // Constructor
    Manajer(String nama, double gajiPokok, double tunjangan) {
        super(nama, gajiPokok);  // memanggil constructor parent
        this.tunjangan = tunjangan;
    }

    // Override method tampilInfo
    @Override
    void tampilInfo() {
        System.out.println("Nama: " + nama + " Gaji Pokok: Rp " + gajiPokok + " Tunjangan: Rp " + tunjangan);
        System.out.println("Total Pendapatan: Rp " + (gajiPokok + tunjangan));
    }
}