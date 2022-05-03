
package poo.ejercicioExtras3.principal;

import java.util.Scanner;
import poo.ejercicioExtras3.entidades.Raices;
import poo.ejercicioExtras3.servicio.RaicesServicio;


public class EjercicioExtra3 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        
        RaicesServicio rs = new RaicesServicio();
        
        Raices ob = rs.crear();
        
        System.out.println(rs.getDiscriminante(ob));
        System.out.println(rs.tieneRaices(ob));
        System.out.println(rs.tieneRaiz(ob));
    }
    
}
