public class Peserta {
    private String nama;
    private Kursus[] kursusDiikuti;
    private int jumlahKursus = 0; 

    public Peserta(String nama, int maxKursus) {
        this.nama = nama;
        this.kursusDiikuti = new Kursus[maxKursus];
    }

    public String getNama() {
        return nama;
    }

    public void daftar(Kursus kursus) {
        if (jumlahKursus < kursusDiikuti.length) {
            kursusDiikuti[jumlahKursus] = kursus;
            jumlahKursus++;
            System.out.println(nama + " berhasil mendaftar kursus: " + kursus.getNama());
        } else {
            System.out.println(nama + " tidak bisa mendaftar lagi, kapasitas maksimal.");
        }
    }

    public int getJumlahKursus() {
        return jumlahKursus;
    }
}