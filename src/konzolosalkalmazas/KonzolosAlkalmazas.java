package konzolosalkalmazas;

public class KonzolosAlkalmazas {

    public static void main(String[] args) {
        jatek();

    }

    private static void jatek() {
        Negyzet negyzet = new Negyzet(2, new Kordinata(20, 30));
        System.out.println(negyzet.toString());
    }

}
