package poo.ejercicio12.servicio;

import java.util.Date;
import java.util.Scanner;
import poo.ejercicio12.entidades.Persona;

public class PersonaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Persona crearP() {
        Persona persona1 = new Persona();
        System.out.println("Ingrese su nombre y apellido");
        persona1.setNombreyApellido(leer.next());

        System.out.println("Ingrese su DNI");
        persona1.setDNI(leer.nextLong());

        System.out.println("Ingrese su sexo F/M/O");
        String sexo = leer.next().toUpperCase();
        
        while (!sexo.equals("F") && !sexo.equals("M") && !sexo.equals("O")) {
            System.out.println("El sexo ingresado no es valido");
            sexo = leer.next().toUpperCase();
        }
        
        persona1.setSexo(sexo);
        
        int dia;
        int mes;
        int anio;
        System.out.println("Ingrese el día de nacimiento");
        dia = leer.nextInt();
        
        System.out.println("Ingrese el mes");
        mes = leer.nextInt();
        
        System.out.println("Ingrese el anio");
        anio = leer.nextInt();
                
        Date fecha = new Date(anio - 1900, mes - 1,dia);
        persona1.setFechaNacimiento(fecha);
        
        return persona1;

    }
    
    public String calcularanios(Persona persona){
        Date fechaActual = new Date();
        
        int edad = fechaActual.getYear() - persona.getFechaNacimiento().getYear();
        if(fechaActual.getDate()>persona.getFechaNacimiento().getDate()){
           if(fechaActual.getMonth()>persona.getFechaNacimiento().getMonth()){
               edad++;
           }
              
           
        }
        
        return "Tiene "+edad+" años";
    }
    public boolean menorQue(Persona persona){
        int mayorEdad = 18;
        boolean confirmar = false;
        
        if (persona.getFechaNacimiento().getYear()>mayorEdad){
            confirmar = true;
        
        }
        return confirmar;
    }
    
    public void mostrarP(Persona persona){
        System.out.println("Nombre y Appelido: "+persona.getNombreyApellido());
        System.out.println("DNI: "+persona.getDNI());
        System.out.println("Sexo: "+persona.getSexo());
        System.out.println("Fecha de nacimiento: "+persona.getFechaNacimiento());
        
    }
}
