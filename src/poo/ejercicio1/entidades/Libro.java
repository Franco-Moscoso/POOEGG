/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.ejercicio1.entidades;
import java.util.Scanner;
/**
 *
 * @author franco
 */
public class Libro {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private String ISBN;
    private String autor;
    private String titulo;
    private String paginas;
    
    public Libro(String ISBN, String autor, String titulo, String paginas) {
        this.ISBN = ISBN;
        this.autor = autor;
        this.titulo = titulo;
        this.paginas = paginas;
    }

    public Libro() {
    }
    public void Datos (){
            
            System.out.println("Ingrese el titulo del libro");
            this.titulo = leer.next();
            System.out.println("Ingrese el autor");
            this.autor = leer.next();
            System.out.println("Ingrese el ISBN");
            this.ISBN = leer.next();
            System.out.println("Ingrese el numero de paginas");
            this.paginas = leer.next();
}
        
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setPaginas(String paginas) {
        this.paginas = paginas;
    }

    public Scanner getLeer() {
        return leer;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getPaginas() {
        return paginas;
    }

    @Override
    public String toString() {
        return "Libro{" +  ", ISBN=" + ISBN + ", autor=" + autor + ", titulo=" + titulo + ", paginas=" + paginas + '}';
    }

   
    
    
    
}
