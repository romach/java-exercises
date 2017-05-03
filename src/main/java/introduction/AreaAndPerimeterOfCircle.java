package introduction;

/**
 * Write a program that displays the area and perimeter of a circle that has a radius of 5.5 using the following formula:
 * perimeter = 2 * radius * pi
 * area = radius * radius * pi
 *
 * @author Roman.
 */
public class AreaAndPerimeterOfCircle {
    public static void main(String[] args) {
        final double radius = 5.5;
        final double perimeter = 2 * radius * Math.PI;
        final double area = radius * radius * Math.PI;
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Area: " + area);
    }
}
