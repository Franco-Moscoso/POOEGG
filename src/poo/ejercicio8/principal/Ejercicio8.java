
package poo.ejercicio8.principal;

import java.util.Scanner;
import poo.ejercicio8.entidades.Cadena;
import poo.ejercicio8.servicio.CadenaServicio;


public class Ejercicio8 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        CadenaServicio cs = new CadenaServicio();
        //Creamos la cadena
        Cadena cadena1 = cs.crearC();
        
        //Contamos las veces que se repite un caracter seleccionado por el usuario.
        cs.vecesR(cadena1);
        
        //Mostramos las vocales que contiene la frase
        cs.mostrarV(cadena1);
        
        //Invertimos la frase.
        System.out.println(cs.invertirC(cadena1));
        
        //Comparamos la longitud de dos frases.
        cs.compararLongitud(cadena1);
        
        //Unimos la frase principal con una nueva creada por el usuario.
        System.out.println(cs.unirF(cadena1));
        
        //Cambiamos la letra a por cualquier caracter ingresado por el usuario.
        System.out.println(cs.cambiarC(cadena1));
        
        /*Le pedimos al usuario que ingrese un caracter para comprobar si existe o no en la frase
            si no existe se le devolvera false y si esta se le devuelve true.*/
        System.out.println(cs.contieneL(cadena1));
    }
    
}
