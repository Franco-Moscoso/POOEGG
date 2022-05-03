     package poo.ejercicio7.Servicio;

import java.util.Scanner;
import poo.ejercicio7.entidades.Persona;

public class PersonaServicio {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Persona crearP() {

        Persona persona1 = new Persona();
        System.out.println("Ingrese su nombre");
        persona1.setNombre(leer.next());

        System.out.println("Ingrese su edad");
        persona1.setEdad(leer.nextInt());

        System.out.println("Ingrese su altura");
        persona1.setAltura(leer.nextFloat());

        System.out.println("Ingrese su peso");
        persona1.setPeso(leer.nextFloat());

        System.out.println("Ingrese su sexo:H/M/O");
        persona1.setSexo(leer.next());

        while (!persona1.equals("H") && !persona1.equals("M") && !persona1.equals("O")) {
            System.out.println("El sexo ingresado no es valido");
            persona1.setSexo(leer.next());
            
        }

        return persona1;
    }

    public int calcularIMC(Persona persona1) {
        float pesoIdeal;
        
        pesoIdeal = (float) (persona1.getPeso() / Math.pow(persona1.getAltura(), 2));

        if (pesoIdeal < 20) {
            System.out.println("Estas por debajo de tu peso ideal");
            return -1;
        }

        if (pesoIdeal >= 20 && pesoIdeal <= 25) {
            System.out.println("Estas en tu peso ideal");
            return 0;
        }
        
            System.out.println("Usted sobrepasa su peso ideal");
            return 1;
       
        
    }

    public boolean mayordeEdad(Persona persona1) {
        boolean mayordeEdad = false;
        if(persona1.getEdad()>= 18){
            mayordeEdad = true;
        }
        return mayordeEdad;

    }

}
