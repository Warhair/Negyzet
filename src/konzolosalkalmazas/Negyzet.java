package konzolosalkalmazas;

public class Negyzet {

    private Kordinata kord = new Kordinata();
    private int oldala;

    public Negyzet(int oldala) {
        this.oldala = oldala;
        
    }
    
    @Override
    public String toString() {
        return "Negyzet{" + "oldala=" + oldala + ", X=" + kord.getX() + ", Y=" + kord.getY() + ", területe:" + terulete() + '}';
    }

    public int getOldala() {
        return oldala;
    }

    private int terulete() {
        int ter = oldala * oldala;
        return ter;
    }

    public void setOldala(int oldala) {
        this.oldala = oldala;
        if (oldala < 1) {
            oldala = 1;
        }
        this.oldala = oldala;
    }

    public void setKord(Kordinata kord) {
        this.kord = kord;
    }

}
