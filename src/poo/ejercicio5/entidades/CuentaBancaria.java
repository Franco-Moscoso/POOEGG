
package poo.ejercicio5.entidades;

import java.util.Scanner;

public class CuentaBancaria {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private String nombreyap;
    private int numeroCuenta;
    private long DNI;
    private int saldoActual;
    private int interes;

    public CuentaBancaria() {
    }

    public CuentaBancaria(int numeroCuenta, long DNI, int saldoActual,int interes,String nombreuap) {
        this.numeroCuenta = numeroCuenta;
        this.DNI = DNI;
        this.saldoActual = saldoActual;
        this.interes = interes;
        this.nombreyap = nombreyap;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }

    public void setInteres(int interes) {
        this.interes = interes;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public long getDNI() {
        return DNI;
    }

    public int getSaldoActual() {
        return saldoActual;
    }

    public int getInteres() {
        return interes;
    }

    
    public double ingreso(){
        double ingreso;
        System.out.println("Introduzca su ingreso extra");
        ingreso = leer.nextDouble();
        
        return ingreso + saldoActual;
    }
    
    public double retirar(){
        double retiro;
        System.out.println("Ingresa la cantidad a retirar");
        retiro = leer.nextDouble();
        
        if(retiro>saldoActual){
            System.out.println("SALDO ACTUAL = 0");
        }
        
        return saldoActual - retiro;
    }
    
    public int extraccionR(){
        
       int num=20;
        if (num>20){
            System.out.println("La extraccion rapida solo se puede retirar el 20% de su sueldo actual");
            return saldoActual;
        }
        return num * saldoActual /100;
    }
    
    public void cosultarSaldo(){
        System.out.println("Su saldo actual es de "+saldoActual+" Pesos");
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" + "nombreyap=" + nombreyap + ", numeroCuenta=" + numeroCuenta + ", DNI=" + DNI + ", saldoActual=" + saldoActual + ", interes=" + interes + '}';
    }
    
   
}
