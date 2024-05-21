package wk1;

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

}
