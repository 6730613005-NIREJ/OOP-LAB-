package lab4.Q2;
import java.util.Scanner;

public class StudentInputTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter age: ");
            int age = sc.nextInt();

            System.out.print("Enter GPA: ");
            double gpa = sc.nextDouble();

            UndergradStudent u = new UndergradStudent(age, gpa);
            GradStudent g = new GradStudent(age, gpa);

            System.out.println("Undergraduate created successfully");
            System.out.println("Graduate created successfully");

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}