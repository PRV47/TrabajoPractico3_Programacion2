package Ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Profesor extends Persona {

    String departamento;
    List<Asignatura> asignaturas;

    public List<Asignatura> getAsignaturas() {
        return this.asignaturas;
    }

    public Profesor() {
        this.asignaturas = new ArrayList<>();
    }
    public void finalize() throws Throwable {
        super.finalize();
    }

}
