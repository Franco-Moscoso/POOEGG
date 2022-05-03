
package poo.Guia2.ejercicio1.entidades;

import java.util.Scanner;

/**
 *
 * @author franc
 */
public class Raza {
    private Scanner leer;
    private String raza;
    private String nombre;

    public Raza() {
    }
   

    public Raza(Scanner leer, String raza,String nombre) {
        this.leer = leer;
        this.raza = raza;
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Raza{" + "raza=" + raza + ", nombre=" + nombre + '}';
    }
    
    
}
