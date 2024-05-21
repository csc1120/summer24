package wk1;

public class Driver {
    public static void main(String[] args) {
        Shape shape;
        if (Math.random() < 0.5) {
            shape = new Rectangle(0, 0, "black", 5, 8);
        } else {
            shape = new Circle(0, 0, "black", 3);
        }
        System.out.println(shape + " " + shape.getArea());
    }
}
