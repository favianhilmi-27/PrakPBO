public class Pembayaran {
    private int jumlah;
    private String metode;
    private boolean lunas;

    public Pembayaran(int jumlah, String metode) {
        this.jumlah = jumlah;
        this.metode = metode;
        this.lunas = false; // Default awal transaksi adalah belum lunas
    }

    public int getJumlah() { return jumlah; }
    public String getMetode() { return metode; }
    public boolean isLunas() { return lunas; }

    public void proses() {
        this.lunas = true;
        System.out.println("Pembayaran sebesar " + jumlah + " via " + metode + " telah DIPROSES. Status lunas: " + lunas);
    }
}