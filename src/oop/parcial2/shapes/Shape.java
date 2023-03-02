package oop.parcial2.shapes;

public abstract class Shape {
    private double area;
    private double perimeter;
    private String name;
    private int sides;
    Shape(String name, int sides){
        this.name = name;
        this.sides = sides;
    }

    public int getSidesCount(){
        return sides;
    }
    public double getArea(){
        return area;
    }
    public double getPerimeter(){
        return perimeter;
    }
    public String getName(){
        return name;
    }
}
