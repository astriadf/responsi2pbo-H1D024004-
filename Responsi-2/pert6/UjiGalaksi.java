class UjiGalaksi {
    public static void main(String[] args) {

        // ==========================================================
        // PEMBUATAN OBJEK
        // ==========================================================

        PesawatTempur p = new PesawatTempur("Astra-Fury", 2, 8);

        KapalEksplorasi k = new KapalEksplorasi("Voyager X", 10, 4);

        // ==========================================================
        // PENGUJIAN PERILAKU
        // ==========================================================

        System.out.println("\n--- PESAWAT TEMPUR ---");
        p.aktifkanMesin();
        p.jelajah(10);
        p.jelajah(30);
        p.tembakRudal(3);
        p.tampilStatus();

        System.out.println("\n--- KAPAL EKSPLORASI ---");
        k.aktifkanMesin();
        k.jelajah(15);
        k.scanPlanet("Kepler-442b");
        k.tampilStatus();
    }
}
