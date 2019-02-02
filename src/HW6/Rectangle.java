package HW6;

public class Rectangle {

    private Point leftTop;
    private Point rightBottom;

    public Rectangle(Point leftTop, Point rightBottom) {
        this.leftTop = leftTop;
        this.rightBottom = rightBottom;
    }

    public double Square() {
        return (leftTop.getY() - rightBottom.getY()) * (rightBottom.getX() - leftTop.getX());
    }

    public double diagonalLength() {
        return leftTop.distance(rightBottom);
    }
}
