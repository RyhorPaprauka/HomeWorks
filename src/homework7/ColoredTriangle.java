package homework7;

public class ColoredTriangle extends Triangle {

    private String color;

    public ColoredTriangle(Point a, Point b, Point c, String color) {
        super(a, b, c);
        this.color = color;
    }

    @Override
    public String toString() {
        return getType() + "с площадью " + getSquare() + " периметром "
                + getPerimeter() + " и высотой " + getHeight()
                + " и его цвет " + getColor();
    }

    public String getColor() {
        return color;
    }
}
