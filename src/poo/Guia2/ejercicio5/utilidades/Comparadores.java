
package poo.Guia2.ejercicio5.utilidades;

import java.util.Comparator;
import poo.Guia2.ejercicio5.entidades.Pais;


/**
 *
 * @author franc
 */
public class Comparadores {
    
    public static Comparator<Pais> ordenarPaisesAlfa = new Comparator<Pais>() {
        @Override
        public int compare(Pais t, Pais t1) {
           return t.getPais().compareTo(t1.getPais());
        }
    };
}
