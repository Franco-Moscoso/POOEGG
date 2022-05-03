package poo.ejercicioExtras1.servicio;

import java.util.Scanner;
import poo.ejercicioExtras1.entidades.Cancion;

public class CancionServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Cancion Crear() {
        Cancion c = new Cancion();

        System.out.println("Ingrese el nombre del autor");
        String autor = leer.next();
        c.setAutor(autor);

        System.out.println("Ingrese el nombre de la cancion");
        String titulo = leer.next();
        c.setTitulo(titulo);

        return c;
    }
    public void mostrar(Cancion c){
        System.out.println("Autor: "+c.getAutor()+"\n"
                + "Cancion: "+c.getTitulo());
    }
}
