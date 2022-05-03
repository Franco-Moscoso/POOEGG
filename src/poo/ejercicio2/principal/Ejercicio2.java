
package poo.ejercicio2.principal;
import java.util.Scanner;
import poo.ejercicio2.entidades.Circunf;

public class Ejercicio2 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        Circunf c1 = new Circunf();
        
        c1.crearCircunf();
        
        System.out.println(c1.area());
        System.out.println(c1.perimetro());
        
        
    }
    
}
