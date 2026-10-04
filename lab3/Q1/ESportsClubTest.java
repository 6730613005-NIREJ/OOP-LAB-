package Q1;
public class ESportsClubTest {
    public static void main(String[] args) {
        ESportsClub e = new ESportsClub("Esport", 100);

        System.out.println("ESportsClub:");
        System.out.println("Name: " + e.getName());
        System.out.println("Min members: " + e.minNumMember);
        System.out.println("Members: " + e.getNumMember());
        System.out.println("Advertise:");
        e.advertise();
        System.out.println("Budget: " + e.determineBudget());
        System.out.println("Name: " + e.getName());

        System.out.println();

        Club c = new ESportsClub("Esport", 100);

        System.out.println("Club reference:");
        System.out.println("Name: " + c.getName());
        System.out.println("Advertise:");
        c.advertise();
        System.out.println("Budget: " + c.determineBudget());
        System.out.println("Name: " + c.getName());
    }
}
