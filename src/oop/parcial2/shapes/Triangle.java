package oop.parcial2.shapes;

public class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(){
        super("Triangulo", 3);
    }

    public Triangle(double base, double height) {
        this();
        this.base = base;
        this.height = height;
    }
    public String toString(){
        return "▲";
    }
    public double getArea(){
        return base * height / 2;
    }
    public double getPerimeter(){
        return base*3;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public String draw(){
        return "▲";
    }
}
