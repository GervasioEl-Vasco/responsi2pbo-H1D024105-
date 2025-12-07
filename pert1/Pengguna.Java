package pert1;

class Pengguna {
    // Tuliskan state (variabel) yang diperlukan di sini
    // Jangan lupa tambahkan konstanta faktorAktivitas
    int umur;
    double berat;
    double tinggi;
    final double faktorAktivitas = 1.2;

    double hitungBMI() {
        // Lengkapi method ini
        double tinggiMeter = tinggi / 100.0;
        return berat / (tinggiMeter * tinggiMeter);
    }

    void tampilKategori() {
        // Lengkapi method ini
        double bmi = hitungBMI();
        if (bmi < 18.5) {
            System.out.println("Kategori: Kurus");
        } else if (bmi < 25) {
            System.out.println("Kategori: Normal");
        } else {
            System.out.println("Kategori: Obesitas");
        }
    }

    double hitungKalori() {
        // Lengkapi method ini
        return berat * faktorAktivitas * 10;
    }

    void tampilInfo() {
        // Lengkapi method ini
        System.out.println("=== Informasi Kesehatan Pengguna ===");
        System.out.println("Umur: " + umur + " tahun");
        System.out.println("Berat: " + berat + " kg");
        System.out.println("Tinggi: " + tinggi + " cm");
        System.out.printf("BMI: %.2f\n", hitungBMI());
        tampilKategori();
        System.out.println("Kebutuhan Kalori: " + (int)hitungKalori() + " kal/hari");
        System.out.println("====================================\n");
    }
}
