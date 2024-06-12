// Purpose: This file is used to test the Shape, Circle, Rectangle, and Square classes.

package problemTwo;

public class Demo {
    public static void main(String[] args) {
        Shape shapeOne = new Shape(); // default constructor
        Shape shapeTwo = new Shape("orange", false); // constructor with color and filled

        Circle circleOne = new Circle(); // default constructor
        Circle circleTwo = new Circle(3.2, "pink", false); // constructor with radius, color, and filled

        Rectangle rectangleOne = new Rectangle(); // default constructor
        Rectangle rectangleTwo = new Rectangle(4.5, 5.5); // constructor with width and length

        Square squareOne = new Square(1.7); // constructor with side
        Square squareTwo = new Square(3.4, "blue", true); // constructor with side, color, and filled

        System.out.println(); // print empty line
        System.out.println(shapeOne); // print shapeOne
        System.out.println(); // print empty line
        System.out.println(shapeTwo); // print shapeTwo
        System.out.println(); // print empty line
        System.out.println(circleTwo); // print circleTwo
        System.out.println(); // print empty line
        System.out.println(rectangleOne); // print rectangleOne
        System.out.println(); // print empty line
        System.out.println(squareTwo); // print squareTwo
        System.out.println(); // print empty line

        System.out.println("circleOne area: " + circleOne.getArea()); // print circleOne area
        System.out.println(); // print empty line
        System.out.println("circleOne perimiter: " + circleOne.getPerimiter()); // print circleOne perimiter
        System.out.println(); // print empty line

        System.out.println("rectangleTwo area: " + rectangleTwo.getArea()); // print rectangleTwo area
        System.out.println(); // print empty line
        System.out.println("rectangleTwo perimiter: " + rectangleTwo.getPerimiter()); // print rectangleTwo perimiter
        System.out.println(); // print empty line

        System.out.println("squareOne area: " + squareOne.getArea()); // print squareOne area
        System.out.println(); // print empty line
        System.out.println("squareOne perimiter: " + squareOne.getPerimiter()); // print squareOne perimiter
        System.out.println(); // print empty line
    }
}