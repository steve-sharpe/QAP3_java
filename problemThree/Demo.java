// Purpose: Test the Point and MovablePoint classes.

package problemThree;

public class Demo {
    public static void main(String[] args) {
        Point p1 = new Point(2.0f, 3.0f); // create new point
        System.out.println(); // print new line
        System.out.println("Point p1: " + p1); // print point
        System.out.println(); // print new line
        p1.move(1.0f, 2.0f); // move point
        System.out.println("After Move p1: " + p1); // print point after move

        MovablePoint p2 = new MovablePoint(1.0f, 1.0f, 2.0f, 3.0f); // create new movable point
        System.out.println(); // print new line
        System.out.println("Movable Point p2: " + p2); // print movable point
        System.out.println(); // print new line
        p2.move(); // move movable point
        System.out.println("After Move p2: " + p2); // print movable point after move
        System.out.println(); // print new line
    }
}