package konzolosalkalmazas;

public class KonzolosAlkalmazas {

    public static void main(String[] args) {
        jatek();

    }

    private static void jatek() {
        Negyzet negyzet = new Negyzet();
        Kordinata kord = new Kordinata();
        kord.setX(100);
        kord.setY(50);
        negyzet.setOldala(4);
        negyzet.setKord(kord);
        System.out.println(negyzet.toString());
    }

}
