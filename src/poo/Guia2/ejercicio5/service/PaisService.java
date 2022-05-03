
package poo.Guia2.ejercicio5.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

import poo.Guia2.ejercicio5.entidades.Pais;
import poo.Guia2.ejercicio5.utilidades.Comparadores;


public class PaisService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    HashSet<Pais> paises;

    public PaisService() {
        paises = new HashSet();
    }
    
    public Pais crearP(){
        
        Pais pais = new Pais();
        
        System.out.println("Ingrese el nombre del País");
        String nombre = leer.next();
        pais.setPais(nombre);
        return pais;
    }
    
    public void agregarPais(Pais p){
      paises.add(p);
    }
    
    public void mostrarPaises(){
        System.out.println("Los Países actuales son:");
        for (Pais aux : paises) {
            System.out.println("=========================");
            System.out.println("Paises: "+ aux.getPais());
            System.out.println("=========================");

        }
    }
    public void ordenarPaisAlfa(){
        ArrayList<Pais> pais = new ArrayList(paises);
        
        Collections.sort(pais, Comparadores.ordenarPaisesAlfa);
    }
    
    public void buscarPais(String nombre){
        Iterator<Pais> it = paises.iterator();
        
        while (it.hasNext()) {
            Pais p = it.next();
            
            if(p.getPais().equals(nombre))
                it.remove();
        }
                
                }
    }
