public class Main {
    public static void main(String[] args) {
        // 1. Pembuatan objek Instruktur
        Instruktur ins = new Instruktur("Pak Budi");

        // Instruktur menciptakan objek Konten
        Konten v1 = ins.buatVideo("Pendahuluan", 30);
        Konten a1 = ins.buatArtikel("Membaca Dokumentasi", 500);
        
        // 2. Pembuatan objek Kursus dan menyambungkan relasi
        Kursus kursusJava = new Kursus("Kelas Java Dasar", "Pemrograman Java", "Pemula", 10);
        kursusJava.setInstruktur(ins); // Mengampu (Agregasi)
        
        kursusJava.tambahKonten(v1); // Menambah konten (Agregasi)
        kursusJava.tambahKonten(a1); 
        
        // Menampilkan Info Kursus
        System.out.println("--- Info Kursus ---");
        kursusJava.tampilkanKonten();
        System.out.println("-------------------\n");

        // 3. Pembuatan objek Peserta yang mendaftar ke Kursus
        Peserta p1 = new Peserta("Andi", 5);
        p1.daftar(kursusJava);
        System.out.println(p1.getNama() + " mengikuti " + p1.getJumlahKursus() + " kursus.\n");

        // 4. Proses Pembayaran
        System.out.println("--- Transaksi ---");
        Pembayaran bayar1 = new Pembayaran(500000, "Transfer Bank");
        System.out.println("Status Awal: " + (bayar1.isLunas() ? "Lunas" : "Belum Lunas"));
        bayar1.proses();
    }
}