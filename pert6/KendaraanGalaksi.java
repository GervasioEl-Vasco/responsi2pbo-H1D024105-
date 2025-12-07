package pert6;
public abstract class KendaraanGalaksi {

    // ==========================================================
    // ATRIBUT/STATE (semua private)
    // ==========================================================
    private String namaKendaraan;
    private int levelEnergi;
    private int kapasitasPenumpang;

    // ==========================================================
    // CONSTRUCTOR
    // ==========================================================
    public KendaraanGalaksi(String namaKendaraan, int kapasitasPenumpang) {
        this.namaKendaraan = namaKendaraan;
        this.kapasitasPenumpang = kapasitasPenumpang;
        this.levelEnergi = 100;
    }

    // ==========================================================
    // GETTER
    // ==========================================================
    public String getNamaKendaraan() {
        return namaKendaraan;
    }
    
    public int getLevelEnergi() {
        return levelEnergi;
    }
    
    public int getKapasitasPenumpang() {
        return kapasitasPenumpang;
    }
    
    // ==========================================================
    // SETTER (ditambahkan untuk mengubah levelEnergi)
    // ==========================================================
    protected void setLevelEnergi(int levelEnergi) {
        this.levelEnergi = levelEnergi;
    }

    // ==========================================================
    // METHOD BIASA
    // ==========================================================
    public final void tampilStatus() {
        System.out.println(namaKendaraan + " | Energi: " + levelEnergi + "% | Kapasitas: " + kapasitasPenumpang + " awak");
    }

    // ==========================================================
    // ABSTRACT METHOD (WAJIB DIIMPLEMENTASI SUBCLASS)
    // ==========================================================
    public abstract void aktifkanMesin();
    
    public abstract void jelajah(int jarak);
    
    public abstract void isiEnergi(int jumlah);
}