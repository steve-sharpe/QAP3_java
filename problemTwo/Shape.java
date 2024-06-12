// Purpose: This file contains the Shape class which is the parent class for the Circle and Rectangle classes.

package problemTwo;

public class Shape {
    protected String color; // instance variable
    protected boolean filled; // instance variable

    public Shape() {
        this.color = "green"; // default constructor
        this.filled = true; // default constructor
    }

    public Shape(String color, boolean filled) {
        this.color = color; // constructor with color
        this.filled = filled; // constructor with filled
    }

    public String getColor() {
        return color; // return color
    }

    public void setColor(String color) {
        this.color = color; // set color
    }

    public boolean isFilled() {
        return filled; // return filled
    }

    public void setFilled(boolean filled) {
        this.filled = filled; // set filled
    }

    @Override
    public String toString() {
        String filled = "not filled"; // default filled
        if (isFilled())
            filled = "filled"; // set filled

        return String.format("The color of the shape is %s and it is %s.", this.color, filled); // return string
    }
}