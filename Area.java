package find_area;

public class Area {
    private int length;
    private int breadth;

    // Method to set dimensions
    public void setDim(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Method to calculate and return area
    public int getArea() {
        return length * breadth;
    }

    public static void main(String[] args) {
        // Creating an instance of the class
        Area rectangle = new Area();

        // Setting dimensions
        rectangle.setDim(5, 10);

        // Getting and printing the area
        System.out.println("Area of the rectangle: " + rectangle.getArea());
    }
}
