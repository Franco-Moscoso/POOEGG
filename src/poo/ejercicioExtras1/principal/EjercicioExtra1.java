
package poo.ejercicioExtras1.principal;

import java.util.Scanner;
import poo.ejercicioExtras1.entidades.Cancion;
import poo.ejercicioExtras1.servicio.CancionServicio;


public class EjercicioExtra1 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        CancionServicio c = new CancionServicio();
        
       Cancion cancion1 = c.Crear();
       c.mostrar(cancion1);
    }
    
}
