
package poo.Guia2.ejercicio5.entidades;

import java.util.Scanner;



/**
 *
 * @author franc
 */
public class Pais {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
   private String pais;

    public Pais(String pais) {
        this.pais = pais;
    }

    public Pais() {
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Pais{" + "pais=" + pais + '}';
    }
    
   
   
}
