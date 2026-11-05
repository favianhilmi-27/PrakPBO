public class TelevisiJadul extends Elektronik {
    private String modeInput;

    public TelevisiJadul() {
        this.modeInput = "DVI";
        this.voltase = 220;
    }

    public String getModeInput() {
        return modeInput;
    }

    @Override
    public void nyalakan() {
        System.out.println("Nyalakan televisi jadul dengan input: " + modeInput);
        System.out.println("Voltase televisi: " + getVoltase());
    }
}
