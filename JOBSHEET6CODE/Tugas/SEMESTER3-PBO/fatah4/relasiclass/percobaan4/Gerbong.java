package fatah4.relasiclass.percobaan4;

public class Gerbong {
    private String kode;
    private Kursi [] arrayKursi;

    public Gerbong(String kode,int jumlah){
        this.kode = kode;
        this.arrayKursi = new Kursi[jumlah];
        this.initKursi();
    }
    private void initKursi() {
        for (int i = 0; i < arrayKursi.length; i++) {
            this.arrayKursi[i] = new Kursi(String.valueOf(i + 1));
        }
    }
    public void setKode(String kode){
        this.kode = kode;
    }
    public void setPenumpang(Penumpang penumpang, int nomor){
         if (this.arrayKursi[nomor - 1].getPenumpang() != null) {

        System.out.println("Anda tidak diperkenankan duduk disini!" );
        System.out.println("Kursi nomor " + nomor + " sudah terisi oleh penumpang lain.");
        } else {
        this.arrayKursi[nomor - 1].setPenumpang(penumpang);
        System.out.println("Penumpang " + penumpang.getNama() + " berhasil duduk di kursi nomor " + nomor + ".");
        }
    }
    public String info() {
    String info = "";
    info += "Kode: " + kode + "\n";
    for (Kursi kursi : arrayKursi) {
        info += kursi.info();
    }
    return info;
    }

}
