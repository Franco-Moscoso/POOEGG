package poo.Guia2.ejercicio3.service;

import java.util.ArrayList;
import java.util.Scanner;
import poo.Guia2.ejercicio3.entidades.Alumno;

/**
 *
 * @author franc
 */
public class AlumnoService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    ArrayList<Alumno> alumnos;

    public AlumnoService() {
        alumnos = new ArrayList();
    }

    
    public Alumno crearAlumno() {
        
        Alumno alumno1 = new Alumno();
 
        String nombre;

        
            System.out.println("Ingrese el nombre del alumno");
            nombre = leer.next();
            alumno1.setNombre(nombre);

            for (int i = 0; i < 3; i++) {
                System.out.println("Ingrese la nota "+(i+1));
                int nota = leer.nextInt();
                alumno1.getNotas().add(nota);
            }

        return alumno1;
    }
    
    public float notaFianl(String nombre){
        
        int suma = 0;
        int cantidad = 1;
        
        for (Alumno a : alumnos) {
            if(a.getNombre().equals(nombre)){
                cantidad = a.getNotas().size();
                for (Integer nota : a.getNotas()) {
                    suma += nota;
                }
 
            }
        }
        return suma / cantidad;
        
           
    }
    public void agregarAlumno(Alumno a){
        alumnos.add(a);
    }
}
