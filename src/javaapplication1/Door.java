package javaapplication1;

public class Door {

    private String tipo;

    public Door() {

    }

    public String gettipo() {
        return tipo;
    }

    public void settipo(String x) {
        this.tipo = x;
    }

    @Override
    public String toString() {
        return "Puerta{" + "tipo=" + tipo + '}';
    }
    
}