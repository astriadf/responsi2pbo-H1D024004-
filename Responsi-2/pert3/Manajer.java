class Manajer extends Karyawan {
    private double tunjangan;
    
    Manajer(String nama, double gajiPokok, double tunjangan) {
        super(nama, gajiPokok);
        this.tunjangan = tunjangan;
    }
    
    @Override
    void tampilInfo() {
        super.tampilInfo();
        System.out.println("Tunjangan: Rp " + tunjangan);
        System.out.println("Total Pendapatan: Rp " + (gajiPokok + tunjangan));
    }
}