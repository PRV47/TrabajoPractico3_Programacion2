package Ejercicio1;

import java.util.List;

public class Alumno extends Persona {
    List<Asignatura> asignaturas;


    public List<Asignatura> getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(List<Asignatura> asignaturas) {
        this.asignaturas = asignaturas;
    }

    public void finalize() throws Throwable {
        super.finalize();
    }

}