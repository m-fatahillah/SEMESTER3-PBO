package fatah5.relasiclass.tugas;

public class Dek {
    private int level;
    private Kabin[] daftarKabin;

    public Dek() {}

    public Dek(int level, int jumlahKabin, int kapasitasPerKabin) {
        this.level = level;
        daftarKabin = new Kabin[jumlahKabin];
        for (int i = 0; i < jumlahKabin; i++) {
            daftarKabin[i] = new Kabin(i + 1, kapasitasPerKabin);
        }
    }

    public int getLevel() {
        return level; 
    }
    public void setLevel(int level) { 
        this.level = level; 
    }

    public Kabin[] getDaftarKabin() { 
        return daftarKabin; 
    }
    public void setDaftarKabin(Kabin[] daftarKabin) {
         this.daftarKabin = daftarKabin; 
    }

    public Kabin getKabin(int nomor) {
        return daftarKabin[nomor - 1];
    }

    public String info() {
        String info = "=== Dek " + level + " ===\n";
        for (Kabin k : daftarKabin) {
            info += k.info();
        }
        return info;
    }
}
