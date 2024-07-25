package wk1;

import java.io.DataOutputStream;
import java.io.IOException;

public abstract class Shape {
    private int x;
    private int y;
    private String color;

    public Shape(int x, int y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    @Override
    public boolean equals(Object shape) {
        boolean equal = false;
        if (shape instanceof Shape) {
            Shape shp = (Shape) shape;
            equal = this.x == shp.x && this.y == shp.y && this.color.equals(shp.color);
        }
        return equal;
    }

    @Override
    public int hashCode() {
        return color.hashCode() + 3 * x + y;
    }

    public Shape() {
        this(0, 0, "black");
    }

    public abstract double getArea();

    protected void writeRaw(DataOutputStream out) throws IOException {
        out.writeInt(x);
        out.writeInt(y);
        out.writeChars(color);
    }

}
