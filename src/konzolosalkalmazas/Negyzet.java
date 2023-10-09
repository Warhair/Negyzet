
package konzolosalkalmazas;

public class Negyzet {
    private int oldala;
    private int X;
    private int Y;

    @Override
    public String toString() {
        return "Negyzet{" + "oldala=" + oldala + ", X=" + X + ", Y=" + Y + "területe:" + terulete() + '}';
    }

    public int getOldala() {
        return oldala;
    }

    public int getX() {
        return X;
    }

    public int getY() {
        return Y;
    }

    private int terulete(){
        int ter = oldala*oldala;
        return ter;
    }
    
    
    
}
