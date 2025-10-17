public class MainTugas {
    public static void main(String[] args) {
        Manusia objek1 = new Dosen();
        Manusia objek2 = new Mahasiswa();
        Manusia objek3 = new Manusia();

        System.out.println("--- Perilaku Dosen ---");
        objek1.bernafas(); 
        objek1.makan();   

        System.out.println("\n--- Perilaku Mahasiswa ---");
        objek2.bernafas();
        objek2.makan(); 
        
        System.out.println("\n--- Perilaku Manusia Biasa ---");
        objek3.makan();  
        
        Dosen d = (Dosen) objek1;
        d.lembur();
    }
}
