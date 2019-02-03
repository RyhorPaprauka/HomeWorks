package HW6;

public class Rectangle {

    private Point leftTop;
    private Point rightBottom;

    public Rectangle(Point leftTop, Point rightBottom) {
        this.leftTop = leftTop;
        this.rightBottom = rightBottom;
    }

    public double Square() {
        Point leftBottom = new Point(leftTop.getX(), rightBottom.getY());
        return (leftTop.distance(leftBottom) * leftBottom.distance(rightBottom));
    }

    public double diagonalLength() {
        return leftTop.distance(rightBottom);
    }
}
