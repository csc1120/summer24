package wk1;

import java.io.DataOutputStream;
import java.io.IOException;

public class Circle extends Shape {
    private int radius;

    public Circle(int x, int y, String color, int radius) {
        super(x, y, color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle";
    }

    @Override
    public void writeRaw(DataOutputStream out) throws IOException {
        out.writeChar('C');
        super.writeRaw(out);
        out.writeInt(radius);
    }
}
