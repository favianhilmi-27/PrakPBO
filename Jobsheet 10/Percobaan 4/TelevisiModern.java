public class TelevisiModern extends Elektronik {
    private String modeInput;

    public TelevisiModern() {
        this.modeInput = "HDMI";
        this.voltase = 220;
    }

    public String getModeInput() {
        return modeInput;
    }

    @Override
    public void nyalakan() {
        System.out.println("Nyalakan televisi modern dengan input: " + modeInput);
        System.out.println("Voltase televisi: " + getVoltase());
    }
}
