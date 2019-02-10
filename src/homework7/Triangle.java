package homework7;

public class Triangle extends Polygon {


    public Triangle(Point a, Point b, Point c) {
        super(a, b, c);
    }

    @Override
    public double getSquare() {
        double heronFormula = 1;
        for (int i = 0; i < getSides().length; i++) {
            heronFormula *= (getSemiperimeter() - getSides()[i]);
        }
        return Math.sqrt(getSemiperimeter() * heronFormula);
    }

    @Override
    public String getType() {
        if (areSidesEqual()) {
            return "Это правильный треугольник ";
        } else if (getA().distance(getB()) == getA().distance(getC())
                || getA().distance(getB()) == getB().distance(getC())) {
            return "Это равнобедренный треугольник ";
        }
        return "Это треугольник ";
    }

    @Override
    public String toString() {
        return getType() + "с площадью " + getSquare() + " периметром "
                + getPerimeter() + " и высотой " + getHeight();
    }

    public double getHeight() {
        return (getSquare() * 2) / getA().distance(getB());
    }
}
