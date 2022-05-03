
package poo.ejercicio5.servicios;

import java.util.Scanner;
import poo.ejercicio5.entidades.CuentaBancaria;

public class CuentaBancariaServicio {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public CuentaBancaria crearCuenta(){
        System.out.println("Ingrese su nombre y apellido");
        String nombreyap = leer.next();
        System.out.println("Ingrese su numero de cuenta");
        int numeroCuenta = leer.nextInt();
        System.out.println("Ingrese su DNI");
        long DNI = leer.nextLong();
        System.out.println("Ingrese su saldo actual");
        int saldoActual = leer.nextInt();
        System.out.println("Ingrese el interes del banco");
        int interes = leer.nextInt();
        
            return  new CuentaBancaria(numeroCuenta, DNI, saldoActual, interes, nombreyap);
           
    }
    
    
  
}
