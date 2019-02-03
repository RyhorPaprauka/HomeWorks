package HW6;

public class RectangleDemo {

    public static void main(String[] args) {
        Point leftTop = new Point(-4, 2);
        Point rightBottom = new Point(3, -1);
        Rectangle rectangle = new Rectangle(leftTop, rightBottom);
        Rectangle rectangle12 = new Rectangle(new Point(-1, 1), new Point(5, -3));

        System.out.println("Площадь: " + rectangle.Square());
        System.out.println("Диагональ: " + rectangle.diagonalLength());

        System.out.println("Площадь: " + rectangle12.Square());
        System.out.println("Диагональ: " + rectangle12.diagonalLength());
    }
}
