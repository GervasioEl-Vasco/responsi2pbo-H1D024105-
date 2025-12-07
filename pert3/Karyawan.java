package pert3;
class Karyawan {
    // Variabel dasar, gunakan protected agar bisa diakses oleh subclass
    protected String nama;
    protected double gajiPokok;

    // Constructor
    Karyawan(String nama, double gajiPokok) {
        this.nama = nama;
        this.gajiPokok = gajiPokok;
    }

    // Method menampilkan info dasar
    void tampilInfo() {
        System.out.println("Nama: " + nama + " | Gaji Pokok: Rp " + gajiPokok);
    }
}