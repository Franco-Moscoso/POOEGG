
package poo.ejercicio12.principal;

import java.util.Scanner;
import poo.ejercicio12.entidades.Persona;
import poo.ejercicio12.servicio.PersonaServicio;



public class Ejercicio12 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        PersonaServicio persona1 = new PersonaServicio();
        
        Persona p1 = persona1.crearP();
        
        persona1.mostrarP(p1);
        System.out.println("---------------------");
        System.out.println(persona1.calcularanios(p1));
        
        System.out.println(persona1.menorQue(p1));
    }
    
}
