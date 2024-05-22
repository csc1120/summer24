package wk1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a shape using the following format:");
        System.out.println("Rectangle: x y color width height");
        System.out.println("Circle: x y color radius");
        Shape shape = null;
        String shapeType = in.next();
        int x = in.nextInt();
        int y = in.nextInt();
        String color = in.next();
        if (shapeType.equals("Rectangle:")) {
            int width = in.nextInt();
            int height = in.nextInt();
            shape = new Rectangle(x, y, color, width, height);
        } else if (shapeType.equals("Circle:")) {
            int radius = in.nextInt();
            shape = new Circle(x, y, color, radius);
        }
        System.out.println(shape + " " + shape.getArea());
    }
}
