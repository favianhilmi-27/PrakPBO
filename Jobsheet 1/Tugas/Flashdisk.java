public class Flashdisk {
    public int kapasitasTotal;
    public String formatSistem;

    public void colokKePC() {
        System.out.println("Flashdisk terhubung ke PC.");
    }

    public void formatData() {
        System.out.println("Format flashdisk menjadi " + formatSistem + " selesai.");
    }

    public void cetakInfo() {
        System.out.println("Kapasitas: " + kapasitasTotal + " GB");
        System.out.println("Format: " + formatSistem);
    }
}
