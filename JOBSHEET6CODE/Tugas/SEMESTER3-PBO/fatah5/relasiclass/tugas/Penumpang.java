package fatah5.relasiclass.tugas;

public class Penumpang {
    private String nama;
    private String ktp;

    public Penumpang() {}

    public Penumpang(String nama, String ktp) {
        this.nama = nama;
        this.ktp = ktp;
    }
    public String getNama() { 
        return nama; 
    }
    public void setNama(String nama) { 
        this.nama = nama; 
    }
    public String getKtp() { 
        return ktp; 
    }
    public void setKtp(String ktp) { 
        this.ktp = ktp; 
    }
    public String info() {
        return "Penumpang: " + nama + " (KTP: " + ktp + ")\n";
    }
}
