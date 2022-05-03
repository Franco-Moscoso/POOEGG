
package poo.Guia2.ejercicio5.principal;

import java.util.Scanner;
import poo.Guia2.ejercicio5.entidades.Pais;
import poo.Guia2.ejercicio5.service.PaisService;

/**
 *
 * @author franc
 */
public class Ejercicio5 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        PaisService p1 = new PaisService();
        String var;
        do{
            Pais pais = p1.crearP();
            p1.agregarPais(pais);
            
            System.out.println("Desea agregar otro País?");
            var = leer.next();
        }while(!var.toUpperCase().equals("N"));
        
        p1.mostrarPaises();
        
        p1.ordenarPaisAlfa();
        p1.mostrarPaises();
        
        System.out.println("Ingrese el nombre del país que desea buscar y eliminar");
        String nombre = leer.next();
        
        p1.buscarPais(nombre);
        
        p1.mostrarPaises();
    }
    
}
