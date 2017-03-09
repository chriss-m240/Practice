package javaapplication1;

public class Engine {

    private String numeroserie;
    private int cilindros;

    public Engine() {

    }

    public String getnumeroserie() {
        return numeroserie;
    }

    public void setnumeroserie(String x) {
        this.numeroserie = x;
    }

    public int getcilidros() {
        return cilindros;
    }

    public void setcilindros(int x) {
        this.cilindros = x;
    }

    @Override
    public String toString() {
        return "Motor{" + "numeroserie=" + numeroserie + ", cilindros=" + cilindros + '}';
    }
    
}