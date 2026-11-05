public class Elektronik {
    protected int voltase;

    public Elektronik() {
        this.voltase = 220;
    }

    public int getVoltase() {
        return voltase;
    }

    public void nyalakan() {
        System.out.println("Nyalakan perangkat elektronik");
        System.out.println("Voltase perangkat: " + getVoltase());
    }
}
