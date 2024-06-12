// Purpose: This class is a subclass of the Shape class. It represents a Circle object with a radius. It has methods to calculate the area and perimeter of the circle.

package problemTwo;

public class Circle extends Shape {
    protected double radius; // instance variable

    public Circle() {
        this.radius = 1.0; // default constructor
    }

    public Circle(double radius) {
        this.radius = radius; // constructor with radius
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled); // constructor with radius, color, and filled
        this.radius = radius; // set radius
    }

    // getters and setters
    public double getRadius() {
        return radius; // return radius
    }

    public void setRadius(double radius) {
        this.radius = radius; // set radius
    }

    // methods
    public double getArea() {
        return Math.PI * (radius * radius); // return area
    }

    public double getPerimiter() {
        return 2 * Math.PI * radius; // return perimiter
    }

    @Override
    public String toString() {
        return "The radius of the circle is " + this.radius; // return
                                                             // string
    }
}