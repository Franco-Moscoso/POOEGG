
package poo.ejercicioExtras2.entidades;

import java.util.Scanner;


public class Punto {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    private int num;
    private int num2;
    private int num3;

    public Punto(int num, int num2, int num3, int num4) {
        this.num = num;
        this.num2 = num2;
        this.num3 = num3;
        this.num4 = num4;
    }
    private int num4;
    public Punto() {
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getNum3() {
        return num3;
    }

    public void setNum3(int num3) {
        this.num3 = num3;
    }

    public int getNum4() {
        return num4;
    }

    public void setNum4(int num4) {
        this.num4 = num4;
    }

   
    
}
