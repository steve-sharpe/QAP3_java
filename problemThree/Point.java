// Purpose: Define a class that represents a point in 2D space.

package problemThree;

public class Point {
    private float x; // instance variable
    private float y; //

    public Point() {
        this(0.0f, 0.0f); // default constructor
    }

    public Point(float x, float y) {
        this.x = x; // set x
        this.y = y; // set y
    }

    public float getX() {
        return x; // return x
    }

    public float getY() {
        return y; // return y
    }

    public void setX(float x) {
        this.x = x; // set x
    }

    public void setY(float y) {
        this.y = y; // set y
    }

    public void move(float xOffset, float yOffset) {
        x += xOffset; // move x
        y += yOffset; // move y
    }

    @Override
    public String toString() {
        return String.format("Point at position (%f, %f)", x, y);
    }
}