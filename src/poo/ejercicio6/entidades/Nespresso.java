
package poo.ejercicio6.entidades;

import java.util.Scanner;
public class Nespresso {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    private int capmax;
    private int cantidadA;

    public Nespresso() {
    }
    
    public Nespresso(int capmax, int cantidadA) {
        this.capmax = capmax;
        this.cantidadA = cantidadA;
    }
    
    public void setCapmax(int capmax) {
        this.capmax = capmax;
    }

    public void setCantidadA(int cantidadA) {
        this.cantidadA = cantidadA;
    }

    public int getCapmax() {
        return capmax;
    }

    public int getCantidadA() {
        return cantidadA;
    }
    
    
    
  
}
