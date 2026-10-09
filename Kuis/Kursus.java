public class Kursus {
    private String nama;
    private String mapel;
    private String tingkat;
    private Instruktur instruktur; // Relasi agregasi (mengampu)
    private Konten[] daftarKonten; // Relasi agregasi
    private int jumlahKonten = 0; // Counter internal untuk indeks array

    public Kursus(String nama, String mapel, String tingkat, int maxKonten) {
        this.nama = nama;
        this.mapel = mapel;
        this.tingkat = tingkat;
        this.daftarKonten = new Konten[maxKonten]; // Menyiapkan array of objects
    }

    public String getNama() { return nama; }
    public String getMapel() { return mapel; }
    public String getTingkat() { return tingkat; }

    public void setInstruktur(Instruktur instruktur) {
        this.instruktur = instruktur;
    }

    public void tambahKonten(Konten konten) {
        if (jumlahKonten < daftarKonten.length) {
            daftarKonten[jumlahKonten] = konten;
            jumlahKonten++;
        } else {
            System.out.println("Gagal menambahkan. Kapasitas konten penuh.");
        }
    }

    public void tampilkanKonten() {
        System.out.println("Mata Pelajaran: " + mapel);
        System.out.println("Tingkat: " + tingkat);
        if (instruktur != null) {
            System.out.println("Instruktur: " + instruktur.getNama());
        }
        
        System.out.println("Daftar Konten:");
        // Menerapkan defensive programming pada array
        for (int i = 0; i < jumlahKonten; i++) {
            if (daftarKonten[i] != null) {
                System.out.println("- " + daftarKonten[i].tampilkan());
            }
        }
    }
}