package Ejercicio1;

import java.util.List;

public class Asignatura {

    int aula;
    String hora;
    String nombre;
    Profesor profesor;
    Grupo grupo;
    List<Alumno> alumnos;

    public Asignatura(int aula, String hora, String nombre, Profesor profesor, Grupo grupo, List<Alumno> alumnos) {
        this.aula = aula;
        this.hora = hora;
        this.nombre = nombre;
        this.profesor = profesor;
        this.grupo = grupo;
        this.alumnos = alumnos;
    }

    public Asignatura() {

    }

    public int getAula() {
        return aula;
    }

    public void setAula(int aula) {
        this.aula = aula;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }


    public void finalize() throws Throwable {

    }

}