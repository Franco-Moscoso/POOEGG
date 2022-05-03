package poo.Guia2.ejercicio4.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import poo.Guia2.ejercicio4.entidades.Pelicula;
import poo.Guia2.ejercicio4.utilidades.Comparadores;

/**
 *
 * @author franc
 */
public class PeliculaService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    ArrayList<Pelicula> pelicula;

    public PeliculaService() {
        pelicula = new ArrayList();
    }

    public Pelicula crearP() {

        Pelicula p1 = new Pelicula();

        System.out.println("Ingrese el titulo de la pelicula");
        String titulo = leer.next();

        p1.setTitulo(titulo);

        System.out.println("Ingrese el nombre del director");
        String director = leer.next();

        p1.setDirector(director);

        System.out.println("Ingrese la duracion de la pelicula en horas");
        int duracion = leer.nextInt();

        p1.setDuracion(duracion);

        return p1;
    }

    public void agregarPelicula(Pelicula p) {

        pelicula.add(p);

    }

    public void mostrarPeliculas() {

        System.out.println("Las peliculas actuales son");

        for (Pelicula aux : pelicula) {
            System.out.println(aux);
        }
    }

    public void mostrarPeliculaCortas() {

        System.out.println("Las peliculas con una duracion de 1 hora son");

        for (Pelicula aux : pelicula) {
            if (aux.getDuracion() <= 1) {
                System.out.println(aux);
            }
        }
    }

    public void ordenarMayor() {
        Collections.sort(pelicula, Comparadores.ordenarMayoraMenor);

    }
    public void ordenarPorTitulo(){
        Collections.sort(pelicula, Comparadores.ordenarPorNombre);
    }
    public void ordenarPorDirector(){
        Collections.sort(pelicula, Comparadores.ordenarPorDirector);
    }
}
