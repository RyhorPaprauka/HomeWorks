package homework7;

public class Ellipse extends Shape {

    private final double PI = 3.1415;
    private final Point CENTER = new Point(0, 0);


    public Ellipse(Point majorSemiAxisEnd, Point minorSemiAxisEnd) {
        super(majorSemiAxisEnd, minorSemiAxisEnd);
    }

    @Override
    public double getPerimeter() {
        return PI * 2 * Math.sqrt(((CENTER.distance(getA()) * CENTER.distance(getA()))
                + (CENTER.distance(getB()) * CENTER.distance(getB()))) / 2);
    }

    @Override
    public double getSquare() {
        return PI * CENTER.distance(getA()) * CENTER.distance(getB());
    }

    @Override
    public String getType() {
        if (CENTER.distance(getA()) == CENTER.distance(getB())) {
            return "Это круг ";
        }
        return "Это эллипс ";
    }

    @Override
    public String toString() {
        return getType() + "с площадью " + getSquare() + " периметром " + getPerimeter()
                + " и длинной полуоси(радиуса) " + CENTER.distance(getA());
    }
}
