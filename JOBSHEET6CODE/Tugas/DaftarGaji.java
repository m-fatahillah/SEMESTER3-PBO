public class DaftarGaji {
    private Pegawai[] listPegawai;
    private int index = 0;

    public DaftarGaji(int kapasitas) {
        listPegawai = new Pegawai[kapasitas];
    }

    public void addPegawai(Pegawai p) {
        if (index < listPegawai.length) {
            listPegawai[index] = p;
            index++;
        } else {
            System.out.println("Kapasitas daftar pegawai penuh!");
        }
    }

    public void printSemuaGaji() {
        System.out.println("=== Daftar Gaji Pegawai ===");
        for (int i = 0; i < index; i++) {
            System.out.println("Nama: " + listPegawai[i].getNama());
            System.out.println("Gaji: Rp " + listPegawai[i].getGaji());
            System.out.println("------------------------");
        }
    }
}
