package konzolosalkalmazas;

public class KonzolosAlkalmazas {

    public static void main(String[] args) {
     jatek();
      
    }

    private static void jatek() {
        Negyzet negyzet = new Negyzet();
      Kordinata x = new Kordinata();
      Kordinata y = new Kordinata();
      y.setX(100);
      x.setX(50);
      negyzet.setOldala(1);
      negyzet.getX(x.getX());
      negyzet.getY(y.getX());
        System.out.println(negyzet.toString());
    }
    
}
