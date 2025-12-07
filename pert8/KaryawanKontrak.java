package pert8;
public interface KaryawanKontrak {
    
    // ==========================================================
    // METHOD ABSTRAK (WAJIB DIIMPLEMENTASIKAN DI CLASS ProgramerMagang)
    // ==========================================================
    
    // DEKLARASI METHOD 1: hitungGaji
    double hitungGaji(int jamKerja);
    
    // DEKLARASI METHOD 2: perpanjangKontrak
    void perpanjangKontrak(int durasiBulan);
    
    // ==========================================================
    // DEFAULT METHOD (OPSIONAL DI-OVERRIDE)
    // ==========================================================
    
    // DEKLARASI DEFAULT METHOD: getStatusCuti
    default String getStatusCuti() {
        return "Tersedia 12 hari";
    }
}