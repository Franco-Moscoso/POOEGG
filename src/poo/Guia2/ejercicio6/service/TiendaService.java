
package poo.Guia2.ejercicio6.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import poo.Guia2.ejercicio6.entidades.Tienda;

/**
 *
 * @author franc
 */
public class TiendaService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    HashMap<String, Tienda> productos;

    public TiendaService() {
        productos = new HashMap();
    }
    public Tienda agregarProducto(){
        Tienda producto = new Tienda();
        String pro;
        System.out.println("Ingrese el producto");
        pro = leer.next();
        producto.setProducto(pro);
        
        System.out.println("Ingrese el precio");
        float precio = leer.nextFloat();
        producto.setPrecio(precio);
        return producto;
    }
    
    public void cambiarPrecio(Tienda p){
        System.out.println("Introduzca el nuevo precio");
        float nuevoPr = leer.nextFloat();
        p.setPrecio(nuevoPr);
    }
    public void eliminarProducto(Tienda p){
        productos.remove(p);
    }
    public void mostrarProductos(){
        
    }
}
