package poo.ejercicio6.servicios;

import java.util.Scanner;
import poo.ejercicio6.entidades.Nespresso;

public class NespressoServicio {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Nespresso CrearC() {

        Nespresso cafe1 = new Nespresso();

        cafe1.setCapmax(100);
        cafe1.setCantidadA(0);

        return cafe1;
    }

    public int llenarC(Nespresso cafe1) {
        System.out.println("Cafe al " + cafe1.getCapmax());
        return cafe1.getCapmax();
    }

    public void servirC(Nespresso cafe1) {
        int taza;
        int contador = 0;

        System.out.println("Ingrese el tamaño de la taza)");
        taza = leer.nextInt();

        int capacidad = cafe1.getCantidadA() - taza;
        System.out.println("Sirviendo Cafe");

        if (capacidad < 0) {
            cafe1.setCantidadA(0);
            System.out.println("Se quedo sin cafe y la taza quedo en " + capacidad);
        }
    }

    public void vaciarC(Nespresso cafe1) {
        cafe1.setCantidadA(0);
        System.out.println("La cantidad de cafe quedo en " + cafe1.getCantidadA());
    }

    public void agregarCafe(Nespresso cafe1) {
        int cafeAgregado;
        int aux;
        System.out.println("Ingrese la cantidad de cafe que desea agregar");
        cafeAgregado = leer.nextInt();
        aux = cafeAgregado + cafe1.getCantidadA();
        System.out.println("La cantidad de cafe quedo en " + aux);
    }

}
