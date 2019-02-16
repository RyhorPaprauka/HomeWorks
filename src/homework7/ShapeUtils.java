package homework7;

public class ShapeUtils {

    static boolean isItTriangle(Polygon polygon) {
        int counter = 0;
        for (int i = 0; i < polygon.getTops().length; i++) {
            counter++;
        }
        return counter == 3;
    }

    static boolean isItQuadrangle(Polygon polygon) {  // надеюсь, 4угольник подойдет по смыслу к заданию.
        int counter = 0;
        for (int i = 0; i < polygon.getTops().length; i++) {
            counter++;
        }
        return counter == 4;
    }
}
