package wk1;

import java.io.DataOutputStream;
import java.io.IOException;

public class Rectangle extends Shape {
    private int height;
    private int width;

    public Rectangle(int x, int y, String color, int width, int height) {
        super(x, y, color);
        this.width = width;
        this.height = height;
    }
    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public String toString() {
        return "Rectange";
    }

    @Override
    public void writeRaw(DataOutputStream out) throws IOException {
        out.writeChar('R');
        super.writeRaw(out);
        out.writeInt(width);
        out.writeInt(height);
    }
}
