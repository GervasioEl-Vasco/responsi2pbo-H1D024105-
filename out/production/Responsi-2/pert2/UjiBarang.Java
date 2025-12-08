package pert2;
class UjiBarang {
    public static void main(String[] args) {

        // Buat gitar dengan constructor pertama (kode + nama)
        BarangMusik gitar = new BarangMusik("GTR-001", "Gitar Akustik Yamaha");

        // Atur harga dan stok gitar
        gitar.ubahHarga(1500000.0);
        gitar.tambahStok(5);

        // Buat drum dengan constructor lengkap
        BarangMusik drum = new BarangMusik("DRM-001", "Drum Set Pearl", 8500000.0, 3);

        // Tampilkan hasil
        System.out.println("=== INVENTARIS TOKO NADAKITA ===");
        gitar.tampilInfo();
        drum.tampilInfo();
    }
}
