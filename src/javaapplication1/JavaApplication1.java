package javaapplication1;
import java.awt.Point;

public class JavaApplication1 {

    public static void main(String[] args) {
        
         // Create several different shapes
        Forma circulo = new Circulo("red", new Punto(10, 10), 5);
        Forma rectangulo = new Rectangulo("blue", new Punto(20, 20), 10, 20);
        Forma elipse = new Elipse("green", new Punto(30, 30), 15, 5);

        // Create a vector of Forma pointers
        Vector<Forma> formas = new Vector<>();
        formas.add(circulo);
        formas.add(rectangulo);
        formas.add(elipse);

        // Loop through all the shapes, change their color and move them to a specific position
        for (Forma forma : formas) {
            forma.setColor("purple");
            forma.mover(50, 50);
        }

    }
    
}
