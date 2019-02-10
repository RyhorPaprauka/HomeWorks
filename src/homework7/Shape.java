package homework7;

public abstract class Shape implements Extruder, Tapering {

    private Point a;
    private Point b;

    public Shape(Point a, Point b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getExtrusionVolume(double depth) {
        return getSquare() * depth;
    }

    @Override
    public double getTaperingVolume(double height) {
        return (getSquare() / 3) * height;
    }

    public abstract double getPerimeter();

    public abstract double getSquare();

    public abstract String getType();

    public boolean isSquareEqual(Shape shape) {
        return this.getSquare() == shape.getSquare();
    }

    public Point getA() {
        return a;
    }

    public Point getB() {
        return b;
    }
}
