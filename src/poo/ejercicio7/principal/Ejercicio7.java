package poo.ejercicio7.principal;

import java.util.Scanner;
import poo.ejercicio7.Servicio.PersonaServicio;
import poo.ejercicio7.entidades.Persona;

class Ejercicio7 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int va1;
        int va2;
        int va3;
        int va4;
        boolean validar;
        int cont = 0;

        PersonaServicio persona1 = new PersonaServicio();
        

        System.out.println("Primer persona");

        Persona p1 = persona1.crearP();

        validar = persona1.mayordeEdad(p1);
        if (validar) {
            cont++;
        }
        va1 = persona1.calcularIMC(p1);
        
        System.out.println("-----------------------");

        System.out.println("Segunda persona");
        Persona p2 = persona1.crearP();

        validar = persona1.mayordeEdad(p2);
        if (validar) {
            cont++;
        }
        va2 = persona1.calcularIMC(p2);
        System.out.println("-----------------------");

        System.out.println("Tercer persona");
        Persona p3 = persona1.crearP();

        validar = persona1.mayordeEdad(p3);
        if (validar) {
            cont++;
        }
        va3 = persona1.calcularIMC(p3);
        System.out.println("-----------------------");

        System.out.println("Cuarta persona");
        Persona p4 = persona1.crearP();

        validar = persona1.mayordeEdad(p4);
        if (validar) {
            cont++;
        }
        va4 = persona1.calcularIMC(p4);

        int pesoBajo = 0;
        int pesoIdeal = 0;
        int pesoSobre = 0;

        if (va1 == -1) {
            pesoBajo++;
        }
        if (va1 == 0) {
            pesoIdeal++;
        }
        if (va1 == 1) {
            pesoSobre++;
        }

        if (va2 == -1) {
            pesoBajo++;
        }
        if (va2 == 0) {
            pesoIdeal++;
        }
        if (va2 == 1) {
            pesoSobre++;
        }
        if (va3 == -1) {
            pesoBajo++;
        }
        if (va3 == 0) {
            pesoIdeal++;
        }
        if (va3 == 1) {
            pesoSobre++;
        }
        if (va4 == -1) {
            pesoBajo++;
        }
        if (va4 == 0) {
            pesoIdeal++;
        }
        if (va4 == 1) {
            pesoSobre++;
        }

        double mayor = cont * 100 / 4;
        double menor = 100 - mayor;
        int promedio = (va1 + va2 + va3) / 4 * 100;
        System.out.println("El promedio es de " + promedio + "%");
        System.out.println("El promedio de mayores de edad es " + mayor + "%");
    }

}
