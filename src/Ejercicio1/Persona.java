package Ejercicio1;

public abstract class Persona {

    int dni;
    String nombre;

    public String getNombre() {
        return this.nombre;
    }

    public int getDni() {
        return this.dni;
    }

    public void finalize() throws Throwable {

    }

}
