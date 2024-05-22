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
