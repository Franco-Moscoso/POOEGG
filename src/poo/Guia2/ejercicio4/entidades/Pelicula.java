
package poo.Guia2.ejercicio4.entidades;


import java.util.Scanner;

/**
 *
 * @author franco
 */
public class Pelicula {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    private String titulo;
    private String director;
    private Integer duracion;
    

    public Pelicula(String titulo, String director, Integer duracion ) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
        
    }

    

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    public Pelicula() {
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", director=" + director + ", duracion=" + duracion + '}';
    }

    
    
    
        
    }

    
    

