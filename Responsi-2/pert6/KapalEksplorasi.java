public class KapalEksplorasi extends KendaraanGalaksi {
    private int modulScan;   // kemampuan scan planet (level 1–5)

    // ==========================================================
    // CONSTRUCTOR
    // ==========================================================

    KapalEksplorasi(String nama, int kapasitas, int modul) {
        super(nama, kapasitas);
        this.modulScan = modul;
    }

    // ==========================================================
    // IMPLEMENTASI ABSTRACT METHOD
    // ==========================================================

    @Override
    public void aktifkanMesin() {
        if (getLevelEnergi() < 15) {
            System.out.println("Energi tidak mencukupi untuk memulai ekspedisi!");
        } else {
            System.out.println("Kapal eksplorasi siap berangkat!");
        }
    }

    @Override
    public void jelajah(int jarak) {
        int konsumsi = jarak * 2;
        if (getLevelEnergi() < konsumsi ) {
            System.out.println("Energi tidak mencukupi untuk menjelajah sejauh " + jarak + " km.");
        } else {
            System.out.println("Kapal eksplorasi menjelajah sejauh " + jarak + " km.");
        }
    }

    @Override
    public void isiEnergi(int jumlah) {
        System.out.println("Energi bertambah " + jumlah + "%.");
    }

    // ==========================================================
    // METHOD KHUSUS
    // ==========================================================

    void scanPlanet(String namaPlanet) {
        System.out.println("Melakukan scan pada planet " + namaPlanet + " dengan modul level " + modulScan + ".");
    }
}
