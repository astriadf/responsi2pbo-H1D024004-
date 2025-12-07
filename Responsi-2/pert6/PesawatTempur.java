public class PesawatTempur extends KendaraanGalaksi {
    private int jumlahRudal;

    // ==========================================================
    // CONSTRUCTOR
    // ==========================================================

    PesawatTempur(String nama, int kapasitas, int rudal) {
        super(nama, kapasitas);
        this.jumlahRudal = rudal;
    }


    // ==========================================================
    // IMPLEMENTASI ABSTRACT METHOD
    // ==========================================================

    @Override
    void aktifkanMesin() {
        if(getLevelEnergi() < 20) {
            System.out.println("Energi terlalu rendah! Mesin tidak dapat diaktifkan.");
        } else {
            System.out.println("Mesin pesawat tempur diaktifkan.");
        }
    }

    @Override
    void jelajah(int jarak) {
        int konsumsi = jarak * 3;
        if (getLevelEnergi() < konsumsi) {
            System.out.println("Energi tidak mencukupi untuk menjelajah sejauh " + jarak + " km.");
        } else {
            System.out.println("Pesawat tempur menjelajah sejauh " + jarak + " km.");
        }
    }

    @Override
    public void isiEnergi(int jumlah) {
        System.out.println("Energi bertambah " + jumlah + "%.");
    }


    // ==========================================================
    // METHOD KHUSUS
    // ==========================================================

    void tembakRudal(int jumlah) {
        if (jumlahRudal >= jumlah) {
            jumlahRudal -= jumlah;
            System.out.println("Menembakkan " + jumlah + " rudal!");
        } else {
            System.out.println("Rudal tidak cukup.");
        }
    }
}
