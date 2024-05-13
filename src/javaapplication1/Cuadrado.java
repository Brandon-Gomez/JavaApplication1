package javaapplication1;
import java.awt.Point;

public class Cuadrado extends Rectangulo {
    
    Point centro = new Point();
    
    public Cuadrado(String color, Point centro, String nombre, int ladoMenor, int ladoMayor){
        super(color, centro, nombre,ladoMenor,ladoMayor);
    }
    
}
