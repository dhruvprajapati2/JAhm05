// GeometryPackageDemo.java
import geometry.Circle;
import geometry.Rectangle;
import geometry.Triangle;

public class GeometryPackageDemo {
    public static void main(String[] args) {
        // Creating instances of each shape
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);
        Triangle triangle = new Triangle(3, 4, 5);

        // Calculating and printing area and perimeter for each shape
        System.out.println("Circle:");
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Perimeter: " + circle.calculatePerimeter());

        System.out.println("\nRectangle:");
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());

        System.out.println("\nTriangle:");
        System.out.println("Area: " + triangle.calculateArea());
        System.out.println("Perimeter: " + triangle.calculatePerimeter());
    }
}
