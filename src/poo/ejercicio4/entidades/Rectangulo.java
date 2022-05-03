
package poo.ejercicio4.entidades;
import java.util.Scanner;

public class Rectangulo {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    private int altura;
    private int base;

    public Rectangulo(int altura, int base) {
        this.altura = altura;
        this.base = base;
    }

    public Rectangulo() {
    }
    
    public void crearRec(){
        System.out.println("Ingrese la altura del rectangulo");
        altura = leer.nextInt();
        System.out.println("Ingrese la base del rectangulo");
        base = leer.nextInt();
    }
    
    public int crearSup(){
        if(base*altura==0){
            System.out.println("Error");
        }      
      return base * altura;  
    } 
    
    public int crearPe(){
        if (base+altura==0){
            System.out.println("Error");
        }
        return 2* base + altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public int getBase() {
        return base;
    }
    
    
}
