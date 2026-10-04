package Q2;
import Q1.Club;
import Q1.ESportsClub;
import Q1.MarketingClub;
import Q1.SportsClub;

public class ClubManagingSystemTest {
    public static void main(String[] args) {
        Club[] clubs = {
            new Club("Student", 10),
            new SportsClub("Football", 22),
            new ESportsClub("RoV", 100),
            new MarketingClub("Advertising", 2, 100)
        };

        clubs[0].addMember(190);
        clubs[1].addMember(18);
        clubs[2].addMember(4);
        clubs[3].addMember(8);

        ClubManagingSystem system = new ClubManagingSystem(clubs);

        System.out.println("Highest member club: "
                + system.getHighestMemberClub().getName());
        System.out.println("Total budget: "
                + system.determineAllBudget());
        System.out.println("Total members: "
                + system.getAllMembers());
    }
}
