package javaapplication1;

public class Main {

    public static void main(String[] args) {
        Vehicle vehiculo = new Vehicle();
        vehiculo.setmarca("ford");
        vehiculo.setaño(2005);
        vehiculo.setmodelo("evolution");
        Tire a = new Tire();
        a.setmarca("GoodYear");
        a.setmodelo("carrera");
        a.settamañopulgadas(30);
        vehiculo.addllanta(a, 0);
        Tire b = new Tire();
        b.setmarca("GoodYear");
        b.setmodelo("carrera");
        b.settamañopulgadas(30);
        vehiculo.addllanta(b, 1);
        Tire c = new Tire();
        c.setmarca("GoodYear");
        c.setmodelo("carrera");
        c.settamañopulgadas(30);
        vehiculo.addllanta(c, 2);
        Tire d = new Tire();
        d.setmarca("GoodYear");
        d.setmodelo("carrera");
        d.settamañopulgadas(30);
        vehiculo.addllanta(d, 3);
        Door e = new Door();
        e.settipo("conductor");
        vehiculo.addpuerta(e, 0);
        Door f = new Door();
        f.settipo("copiloto");
        vehiculo.addpuerta(f, 1);
        Door g = new Door();
        g.settipo("motor");
        vehiculo.addpuerta(g, 2);
        Door h = new Door();
        h.settipo("baul");
        vehiculo.addpuerta(h, 3);
        Engine j = new Engine();
        j.setcilindros(16);
        j.setnumeroserie("x6745");
        vehiculo.addmotor(j);
        System.out.println(vehiculo);
    }
}