
package poo.ejercicio6.principal;

import java.util.Scanner;
import poo.ejercicio6.entidades.Nespresso;
import poo.ejercicio6.servicios.NespressoServicio;


public class Ejercicio6 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        boolean salir = false;
        int op;
        NespressoServicio cafetera = new NespressoServicio();
        
        Nespresso c1 = cafetera.CrearC();
                
        do{
            System.out.println("Bienvenido!");
            System.out.println("Seleccione una opcion");
            System.out.println("1.Llenar cafetera");
            System.out.println("2.Servir");
            System.out.println("3.Vaciar cafetera");
            System.out.println("4.Agregar cafe");
            System.out.println("5.Salir");
            op = leer.nextInt();
            switch (op) {
                case 1:
                    cafetera.llenarC(c1);
                    break;
                case 2:
                    cafetera.servirC(c1);
                    break;
                case 3:
                    cafetera.vaciarC(c1);
                    break;
                case 4: 
                    cafetera.agregarCafe(c1);
                    break;
                case 5:
                    salir = true;
                    break;
                default:System.out.println("Solo hay 5 opciones");
              
            }
            
        }while(salir==false);
        
    }
    
}
