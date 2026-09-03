public class Demo {
    public static void main(String[] args) {
        MonitorEksternal monitor = new MonitorEksternal();
        monitor.merek = "LG";
        monitor.refreshRate = 144;
        
        System.out.println("--- Monitor ---");
        monitor.nyalakanLayar();
        monitor.ubahKecerahan();
        monitor.cetakInfo();
        System.out.println();

        Flashdisk fd = new Flashdisk();
        fd.kapasitasTotal = 64;
        fd.formatSistem = "exFAT";
        
        System.out.println("--- Flashdisk ---");
        fd.colokKePC();
        fd.formatData();
        fd.cetakInfo();
        System.out.println();

        Mouse mouseBiasa = new Mouse();
        mouseBiasa.merek = "Logitech Standar";
        mouseBiasa.jumlahTombol = 3;
        
        System.out.println("--- Mouse Biasa ---");
        mouseBiasa.klikKiri();
        mouseBiasa.klikKanan();
        mouseBiasa.cetakInfo();
        System.out.println();

        MouseGaming mouseG = new MouseGaming();
        mouseG.merek = "Razer";
        mouseG.jumlahTombol = 7;
        mouseG.warnaRGB = "Merah";
        mouseG.dpiMaksimal = 16000;
        
        System.out.println("--- Mouse Gaming ---");
        mouseG.gantiWarnaLampu();
        mouseG.ubahKecepatanDPI();
        mouseG.cetakInfo();
        System.out.println();

        MouseDesain mouseD = new MouseDesain();
        mouseD.merek = "Logitech MX Master";
        mouseD.jumlahTombol = 6;
        mouseD.tombolMacro = 3;
        mouseD.bentukErgonomis = true;
        
        System.out.println("--- Mouse Desain ---");
        mouseD.settingTombolFigma();
        mouseD.scrollHorizontal();
        mouseD.cetakInfo();
    }
}