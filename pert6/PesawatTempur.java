package pert6;
public class PesawatTempur extends KendaraanGalaksi {

    // ==========================================================
    // ATRIBUT KHUSUS
    // ==========================================================
    private int jumlahRudal;

    // ==========================================================
    // CONSTRUCTOR
    // ==========================================================
    public PesawatTempur(String namaKendaraan, int kapasitasPenumpang, int jumlahRudal) {
        super(namaKendaraan, kapasitasPenumpang);
        this.jumlahRudal = jumlahRudal;
    }

    // ==========================================================
    // IMPLEMENTASI ABSTRACT METHOD
    // ==========================================================
    @Override
    public void aktifkanMesin() {
        if (getLevelEnergi() < 20) {
            System.out.println("Energi terlalu rendah! Mesin tidak dapat diaktifkan.");
        } else {
            System.out.println("Mesin pesawat tempur diaktifkan.");
        }
    }
    
    @Override
    public void jelajah(int jarak) {
        int energiDibutuhkan = jarak * 3;
        
        if (energiDibutuhkan > getLevelEnergi()) {
            System.out.println("Energi tidak mencukupi untuk menjelajah sejauh " + jarak + " km.");
        } else {
            setLevelEnergi(getLevelEnergi() - energiDibutuhkan);
            System.out.println("Pesawat tempur menjelajah sejauh " + jarak + " km.");
        }
    }
    
    @Override
    public void isiEnergi(int jumlah) {
        int energiBaru = Math.min(100, getLevelEnergi() + jumlah);
        System.out.println("Mengisi energi pesawat tempur dari " + getLevelEnergi() + "% menjadi " + energiBaru + "%");
        setLevelEnergi(energiBaru);
    }

    // ==========================================================
    // METHOD KHUSUS
    // ==========================================================
    public void tembakRudal(int jumlah) {
        if (jumlah > jumlahRudal) {
            System.out.println("Rudal tidak mencukupi! Hanya tersedia " + jumlahRudal + " rudal.");
        } else {
            jumlahRudal -= jumlah;
            System.out.println("Menembakkan " + jumlah + " rudal!");
        }
    }
}