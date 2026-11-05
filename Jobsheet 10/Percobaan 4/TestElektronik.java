public class TestElektronik {
    public static void main(String[] args) {
        Manusia indro = new Manusia();
        TelevisiJadul tvJadul = new TelevisiJadul();
        indro.nyalakanPerangkat(tvJadul);
        TelevisiModern tvModern = new TelevisiModern();
        indro.nyalakanPerangkat(tvModern);
    }
}