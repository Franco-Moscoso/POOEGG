
package poo.Guia2.ejercicio3.principal;

import java.util.Scanner;
import poo.Guia2.ejercicio3.entidades.Alumno;
import poo.Guia2.ejercicio3.service.AlumnoService;

/**
 *
 * @author franc
 */
public class Ejercicio3 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        AlumnoService alumno1 = new AlumnoService();
        
        String var = "";
        do{
            
        Alumno a1 = alumno1.crearAlumno();
        
        alumno1.agregarAlumno(a1);
        
            System.out.println("Desea agregar otro alumno?");
            var = leer.next();
            
        }while(!var.toUpperCase().equals("N"));
        
        System.out.println("Ingrese el nombre del alumno que desea calcular su promedio");
        String nombre = leer.next();
        
        float notaFinal = alumno1.notaFianl(nombre);
        System.out.println("La nota final de "+nombre+" es "+notaFinal);
    }
    
}
