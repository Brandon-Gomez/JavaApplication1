package javaapplication1;
import java.awt.Point;

public class Rectangulo extends Forma {
    
    private int ladoMenor;
    private int ladoMayor;
    
    public Rectangulo(String color, Point centro, String nombre, int ladoMenor, int ladoMayor) {
        super(color, centro, nombre);
        this.ladoMenor = ladoMenor;
        this.ladoMayor = ladoMayor;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Rectangulo, Lado menor: " + ladoMenor + ", Lado mayor: " + ladoMayor);
    }

    public double calcularArea() {
        return ladoMenor * ladoMayor;
    }

    public double calcularPerimetro() {
        return 2 * ladoMenor + 2 * ladoMayor;
    }

    public void cambiarTamanio(double factor) {
        ladoMenor *= factor;
        ladoMayor *= factor;
    }
    
}