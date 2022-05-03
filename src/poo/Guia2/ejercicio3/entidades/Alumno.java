
package poo.Guia2.ejercicio3.entidades;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author franc
 */
public class Alumno {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private String nombre;
    private ArrayList<Integer> notas;

    public Alumno() {
        notas = new ArrayList();
    }

    public Alumno(String nombre, ArrayList<Integer> notas) {
        this.nombre = nombre;
        this.notas = notas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Integer> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Integer> notas) {
        this.notas = notas;
    }

    
    
    
}
