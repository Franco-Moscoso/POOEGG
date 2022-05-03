
package poo.ejercicio3.principal;

import java.util.Scanner;
import poo.ejercicio3.entidades.Operacion;


public class Ejercico3 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        Operacion e1 = new Operacion();
        
        e1.crearOp();
        System.out.println(e1.suma());
        System.out.println(e1.resta());
        e1.validarmult();
        e1.validardivi();
        
    }
    
}
