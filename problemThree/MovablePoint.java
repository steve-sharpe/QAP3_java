// Purpose: MovablePoint class that extends Point class and adds xSpeed and ySpeed instance variables and methods to move the point.

package problemThree;

public class MovablePoint extends Point {
    private float xSpeed; // additional instance variable
    private float ySpeed; // additional instance variable

    public MovablePoint() {
        this(0.0f, 0.0f, 0.0f, 0.0f); // default constructor
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y); // call superclass constructor
        this.xSpeed = xSpeed; // set xSpeed
        this.ySpeed = ySpeed; // set ySpeed
    }

    public float getXSpeed() {
        return xSpeed; // return xSpeed
    }

    public float getYSpeed() {
        return ySpeed; // return ySpeed
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed; // set xSpeed
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed; // set ySpeed
    }

    public void move() {
        setX(getX() + xSpeed); // call inherited methods
        setY(getY() + ySpeed); // call inherited methods
    }

    @Override
    public String toString() {
        return String.format("MovablePoint at position (%f, %f) with speed (%f, %f)", getX(), getY(), xSpeed, ySpeed);
    }
}