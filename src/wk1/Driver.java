package wk1;

import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(Files.newInputStream(Path.of("data/shapes.txt")));
        System.out.println("Enter a shape using the following format:");
        System.out.println("Rectangle: x y color width height");
        System.out.println("Circle: x y color radius");
        System.out.println("How many shapes do you want to enter?");
        int numberOfShapes = in.nextInt();
        in.nextLine();
        ArrayList<Shape> shapes = new ArrayList<>();
        for (int i = 0; i < numberOfShapes; i++) {
            try {
                Shape shape = getShape(in.nextLine());
                shapes.add(shape);
            } catch (InputMismatchException e) {
                System.err.println("Problem reading line, try again");
                i--;
            }
        }
        try (DataOutputStream out = new DataOutputStream(Files.newOutputStream(Path.of("data/shapes.bin")))) {
            for (Shape shape : shapes) {
                shape.writeRaw(out);
            }
        } catch (IOException e) {
            System.err.println("Error writing file");
        }
    }

    private static Shape getShape(String line) {
        Scanner in = new Scanner(line);
        Shape shape = null;
        String shapeType = in.next();
        int x = in.nextInt();
        int y = in.nextInt();
        String color = in.next();
        if (shapeType.equalsIgnoreCase("rectangle:")) {
            int width = in.nextInt();
            int height = in.nextInt();
            shape = new Rectangle(x, y, color, width, height);
        } else if (shapeType.equalsIgnoreCase("circle:")) {
            int radius = in.nextInt();
            shape = new Circle(x, y, color, radius);
        }
        return shape;
    }
}
