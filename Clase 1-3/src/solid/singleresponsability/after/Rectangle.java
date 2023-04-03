package solid.singleresponsability.after;

public class Rectangle {

    private String color;
    private double width;
    private double height;

    public Rectangle(String color, double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public String getColor() {
        return color;
    }
}
