public class MouseGaming extends Mouse {
    public String warnaRGB;
    public int dpiMaksimal;

    public void gantiWarnaLampu() {
        System.out.println("Warna lampu diubah menjadi " + warnaRGB);
    }

    public void ubahKecepatanDPI() {
        System.out.println("DPI diubah ke maksimal " + dpiMaksimal);
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Warna RGB: " + warnaRGB);
        System.out.println("DPI Maksimal: " + dpiMaksimal);
    }
}