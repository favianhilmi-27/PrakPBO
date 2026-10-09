public class Staff extends Karyawan {

    private int lembur;
    private double GajiLembur;

    public void setLembur(int lembur) {
        this.lembur = lembur;
    }

    public int getLembur() {
        return lembur;
    }

    public void setGajiLembur(double GajiLembur) {
        this.GajiLembur = GajiLembur;
    }

    public double getGajiLembur() {
        return GajiLembur;
    }

    public double GetGaji(int lembur, double GajiLembur) {
        return super.getGaji() + lembur * GajiLembur;
    }

    public double GetGaji() {
        return super.getGaji() + lembur * GajiLembur;
    }

    public void lihatInfo() {
        System.out.println("NIP  :" + this.getNip());
        System.out.println("Nama  :" + this.getNama());
        System.out.println("Golongan :" + this.getGolongan());
        System.out.println("Jml Lembur :" + this.getLembur());
        System.out.printf("Gaji Lembur :%.0f\n", this.getGajiLembur());
        System.out.printf("Gaji  :%.0f\n", this.getGaji());
    }
}
