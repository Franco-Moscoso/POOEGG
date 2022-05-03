
package poo.ejercicio5.principal;

import java.util.Scanner;
import poo.ejercicio5.entidades.CuentaBancaria;
import poo.ejercicio5.servicios.CuentaBancariaServicio;


public class Ejercicio5 {

    
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        boolean salir = false;
        int op;
        CuentaBancariaServicio sc = new CuentaBancariaServicio();
        
        CuentaBancaria u1 = sc.crearCuenta();

        
        do{
            System.out.println("Bienvenido!");
        System.out.println("1.Retirar dinero");
        System.out.println("2.Ingresar dinero");
        System.out.println("3.Consultar saldo");
        System.out.println("4.Consultar datos de cuenta");
        System.out.println("5.Extraccion rapida");
        System.out.println("6.Salir");
        System.out.println("Escoja una opcion");
            op = leer.nextInt();
            switch (op) {
                case 1:
                    u1.retirar();
                    break;
                case 2:
                    u1.ingreso();
                    break;
                case 3:
                    u1.cosultarSaldo();
                    break;
                case 4:
                    System.out.println(u1.toString());
                    break;
                case 5: 
                    u1.extraccionR();
                    break;
                case 6: 
                    salir = true;
                    break;
                default:System.out.println("Solo hay 6 opciones");
                  
            }
        }while(salir == false);
    }
    
}
