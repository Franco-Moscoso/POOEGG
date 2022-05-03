
package poo.ejercicio1.principal;

import java.util.Scanner;
import poo.ejercicio1.entidades.Libro;


public class Ejercicio1 {

    

    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        Libro l1 = new Libro();
        
       l1.Datos();
        
        System.out.println(l1);
        
    }
    
}
