public class Mouse {
    public String merek;
    public int jumlahTombol;

    public void klikKiri() {
        System.out.println("Klik kiri ditekan.");
    }

    public void klikKanan() {
        System.out.println("Klik kanan ditekan.");
    }

    public void cetakInfo() {
        System.out.println("Merek Mouse: " + merek);
        System.out.println("Jumlah Tombol: " + jumlahTombol);
    }
}
