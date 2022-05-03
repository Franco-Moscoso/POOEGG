package poo.ejercicioExtras3.servicio;

import java.util.Scanner;
import poo.ejercicioExtras3.entidades.Raices;

/**
 * Método getDiscriminante(): devuelve el valor del discriminante (double). El
 * discriminante tiene la siguiente formula: (b^2)-4*a*c
 *
 *
 * • Método tieneRaices(): devuelve un booleano indicando si tiene dos
 * soluciones, para que esto ocurra, el discriminante debe ser mayor o igual que
 * 0.
 *
 * • Método tieneRaiz(): devuelve un booleano indicando si tiene una única
 * solución, para que esto ocurra, el discriminante debe ser igual que 0.
 *
 * • Método obtenerRaices(): llama a tieneRaíces() y si devolvió́true, imprime
 * las 2 posibles soluciones.
 *
 * • Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́true imprime una
 * única raíz. Es en el caso en que se tenga una única solución posible.
 *
 * • Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y
 * mostrará por pantalla las posibles soluciones que tiene nuestra ecuación con
 * los métodos obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros
 * métodos y en caso de no existir solución, se mostrará un mensaje. Nota:
 * Formula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varia el signo
 * delante de -b
*
 */
public class RaicesServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Raices crear() {
        Raices r = new Raices();
        System.out.println("Ingrese un numero");
        int numA = leer.nextInt();
        r.setA(numA);

        System.out.println("Ingrese un numero");
        int numB = leer.nextInt();
        r.setB(numB);

        System.out.println("Ingrese un numero");
        int numC = leer.nextInt();
        r.setC(numC);
        return r;
    }

    public double getDiscriminante(Raices r) {

        double discriminante = Math.pow(r.getB(), 2) - 4 * r.getA() * r.getC();

        return discriminante;
    }

    public boolean tieneRaices(Raices r) {
        boolean confirmar = false;
        //Si tiene dos posibles soluciones se devuelve true, si no retorna false.
        if (getDiscriminante(r) >= 0) {
            confirmar = true;
        }
        return confirmar;
    }

    public boolean tieneRaiz(Raices r) {
        boolean confirmar = false;

        if (getDiscriminante(r) == 0) {
            confirmar = true;
        }
        return confirmar;
    }

    public void obtenerRaices(Raices r) {
        if(tieneRaiz(r) == true){
            System.out.println(r);
        }
    }
}
