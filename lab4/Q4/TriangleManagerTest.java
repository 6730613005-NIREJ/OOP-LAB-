package lab4.Q4;

public class TriangleManagerTest {
    public static void main(String[] args) {
        TriangleManager manager = new TriangleManager(true);

        manager.addTriangle(new EquilateralTriangle(5));
        manager.addTriangle(new RightTriangle(3, 4, 5));
        manager.addTriangle(new EquilateralTriangle(10));

        Triangle largest = manager.findTriangleWithLargestPerimeter();

        System.out.println("Largest perimeter: " +
                largest.getPerimeter());

        try {
            manager.addTriangle(null);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        TriangleManager linkedManager = new TriangleManager(false);
        linkedManager.addTriangle(new RightTriangle(3, 4, 5));

        System.out.println(
                linkedManager.findTriangleWithLargestPerimeter()
                        .getPerimeter());
    }
}