public class UjiSDM {
    public static void main(String[] args) {
        
        // ==========================================================
        // DATA UJI COBA
        // ==========================================================

        ProgrammerMagang p = new ProgrammerMagang("Andi", 50000.0, "1234");

        // 2. PENGUJIAN METODE BERURUTAN
        System.out.println("=== PENGUJIAN PROGRAMMER MAGANG ===");
        p.hitungGaji(160);
        System.out.println("Status Cuti: " + p.getStatusCuti());
        p.login("9999");
        p.login("1234");
        System.out.println("Role Akses: " + p.getRoleAkses());
        p.perpanjangKontrak(6);
        p.logout();
    }
}