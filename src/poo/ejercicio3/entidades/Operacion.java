package poo.ejercicio3.entidades;

import java.util.Scanner;

public class Operacion {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    private int n1;
    private int n2;

    public Operacion() {
    }

    public Operacion(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public int getN1() {
        return n1;
    }

    public int getN2() {
        return n2;
    }

    public void crearOp() {

        System.out.println("Ingrese el valor el primer numero");
        n1 = leer.nextInt();
        System.out.println("Ingrese el valor del segundo numero");
        n2 = leer.nextInt();
    }

    public int suma() {
        return n1 + n2;
    }

    public int resta() {
        return n1 - n2;
    }

    public void validarmult() {
        if (n1 * n2 == 0) {
            System.out.println("Error");
        } else {
            System.out.println(n1 * n2);

        }
    }

    public void validardivi() {

        if (n1 / n2 == 0) {
            System.out.println("Error");
        } else {
            System.out.println(n1 / n2);
        }

    }

}
