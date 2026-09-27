package lab2.Q4;

public class PersonTest {

    public static void main(String[] args) {

        Mother mother = new Mother();
        mother.setFirstName("Alice");

        Father father = new Father(mother);
        father.setFirstName("Bob");

        Child child = new Child(10, 140, 40.5);
        child.setFirstName("John");

        mother.setHusband(father);
        father.getWife().setFirstName("Alice");

        child.setGuardian(mother);

        System.out.println(mother.getFirstName());
        System.out.println(father.getFirstName());
        System.out.println(child.getFirstName());
    }
}
