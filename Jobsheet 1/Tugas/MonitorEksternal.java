public class MonitorEksternal {
    public String merek;
    public int refreshRate;

    public void nyalakanLayar() {
        System.out.println("Monitor " + merek + " dinyalakan.");
    }

    public void ubahKecerahan() {
        System.out.println("Kecerahan layar diubah.");
    }

    public void cetakInfo() {
        System.out.println("Merek Monitor: " + merek);
        System.out.println("Refresh Rate: " + refreshRate + " Hz");
    }
}