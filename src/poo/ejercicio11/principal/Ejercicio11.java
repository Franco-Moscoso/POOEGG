package poo.ejercicio11.principal;

import java.util.Date;
import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        int dia;
        int anio;
        int mes;

        System.out.println("Ingrese un día de la semana(numero)");
        dia = leer.nextInt();

        System.out.println("Ingrese un mes");
        mes = leer.nextInt() - 1;

        System.out.println("Ingrese un año");
        anio = leer.nextInt() - 1900;

        Date fecha = new Date(anio, mes, dia);

        System.out.println(fecha);

        System.out.println(calcularanios(anio,mes,dia));

    }

    public static String calcularanios(int anio, int mes, int dia) {
        Date actual = new Date();
        int diaActual = actual.getDate();
        int mesActual = actual.getMonth();
        int anioActual = actual.getYear();
        
        System.out.println(actual);

        int diferencia = anioActual - anio;

        if (mesActual <= mes) {
            if (mesActual == mes) {
                if (dia > diaActual) {
                    diferencia--;
                }
            }
        } else {
            diferencia--;
        }
        return "La diferencia es de: "+diferencia+" años";
    }
}
