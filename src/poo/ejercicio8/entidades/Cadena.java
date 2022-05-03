
package poo.ejercicio8.entidades;

import java.util.Scanner;


public class Cadena {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    private String frase;
    private int longitud; 

    public Cadena() {
    }

    public Cadena(String frase, int longitud) {
        this.frase = frase;
        this.longitud = longitud;
    }

    public String getFrase() {
        return frase;
    }

    public int getLonguitud() {
        return longitud;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public void setLonguitud(int longuitud) {
        this.longitud = longuitud;
    }

    @Override
    public String toString() {
        return "Cadena{" + "frase=" + frase + ", longuitud=" + longitud + '}';
    }
    
    
    
    
    
    
}
