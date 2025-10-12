package fatah5.relasiclass.tugas;

public class Bus {
    private String nama;
    private Crew[] crew;
    private Dek dek1;
    private Dek dek2;

    public Bus() {}

    public Bus(String nama, Crew[] crew, Dek dek1, Dek dek2) {
        this.nama = nama;
        this.crew = crew;
        this.dek1 = dek1;
        this.dek2 = dek2;
    }

    public String getNama() { 
        return nama; 
    }
    public void setNama(String nama) { 
        this.nama = nama; 
    }
    public Crew[] getCrew() { 
        return crew; 
    }
    public void setCrew(Crew[] crew) { 
        this.crew = crew; 
    }
    public Dek getDek1() { 
        return dek1; 
    }
    public void setDek1(Dek dek1) { 
        this.dek1 = dek1; 
    }
    public Dek getDek2() { 
        return dek2; 
    }
    public void setDek2(Dek dek2) { 
        this.dek2 = dek2;
    }

    public String info() {
        String info = "=== Bus " + nama + " ===\n\n--- Crew ---\n";
        for (Crew c : crew) {
            info += c.info() + "\n";
        }
        info += dek1.info() + "\n";
        info += dek2.info() + "\n";
        return info;
    }
}
