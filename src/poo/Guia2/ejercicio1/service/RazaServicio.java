
package poo.Guia2.ejercicio1.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import poo.Guia2.ejercicio1.entidades.Raza;

/**
 *
 * @author franc
 */
public class RazaServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private ArrayList<Raza> perros;

    public RazaServicio() {
        this.perros = new ArrayList();
    }
    
    public Raza crear(){
        Raza perro1 = new Raza();
        System.out.println("Ingrese el nombre de su perro");
        String nombre = leer.next();
        perro1.setNombre(nombre);
        
        System.out.println("Ingrese la raza");
        String tipo = leer.next();
        perro1.setRaza(tipo);
        
        return perro1;
    }
    
    public void llenarArrayList(int cantidad){
        
        for (int i = 0; i < cantidad; i++) {
           Raza perrosCreados = crear();
            perros.add(perrosCreados);
        }
    }
    public void mostrarArrayList(int cantidad){
        System.out.println("Los perros actuales que estan en la lista son");
        for (Raza aux : perros) {
            
            System.out.println(aux);
        }
    }
    public void agregarPerro(){
     String var;
        do{
            System.out.println("Desea agregar otro perro? S/N");
             var = leer.next();
        
        
            if(var.toUpperCase().equals("S")){
                Raza perroAgregado = crear();
            perros.add(perroAgregado);
            break;
            }
        }while(!var.toUpperCase().equals("N"));
        
    }
    
    public void buscaryEliminarPerro(){
        System.out.println("Ingrese el nombre del perro a buscar");
        String nombre = leer.next();
        
        Iterator<Raza> it =  perros.iterator();
        
        while(it.hasNext()){
            Raza aux = it.next();
            
            if (aux.getNombre().equals(nombre)) {
                
                it.remove();
            }else{
                System.out.println("No se encuentra en la lista");
            }
        }
            
    }
}
