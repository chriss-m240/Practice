package javaapplication1;

public class Tire {

    private String marca;
    private String modelo;
    private int tamañopulgadas;

    public Tire() {

    }

    public String getmarca() {
        return marca;
    }

    public void setmarca(String x) {
        this.marca = x;
    }

    public String getmodelo() {
        return modelo;
    }

    public void setmodelo(String x) {
        this.modelo = x;
    }

    public int gettamañopulgadas() {
        return tamañopulgadas;
    }

    public void settamañopulgadas(int x) {
        this.tamañopulgadas = x;
    }

    @Override
    public String toString() {

        return "Llanta{" + "marca=" + marca + ", modelo=" + modelo + ", tama\u00f1opulgadas=" + tamañopulgadas + '}';
        }
    
}