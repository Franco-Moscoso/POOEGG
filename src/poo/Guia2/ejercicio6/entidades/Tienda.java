
package poo.Guia2.ejercicio6.entidades;

import java.util.Scanner;

/**
 *
 * @author franc
 */
public class Tienda {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    
    private String producto;
    private float precio;

    public Tienda() {
    }

    public Tienda(String producto, float precio) {
        this.producto = producto;
        this.precio = precio;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Tienda{" + "producto=" + producto + ", precio=" + precio + '}';
    }
    
}
