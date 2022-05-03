
package poo.ejercicio10.principal;

import java.util.Arrays;
import java.util.Scanner;


public class Ejercicio10 {

    
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in).useDelimiter("\n");
      
      float arregloA[] = new float [50];
      float arregloB[] = new float [20];
      
      
        for (int i = 0; i < arregloA.length; i++) {
            arregloA[i] = (float) Math.random()*50;
        }
        System.out.println("Arreglo A");
        for (int i = 0; i < arregloA.length; i++) {
            System.out.println("["+arregloA[i]+"]");
        }                                                               /*Llenamos los arreglos con numeros aleatorios y
                                                                            los mostramos por pantalla*/
        for (int i = 0; i < arregloB.length; i++) {                        
        
            arregloB[i] = (float) Math.random()*20;
        }
        System.out.println("****Arreglo B****");
        for (int i = 0; i < arregloB.length; i++) {
            System.out.println("["+arregloB[i]+"]");
        }
        //Ordenamos el arregloA de menor a mayor y lo mostramos por pantalla
        Arrays.sort(arregloA);
        System.out.println("Arreglo A ordenado de menor a mayor");
        for (int i = 0; i < arregloA.length; i++) {
            System.out.println("["+arregloA[i]+"]");
            
        }
        System.out.println("---------------------");
        System.out.println("Llenamos el arreglo B con los primeros 10 numeros del arreglo A");
        //Ahora copiamos los primeros 10 numeros del arrelgo A y se los pasamos al B
        System.arraycopy(arregloA, 0, arregloB, 0, 10);
        //Ahora ponemos los ultimos 10 numeros del arregloB con el valor de 0.5
        Arrays.fill(arregloB, 10, 20, 0.5f);
        for (int i = 0; i < arregloB.length; i++) {
            System.out.println("["+arregloB[i]+"]");
        }
       
    }
    
}
