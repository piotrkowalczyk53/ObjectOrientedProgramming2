package Lab3;

public class Main {
    public static void main(String[] args) {
        String[] args2 = new String[0];
        Lab03.main(args2);

        Vector a = new Vector(1, 2, 5);
        Vector b = new Vector(-1, -2, 16);
        Vector c = new Vector(4.5, 7, 1);
        Vector temp1 = a.multiply(Vector.dotProduct(a, Vector.crossProduct(b, c)));
        Vector temp2 = b.multiply(Vector.dotProduct(b, Vector.crossProduct(a, c)));
        Vector result = ((temp1.subtract(temp2)).add(Vector.VERSOR_X)).subtract(Vector.VERSOR_Y);
        result.opposite();
        System.out.println(result.length());
    }
}
