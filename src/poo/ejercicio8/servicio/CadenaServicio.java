
package poo.ejercicio8.servicio;

import java.util.Scanner;
import poo.ejercicio8.entidades.Cadena;


public class CadenaServicio {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Cadena crearC(){
        Cadena cadena1 = new Cadena();
        
        System.out.println("Ingrese una frase o palabra");
        String frase = leer.next();
        cadena1.setFrase(frase);
        
         cadena1.setLonguitud(frase.length());
        System.out.println("La longitud de su frase o palabra es: "+cadena1.getLonguitud());
     return cadena1;   
    }
    
    public void mostrarV(Cadena cadena1){
       int vocales =0; 
        for (int i = 0; i < cadena1.getFrase().length(); i++){
           if((cadena1.getFrase().charAt(i)=='a')||cadena1.getFrase().charAt(i)=='A'||
            (cadena1.getFrase().charAt(i)=='e')||cadena1.getFrase().charAt(i)=='E'||
            (cadena1.getFrase().charAt(i)=='i')||cadena1.getFrase().charAt(i)=='I'||
            (cadena1.getFrase().charAt(i)=='o')||cadena1.getFrase().charAt(i)=='O'||
            (cadena1.getFrase().charAt(i)=='u')||cadena1.getFrase().charAt(i)=='U'){
            
            vocales++;
        }
             
             
        }
        System.out.println("Las vocales en "+cadena1.getFrase()+" se encontraron "+vocales+" veces");
    }
    
    public String invertirC(Cadena cadena1){
     String fraseInvertida ="";
        for (int i = cadena1.getLonguitud(); i >0; i--) {
            fraseInvertida = fraseInvertida + cadena1.getFrase().substring(i-1, i);
        }
     return fraseInvertida;
    }
    
    public void vecesR(Cadena cadena1){
        char letra;
        int cont =0;
        System.out.println("Ingrese el caracter que desea buscar");
        letra = leer.next().charAt(0);
        
        for (int i = 0; i < cadena1.getFrase().length(); i++) {
            
           if(letra == (cadena1.getFrase().charAt(i))){
               cont++;
           }
        }
  
        System.out.println("El caracter se repitio "+cont+" veces");
    }
    
    public void compararLongitud(Cadena cadena1){
        String frase2;
        System.out.println("Ingrese una nueva frase");
        frase2 = leer.next();
        int longi = frase2.length();
        
        if(longi == cadena1.getLonguitud()){
            System.out.println("Las frases tienen la misma longitud");
            
        }else{
            System.out.println("Las frases tienen distinta longitud");
        }
    }
    
    public String unirF(Cadena cadena1){
      String frase;
        System.out.println("Ingrese una nueva frase para unirla con la principal");
        frase = leer.next();
        return cadena1.getFrase()+" " + frase;
    }
    
    public String cambiarC(Cadena cadena1){
        String caracter = "a";
        String cambiar;
        System.out.println("Ahora remplazaremos la letra a por cualquier caracter que quieras");
        cambiar = leer.next();
        System.out.println("Frase original: "+cadena1.getFrase());
        return "Frase cambiada:"+" "+ cadena1.getFrase().replaceAll(caracter, cambiar);
    }
    
    public boolean contieneL(Cadena cadena1){
        boolean confirmar = false;
        String caracter;
        System.out.println("Ingrese un caracter para buscarlo en la frase");
        caracter = leer.next();
        
        if(cadena1.getFrase().contains(caracter)){
           return confirmar = true;
            
        }
 
        return confirmar;
    }
}
