package Wiproan;

class Shape {
    public void area(int side) {
        System.out.println("Area of square: " + (side * side));
    }

    public void area(int length, int breadth) {
        System.out.println("Area of rectangle: " + (length * breadth));
    }

    public void perimeter(int side) {
        System.out.println("Perimeter of square: " + (4 * side));
    }

    public void perimeter(int length, int breadth) {
        System.out.println("Perimeter of rectangle: " + (2 * (length + breadth)));
    }
}

public class Question14 {

	public static void main(String[] args) {
		Shape s = new Shape();

        s.area(5);
        s.area(6, 4);

        s.perimeter(5);
        s.perimeter(6, 4);

	}

}
