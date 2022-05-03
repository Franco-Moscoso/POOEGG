
package poo.ejercicio12.entidades;

import java.util.Date;
import java.util.Scanner;


public class Persona {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    private String nombreyApellido;
    private long DNI;
    private Date fechaNacimiento;
    private String sexo;

    public Persona(String nombreyApellido, long DNI, Date fechaNacimiento, String sexo) {
        this.nombreyApellido = nombreyApellido;
        this.DNI = DNI;
        this.fechaNacimiento = fechaNacimiento;
        this.sexo = sexo;
    }

    public Persona() {
    }

    public String getNombreyApellido() {
        return nombreyApellido;
    }

    public void setNombreyApellido(String nombreyApellido) {
        this.nombreyApellido = nombreyApellido;
    }

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombreyApellido=" + nombreyApellido + ", DNI=" + DNI + ", fechaNacimiento=" + fechaNacimiento + ", sexo=" + sexo + '}';
    }

   
 
    
}
