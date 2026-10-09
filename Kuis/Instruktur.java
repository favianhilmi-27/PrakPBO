public class Instruktur {
    private String nama;

    public Instruktur(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    // Method ini "menciptakan" objek Konten (relasi dependency/uses-a)
    public Konten buatVideo(String judul, int menit) {
        return new Konten(judul, "Video", menit);
    }

    public Konten buatArtikel(String judul, int kata) {
        return new Konten(judul, "Artikel", kata);
    }

    public Konten buatKuis(String judul, int soal) {
        return new Konten(judul, "Kuis", soal);
    }
}