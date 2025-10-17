public class Segitiga {
    private int sudut;

    public int totalSudut(int sudutA) {
        return 180 - sudutA;
    }

    public int totalSudut(int sudutA, int sudutB) {
        return 180 - (sudutA + sudutB);
    }

    public int keliling(int sisiA, int sisiB, int sisiC) {
        return sisiA + sisiB + sisiC;
    }

    public double keliling(int sisiA, int sisiB) {
        return Math.hypot(sisiA, sisiB); 
    }

    public static void main(String[] args) {
        Segitiga s = new Segitiga();

        System.out.println("Total Sudut (1 parameter): " + s.totalSudut(60));
        System.out.println("Total Sudut (2 parameter): " + s.totalSudut(45, 75));
        System.out.println("Keliling (3 sisi): " + s.keliling(3, 4, 5));
        System.out.println("Sisi Miring (2 sisi): " + s.keliling(3, 4)); 
    }
}