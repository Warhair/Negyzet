
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
        if(oldala < 1){
            oldala = 1;
        }
        return oldala;
    }

    public void getX(int X) {
        this.X = X;
    }

    public void getY(int Y) {
        this.Y = Y;
    }

    private int terulete(){
        int ter = oldala*oldala;
        return ter;
    }

    public int setOldala(int oldala) {
        this.oldala = oldala;
        return oldala;
    }
    
    
    
}
