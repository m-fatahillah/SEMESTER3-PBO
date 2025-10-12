package fatah5.relasiclass.tugas;

public class Crew {
    private String nama;
    private String id;
    private String jabatan;

    public Crew() {}

    public Crew(String nama, String id, String jabatan) {
        this.nama = nama;
        this.id = id;
        this.jabatan = jabatan;
    }

    public String getNama() { 
        return nama; 
    }
    public void setNama(String nama) { 
        this.nama = nama; 
    }
    public String getId() { 
        return id; 
    }
    public void setId(String id) { 
        this.id = id; 
    }
    public String getJabatan() { 
        return jabatan; 
    }
    public void setJabatan(String jabatan) { 
        this.jabatan = jabatan; 
    }
    public String info() {
        return "- " + jabatan + " -\nNama: " + nama + "\nID: " + id + "\n";
    }
}
