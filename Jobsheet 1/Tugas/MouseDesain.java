public class MouseDesain extends Mouse {
    public int tombolMacro;
    public boolean bentukErgonomis;

    public void settingTombolFigma() {
        System.out.println("Tombol disetting untuk shortcut desain.");
    }

    public void scrollHorizontal() {
        System.out.println("Scroll horizontal digunakan.");
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Jumlah Tombol Macro: " + tombolMacro);
        System.out.println("Bentuk Ergonomis: " + bentukErgonomis);
    }
}