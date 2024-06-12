// Purpose: Rectangle class that extends Shape class and has width and length as instance variables.

package problemTwo; // package name

public class Rectangle extends Shape {
    protected double width; // instance variable
    protected double length; // instance variable

    public Rectangle() {
        this.width = 1.0; // default constructor
        this.length = 1.0; // default constructor
    }

    public Rectangle(double width, double length) {
        this.width = width; // constructor with width
        this.length = length; // constructor with length
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled); // constructor with width, length, color, and filled
        this.width = width; // set width
        this.length = length; // set length
    }

    public double getWidth() {
        return width; // return width
    }

    public void setWidth(double width) {
        this.width = width; // set width
    }

    public double getLength() {
        return length; // return length
    }

    public void setLength(double length) {
        this.length = length; // set length
    }

    public double getArea() {
        return width * length; // return area
    }

    public double getPerimiter() {
        return 2 * (width + length); // return perimiter
    }

    @Override
    public String toString() {
        return "The width of the rectangle is " + this.width + " with a lenght of " + this.length + "."; // return
                                                                                                         // string
    }
}