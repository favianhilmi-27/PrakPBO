public class TestManusia {
    public static void main(String[] args) {
        Manusia m;

        m = new Manusia();
        m.bernafas();
        m.makan();      

        m = new Dosen();
        m.bernafas();  
        m.makan();      
        ((Dosen) m).lembur();

        m = new Mahasiswa();
        m.bernafas();  
        m.makan();      
        ((Mahasiswa) m).tidur();
    }
}
