public abstract class KendaraanGalaksi {

    private String namaKendaraan;
    private int levelEnergi;
    private int kapasitasPenumpang;

    // ==========================================================
    // CONSTRUCTOR
    // ==========================================================

    KendaraanGalaksi(String nama, int kapasitas) {
        this.namaKendaraan = nama;
        this.kapasitasPenumpang = kapasitas;
        this.levelEnergi = 100;
    }

    // ==========================================================
    // GETTER
    // ==========================================================

    String getNamaKendaraan() {
        return namaKendaraan;
    }
    int getLevelEnergi() {
        return levelEnergi;
    }
    int getKapasitasPenumpang() {
        return kapasitasPenumpang;
    }

    // ==========================================================
    // METHOD BIASA
    // ==========================================================

    final void tampilStatus() {
        System.out.println(namaKendaraan + " | Energi: " + levelEnergi + "% | Kapasitas: " + kapasitasPenumpang + "awak");
    }

    // ==========================================================
    // ABSTRACT METHOD (WAJIB DIIMPLEMENTASI SUBCLASS)
    // ==========================================================

    abstract void aktifkanMesin();

    abstract void jelajah(int jarak);

    abstract void isiEnergi(int jumlah);
}
