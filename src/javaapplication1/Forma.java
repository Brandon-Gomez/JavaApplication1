package javaapplication1;
import java.awt.Point;

public class Forma {
    
    private String color;
    private Point centro;
    private String nombre;

    public Forma (String color, Point centro, String nombre) {
        this.color = color;
        this.centro = centro;
        this.nombre = nombre;
        
        this.centro.x=0;
        this.centro.y=0;

    }

    public void imprimir() {
        System.out.println("Forma: " + nombre + ", Color: " + color + ", Centro: " + centro);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Point getCentro() {
        return centro;
    }

    public void mover(Point nuevoCentro) {
        this.centro = nuevoCentro;
    }
    
}