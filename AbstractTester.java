abstract class Shape {
    abstract void area();

    public Shape() {
        System.out.println("Shape created");
    }
}

class Circle extends Shape {
    int rad;

    public Circle(int r) {
        rad = r;
    }

    @Override
    public void area() {
        System.out.println("Area of circle: " + (3.14f * rad * rad));
    }
}

public class AbstractTester {
    public static void main(String[] args) {
        Circle c1 = new Circle(5);
        c1.area();
    }
}
