package fatah5.relasiclass.tugas;

public class MainTugas {

    public static void main(String[] args) {
        Crew[] crew = {
            new Crew("Budi", "C01", "Sopir"),
            new Crew("Andi", "C02", "Kondektur")
        };

        Dek dek1 = new Dek(1, 2, 2);
        Dek dek2 = new Dek(2, 2, 2);

        Penumpang p1 = new Penumpang("Rina", "111");
        Penumpang p2 = new Penumpang("Doni", "222");

        dek1.getKabin(1).setPenumpang(p1, 1);
        dek2.getKabin(2).setPenumpang(p2, 1);

        Bus bus = new Bus("Sleeper Paradise", crew, dek1, dek2);

        System.out.println("Nama Bus: " + bus.getNama());
        System.out.println(bus.info());
    }
}