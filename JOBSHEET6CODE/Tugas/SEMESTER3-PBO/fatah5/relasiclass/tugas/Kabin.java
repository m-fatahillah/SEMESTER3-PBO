package fatah5.relasiclass.tugas;

public class Kabin {
    private int nomor;
    private Penumpang[] penumpang;

    public Kabin() {}

    public Kabin(int nomor, int kapasitas) {
        this.nomor = nomor;
        this.penumpang = new Penumpang[kapasitas];
    }

    
    public int getNomor() {
        return nomor; 
    }
    public void setNomor(int nomor) { 
        this.nomor = nomor; 
    }

    public Penumpang[] getPenumpang() { 
        return penumpang; 
    }
    public void setPenumpangArray(Penumpang[] penumpang) { 
        this.penumpang = penumpang; 
    }

    public void setPenumpang(Penumpang p, int slot) {
        if (slot - 1 < penumpang.length && penumpang[slot - 1] == null) {
            penumpang[slot - 1] = p;
        } else {
            System.out.println(" Slot " + slot + " di kabin " + nomor + " sudah terisi ");
        }
    }

    public String info() {
        String info = "Kabin " + nomor + ":\n";
        for (int i = 0; i < penumpang.length; i++) {
            info += "  Slot " + (i + 1) + ": ";
            info += (penumpang[i] != null) ? penumpang[i].info() : "Kosong\n";
        }
        return info;
    }
}
