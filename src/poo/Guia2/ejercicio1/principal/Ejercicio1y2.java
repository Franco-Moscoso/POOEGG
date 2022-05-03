
package poo.Guia2.ejercicio1.principal;

import java.util.Scanner;
import poo.Guia2.ejercicio1.entidades.Raza;
import poo.Guia2.ejercicio1.service.RazaServicio;

/**
 *
 * @author franco
 */
public class Ejercicio1y2 {

    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        RazaServicio rs = new RazaServicio();
        
        
        
        rs.llenarArrayList(2);
        
        rs.mostrarArrayList(2);
        
        rs.agregarPerro();
        
        rs.mostrarArrayList(3);
        
        rs.buscaryEliminarPerro();
        
        rs.mostrarArrayList(3);
        
    }
    
}
