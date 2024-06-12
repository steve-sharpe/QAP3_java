// Purpose: This class is a subclass of the Rectangle class. It has a side length and inherits the methods of the Rectangle class.

package problemTwo;

public class Square extends Rectangle {
    public Square() {
        super(); // default constructor
    }

    public Square(double side) {
        super(side, side); // constructor with side
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled); // constructor with side, color, and filled
    }

    @Override // set length and width
    public void setLength(double side) {
        super.setLength(side); // set length
        super.setWidth(side); // set width
    }

    @Override // set length and width
    public void setWidth(double side) {
        super.setLength(side); // set length
        super.setWidth(side); // set width
    }

    public double getSide() {
        return this.getLength(); // return side
    }

    public void setSide(double side) {
        super.setLength(side); // set length
        super.setWidth(side); // set width
    }

    @Override // return string
    public String toString() {
        return "The sides of the square are " + this.width + "."; // return string
    }

}