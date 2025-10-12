public class MainTugas {

    public static void main(String[] args) {
        Dosen d1 = new Dosen("111", "Budi", "Malang");
        d1.setSKS(10);

        Dosen d2 = new Dosen("112", "Rina", "Surabaya");
        d2.setSKS(12);

        Dosen d3 = new Dosen("113", "Andi", "Blitar");
        d3.setSKS(8);

        DaftarGaji daftar = new DaftarGaji(5);
        daftar.addPegawai(d1);
        daftar.addPegawai(d2);
        daftar.addPegawai(d3);

        daftar.printSemuaGaji();
    
    }
}