public class Program {
    public static void main(String[] args) {
        Kucing kucingKampung = new Kucing();
        Orang ani = new Orang("Ani");        
        ani.peliharaHewan(kucingKampung);
        ani.ajakPeliharaanJalanJalan();
    }
}
