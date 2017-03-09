package javaapplication1;

public class Vehicle {

    private String marca;
    private String modelo;
    private int año;
    private Tire[] llanta;
    private Engine motor;
    private Door[] puerta;

    public Vehicle() {
        this.llanta = new Tire[4];
        this.puerta = new Door[10];
    }

    public void addpuerta(Door x, int z) {
        this.puerta[z] = x;
    }

    public void addmotor(Engine x) {
        this.motor = x;
    }

    public void addllanta(Tire x, int z) {
        this.llanta[z] = x;
    }

    public String getmarca() {
        return marca;
    }

    public void setmarca(String x) {
        this.marca = x;
    }

    public int getaño() {
        return año;
    }

    public void setaño(int x) {
        this.año = x;
    }

    public String getmodelo() {
        return modelo;
    }

    public void setmodelo(String x) {
        this.modelo = x;
    }

    @Override
    public String toString() {
        return "Automovil{" + "marca=" + marca + ", modelo=" + modelo + ", a\u00f1o=" + año + ", llanta1=" + llanta[0] + ", llanta2=" + llanta[1] + ", llanta3=" + llanta[2] + ", llanta4=" + llanta[3] + ", motor=" + motor + ", puerta1=" + puerta[0] + ", puerta2=" + puerta[1] + ", puerta3=" + puerta[2] + ", puerta3=" + puerta[4] + '}';
    }

}