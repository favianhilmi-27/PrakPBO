public class Konten {
    private String judul;
    private String jenis; // "Video", "Artikel", atau "Kuis"
    private int jumlah; // Bisa merepresentasikan durasi (menit), jumlah kata, atau jumlah soal

    public Konten(String judul, String jenis, int jumlah) {
        this.judul = judul;
        this.jenis = jenis;
        this.jumlah = jumlah;
    }

    public String getJenis() {
        return jenis;
    }

    public String tampilkan() {
        return "Jenis: " + jenis + " | Judul: " + judul + " | " + jumlah;
    }
}