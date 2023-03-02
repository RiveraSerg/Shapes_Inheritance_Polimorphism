package oop.parcial2.shapes;

import java.awt.image.CropImageFilter;

public class Circle extends Shape {
    private double radio;
    public Circle(){
        super("Circulo", 0);
    }
    public Circle(double radio){
        this();
        this.radio = radio;
    }
    public String toString(){
        return "○";
    }
    public double getArea(){
        return Math.pow(radio, 2) * Math.PI;
    }
    public double getPerimeter(){
        return 2 * Math.PI * radio;
    }
    public void setRadio(double radio) {
        this.radio = radio;
    }
    public double getRadio() {
        return radio;
    }
    public String draw(){
        return "○";
    }
}
