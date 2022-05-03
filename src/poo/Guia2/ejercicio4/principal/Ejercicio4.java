package poo.Guia2.ejercicio4.principal;

import java.util.Collections;
import java.util.Scanner;
import poo.Guia2.ejercicio4.entidades.Pelicula;
import poo.Guia2.ejercicio4.service.PeliculaService;
import poo.Guia2.ejercicio4.utilidades.Comparadores;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        PeliculaService pelicula = new PeliculaService();
        String var;
        int op;
        do {

            Pelicula p1 = pelicula.crearP();

            pelicula.agregarPelicula(p1);

            System.out.println("Desea agregar otra pelicula?");
            var = leer.next();

        } while (!var.toUpperCase().equals("N"));

        boolean salir = false;
        do {
            System.out.println("Bienvenido!\n"
                    + "1: Mostrar todas la peliculas\n"
                    + "2: Mostrar peliculas con duración de 1 hora\n"
                    + "3: Mostrar peliculas ordenadas de mayor duración a menor\n"
                    + "4: Mostrar peliculas ordenadas por titulo alfabéticamente\n"
                    + "5: Mostrar peliculas ordenadas por director alfabéticamente\n"
                    + "6: Salir");
            op = leer.nextInt();

            switch (op) {
                case 1:

                    pelicula.mostrarPeliculas();

                    break;
                case 2:
                    pelicula.mostrarPeliculaCortas();
                    break;
                case 3:

                    pelicula.ordenarMayor();
                    pelicula.mostrarPeliculas();
                    break;
                case 4:
                    pelicula.ordenarPorTitulo();
                    pelicula.mostrarPeliculas();
                    break;
                case 5:
                    pelicula.ordenarPorDirector();
                    pelicula.mostrarPeliculas();
                    break;
                case 6:
                    System.out.println("Esta seguro que quiere salir?");
                    String aux = leer.next();
                    if (aux.toUpperCase().equals("S")) {
                        salir = true;
                    }
                default:
                   

            }

        } while (!salir);

    }
}
