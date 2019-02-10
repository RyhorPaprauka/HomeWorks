package homework7;

public abstract class Polygon extends Shape {

    private Point c;
    private Point d;
    private Point[] tops;

    public Polygon(Point a, Point b, Point c) {
        super(a, b);
        this.c = c;
        this.tops = new Point[]{getA(), getB(), getC()};
    }

    public Polygon(Point a, Point b, Point c, Point d) {
        super(a, b);
        this.c = c;
        this.d = d;
        this.tops = new Point[]{getA(), getB(), getC(), getD()};
    }

    @Override
    public final double getPerimeter() {
        double perimeter = 0;
        for (int i = 0; i < getSides().length; i++) {
            perimeter += getSides()[i];
        }
        return perimeter;
    }

    public final double getSemiperimeter() {
        return getPerimeter() / 2;
    }

    public final double[] getSides() {
        double[] sides = new double[getTops().length];
        for (int i = 0; i < getTops().length - 1; i++) {
            sides[i] = getTops()[i].distance(getTops()[i + 1]);
        }
        sides[sides.length - 1] = getTops()[0].distance(getTops()[getTops().length - 1]);
        return sides;
    }

    public final boolean areSidesEqual() {
        for (int i = 1; i < getSides().length; i++)
            if (getSides()[i] != getSides()[i - 1]) {
                return false;
            }
        return true;
    }

    public Point getC() {
        return c;
    }

    public Point getD() {
        return d;
    }

    public Point[] getTops() {
        return tops;
    }
}
