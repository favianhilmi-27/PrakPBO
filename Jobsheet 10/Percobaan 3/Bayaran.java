public class Bayaran {
    public int hitungBayaran(Pegawai pg) {
        int uang = pg.getGaji();

        if (pg instanceof Manajer m) {
            uang += m.getTunjangan();
        } else if (pg instanceof Programmer prog) {
            uang += prog.getBonus();
        }

        return uang;
    }
}
