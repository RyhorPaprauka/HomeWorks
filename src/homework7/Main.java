package homework7;

public class Main {

    public static void main(String[] args) {
        Triangle triangle = new Triangle
                (new Point(0, 0), new Point(3, 3), new Point(6, 0));
        Quadrangle quadrangle = new Quadrangle
                (new Point(0, 0), new Point(0, 3), new Point(6, 3), new Point(6, 0));
        Ellipse ellipse = new Ellipse
                (new Point(-3, 0), new Point(0, 2));
        Shape greenTriangle = new ColoredTriangle
                (new Point(0, 0), new Point(3, 3), new Point(3, 0), "зеленый");

        availableShapes(triangle, quadrangle, ellipse, greenTriangle);
        getAllSquares(triangle, quadrangle, ellipse);
        getAllSemiperimeters(triangle, quadrangle);

        System.out.println(quadrangle.getType() + " выдавленный с обьемом " + quadrangle.getExtrusionVolume(7));

        System.out.println(triangle.getType() + " вытянутый в пирамиду с обьемом "
                + triangle.getTaperingVolume(5));

        System.out.println(ellipse.getType() + " вытянутый в конус с объемом " + ellipse.getTaperingVolume(3));

        System.out.println(triangle.isSquareEqual(ellipse));

        System.out.println(ShapeUtils.isItQuadrangle(triangle));

        System.out.println(ShapeUtils.isItTriangle(triangle));
    }

    public static void availableShapes(Shape... shapes) {
        for (Shape shape : shapes) {
            System.out.println(shape.toString());
        }
    }

    public static void getAllSquares(Shape... shapes) {
        for (Shape shape : shapes) {
            System.out.println("площадь:" + shape.getSquare());
        }
    }

    public static void getAllSemiperimeters(Polygon... polygons) {
        for (Polygon polygon : polygons) {
            System.out.println("полупериметр: " + polygon.getSemiperimeter());
        }
    }
}
