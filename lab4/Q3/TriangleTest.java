package lab4.Q3;
public class TriangleTest {
    public static void main(String[] args) {
        Triangle t1 = new EquilateralTriangle(5);
        Triangle t2 = new RightTriangle(3, 4, 5);

        System.out.println("Equilateral Triangle");
        System.out.println(t1.getLongestSideLength());
        System.out.println(t1.getPerimeter());
        System.out.println(t1.getLargestAngle());

        System.out.println("Right Triangle");
        System.out.println(t2.getLongestSideLength());
        System.out.println(t2.getPerimeter());
        System.out.println(t2.getLargestAngle());
    }
}