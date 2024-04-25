package Ejercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        Alumno alumno = new Alumno();
        alumno.dni = 94733743;
        alumno.nombre = "Piers Rideout";

        Profesor profesor = new Profesor();
        profesor.dni = 12343657;
        profesor.nombre = "Neira";
        profesor.departamento = "Metodologia";

        Grupo grupo = new Grupo();
        grupo.curso = "2º TSP";
        grupo.letra = 'B';
        grupo.pertenece = alumno;

        Asignatura asignatura = new Asignatura();
        asignatura.aula = 201;
        asignatura.hora = "8:30";
        asignatura.nombre = "Metodologia";
        asignatura.profesor = profesor;
        asignatura.grupo = grupo;

        /// a. Para mostrar el aula de la 3ra asignatura de un profesor
        int aula = profesor.getAsignaturas().get(2).getAula();

        // b. Para mostrar todos los nombres de las asignaturas que imparte un profesor:
        for (Asignatura asignatura1 : profesor.getAsignaturas()) {
            System.out.println(asignatura.getNombre());
        }

        //c. Para mostrar el nombre y dni de los alumnos de un grupo que recibe una asignatura:
        for (Alumno alumno1 : asignatura.getGrupo().getAlumnos()) {
            System.out.println("Nombre: " + alumno.getNombre() + ", DNI: " + alumno.getDni());
        }

        //d. Para mostrar todas las asignaturas recibidas por el 1er grupo al que pertenece un alumno:
        for (Asignatura asignatura3 : alumno.getAsignaturas()) {
            if (asignatura.getGrupo().getAlumnos().contains(alumno)) {
                System.out.println(asignatura.getNombre());
            }
        }


        //e. Teniendo un objeto de Alumno y, pidiendo por pantalla, una asignatura existente, muestre desde él, el profesor que la imparte.
        System.out.print("Defina una asignatura: ");
        String nombreAsignatura = reader.nextLine();
        for (Asignatura asignatura2 : alumno.getAsignaturas()) {
            if (asignatura.getNombre().equals(nombreAsignatura)) {
                System.out.println("Profesor: " + asignatura.getProfesor().getNombre());
                break;
            }
        }


        //f. Teniendo un objeto de Profesor, muestre los nombres de todos los alumnos inscriptos en el Grupo de la 2da. Asignatura.
        for (Alumno alumno2 : profesor.getAsignaturas().get(1).getGrupo().getAlumnos()) {
            System.out.println(alumno.getNombre());
        }
    }
}

