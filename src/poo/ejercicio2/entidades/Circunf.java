
package poo.ejercicio2.entidades;
import java.util.Scanner;

public class Circunf {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    private float radio;

    public Circunf() {
    }


    public Circunf(float radio) {
        this.radio = radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public float getRadio() {
        return radio;
    }
    
    public void crearCircunf(){
    
        System.out.println("Ingrese el radio");
        this.radio = leer.nextFloat();
}
    
    public double area(){
        
        return 2* Math.PI*Math.pow(radio,2);
       
    }
    public double perimetro(){
        
        return 2* Math.PI * radio;
    }
}
