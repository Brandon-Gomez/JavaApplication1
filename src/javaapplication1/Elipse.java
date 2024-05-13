package javaapplication1;
import java.awt.Point;

public class Elipse extends Forma {
    
    private double R;
    private double r;

    public Elipse(String color, Point centro, double R, double r) {
        super(color, centro, "elipse");
        this.R = R;
        this.r = r;
    }

    public double getArea() {
        return Math.PI * R * r;
    }

    public double getPerimeter() {
        double perimeter = 2 * Math.PI * (R + r);
        return perimeter;
    }

    public double getR() {
        return R;
    }

    public double getr() {
        return r;
    }
}