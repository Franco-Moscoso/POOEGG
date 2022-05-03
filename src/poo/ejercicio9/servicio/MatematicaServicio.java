package poo.ejercicio9.servicio;

import java.util.Scanner;
import poo.ejercicio9.entidades.Matematica;

public class MatematicaServicio {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Matematica crearN() {
        Matematica numeros = new Matematica();
        numeros.setNum1((float) Math.random() * 10);
        numeros.setNum2((float) Math.random() * 10);
        return numeros;
    }

    public void devolverMayor(Matematica devolverM) {
        float mayor = Math.max(devolverM.getNum1(), devolverM.getNum2());
        float menor = Math.min(devolverM.getNum1(), devolverM.getNum2());

        System.out.println("El primer numero es " + devolverM.getNum1());
        System.out.println("El segungo numero " + devolverM.getNum2());

        System.out.println("El numero mayor es: " + mayor);

    }

    public float potenciar(Matematica potencia) {
        float redondear = (float) Math.round(potencia.getNum1());
        float redondear2 = (float) Math.round(potencia.getNum2());
        System.out.println("Los numeros redondeados son: numero 1: " + redondear + ", numero 2: " + redondear2);

        System.out.println("La potencia del numero mayor es:");

        return (float) Math.pow(Math.max(redondear, redondear2), Math.min(redondear, redondear2));
    }

    public void calcularR(Matematica raiz) {
        float valorA = (float) Math.abs(raiz.getNum1());
        float valorB = (float) Math.abs(raiz.getNum2());

        float menor = Math.min(valorA, valorB);
        
        System.out.println("La raiz del numero menor es: " +Math.sqrt(menor));
    }
}
