package homework7;

public class Quadrangle extends Polygon {

    public Quadrangle(Point a, Point b, Point c, Point d) {
        super(a, b, c, d);
    }

    @Override
    public double getSquare() {
        double squareSquare = 1;
        for (int i = 0; i < getSides().length; i++) {
            squareSquare *= (getSemiperimeter() - getSides()[i]);
        }
        return Math.sqrt(squareSquare);
    }

    @Override
    public String getType() {
        if (isDiagonalsEqual() && areSidesEqual()) {
            return "Это квадрат ";
        } else if (isDiagonalsEqual() && isSidesParallel()) {
            return "Это прямоугольник ";
        } else if (isSidesParallel() && areSidesEqual()) {
            return "Это ромб ";
        } else if (isSidesParallel()) {
            return "Это параллелограм ";
        }
        return "Это четырехугольник ";
    }

    @Override
    public String toString() {
        return getType() + "с площадью " + getSquare()
                + " и периметром " + getPerimeter();
    }

    public boolean isSidesParallel() {
        return ((getB().getY() - getA().getY()) / (getB().getX() - getA().getX())
                == (getC().getY() - getD().getY()) / (getC().getX() - getD().getX()))
                && (getC().getY() - getB().getY()) / (getC().getX() - getB().getX())
                == (getD().getY() - getA().getY()) / (getD().getX() - getA().getX());
    }

    public boolean isDiagonalsEqual() {
        return getA().distance(getC()) == getB().distance(getD());
    }
}
