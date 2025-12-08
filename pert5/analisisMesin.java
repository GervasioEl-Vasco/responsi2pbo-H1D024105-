package pert5;
class analisisMesin {
    public static void main(String[] args) {
        defaultMesin[] mesin = new defaultMesin[5];
        mesin[0] = new mesinMotor("Honda Supra X", 125, "Bebek");
        mesin[1] = new mesinTraktor("Kubota MX5200", 520, 5.0);
        mesin[2] = new mesinTraktorListrik("EcoTrac Z900", 300, 4.2, 70);
        mesin[3] = new mesinMotor("Yamaha R25", 250, "Sport");
        mesin[4] = new mesinTraktorListrik("Volta FarmX", 200, 3.5, 80);

        System.out.println("DATA MESIN MEGATECH");
        for (defaultMesin m : mesin) {
            m.tampilInfo();
            System.out.println("Kategori: " + m.kategoriMesin());
            System.out.println("Performa: " + m.nilaiPerforma());
            System.out.println();
        }

        System.out.println("SUARA MESIN");
        for (defaultMesin m : mesin) {
            if (m instanceof mesinMotor motor) {
                motor.suaraMesin();
            } else if (m instanceof mesinTraktor traktor) {
                traktor.suaraMesin();
            } else if (m instanceof mesinTraktorListrik listrik) {
                listrik.suaraMesin();
            }
        }

        System.out.println("\nMESIN PERFORMA TERTINGGI");

        // Cari performa tertinggi
        defaultMesin terbaik = mesin[0];
        for (defaultMesin m : mesin) {
            if (m.nilaiPerforma() > terbaik.nilaiPerforma()) {
                terbaik = m;
            }
        }
        System.out.println(terbaik.namaMesin + " " + terbaik.nilaiPerforma());

        System.out.println("\nTOP 3 MESIN TERBAIK");
        for (int i = 0; i < mesin.length - 1; i++) {
            for (int j = i + 1; j < mesin.length; j++) {
                if (mesin[j].nilaiPerforma() > mesin[i].nilaiPerforma()) {
                    defaultMesin temp = mesin[i];
                    mesin[i] = mesin[j];
                    mesin[j] = temp;
                }
            }
        }
        System.out.println("1. " + mesin[0].namaMesin + "  " + mesin[0].nilaiPerforma());
        System.out.println("2. " + mesin[1].namaMesin + "  " + mesin[1].nilaiPerforma());
        System.out.println("3. " + mesin[2].namaMesin + "  " + mesin[2].nilaiPerforma());
    }
}