package pert8;
public class ProgrammerMagang implements KaryawanKontrak, AksesSistem {
    
    // ==========================================================
    // ATRIBUT/STATE (Dibutuhkan untuk menyimpan data objek)
    // ==========================================================
    private String nama;
    private double gajiPerJam;
    private String pinRahasia;
    private boolean sedangLogin;
    
    // ==========================================================
    // CONSTRUCTOR
    // ==========================================================
    public ProgrammerMagang(String nama, double gajiPerJam, String pinRahasia) {
        this.nama = nama;
        this.gajiPerJam = gajiPerJam;
        this.pinRahasia = pinRahasia;
        this.sedangLogin = false;
    }
    
    // ==========================================================
    // IMPLEMENTASI METHOD DARI KaryawanKontrak
    // ==========================================================
    @Override
    public double hitungGaji(int jamKerja) {
        double totalGaji = jamKerja * gajiPerJam;
        System.out.println("Gaji " + nama + " (" + jamKerja + " jam) adalah: Rp " + totalGaji);
        return totalGaji;
    }
    
    @Override
    public void perpanjangKontrak(int durasiBulan) {
        System.out.println("Kontrak diperpanjang " + durasiBulan + " bulan.");
    }
    
    @Override
    public String getStatusCuti() {
        return "Tersedia 5 hari";
    }
    
    // ==========================================================
    // IMPLEMENTASI METHOD DARI AksesSistem
    // ==========================================================
    @Override
    public void login(String pin) {
        if (pin.equals(pinRahasia)) {
            sedangLogin = true;
            System.out.println("Login Berhasil. Selamat datang, " + nama + "!");
        } else {
            System.out.println("Login Gagal: PIN salah.");
        }
    }
    
    @Override
    public void logout() {
        sedangLogin = false;
        System.out.println(nama + " berhasil logout.");
    }
    
    @Override
    public String getRoleAkses() {
        return "Magang IT";
    }
    
    // ==========================================================
    // GETTER (Opsional, untuk akses ke atribut)
    // ==========================================================
    public String getNama() {
        return nama;
    }
    
    public boolean isSedangLogin() {
        return sedangLogin;
    }
}