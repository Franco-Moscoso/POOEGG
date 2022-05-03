
package poo.ejercicio9.principal;

import java.util.Scanner;
import poo.ejercicio9.entidades.Matematica;
import poo.ejercicio9.servicio.MatematicaServicio;


public class Ejercicio9 {

    
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in).useDelimiter("\n");
       
       MatematicaServicio sm = new MatematicaServicio();
       
       Matematica m = sm.crearN();
       
       sm.devolverMayor(m);
        System.out.println(sm.potenciar(m));
        sm.calcularR(m);
    }
    
}
