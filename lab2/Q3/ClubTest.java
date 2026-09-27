package lab2.Q3;

public class ClubTest {

    public static void main(String[] args) {

        Club club = new Club("Computer Club", 5);

        club.addMember();
        club.addMember();

        System.out.println(club.getName());
        System.out.println(club.determineBudget());

        club.changeName("Programming Club");
        System.out.println(club.getName());

        SportsClub sports = new SportsClub("Football Club", 5);

        sports.addMember();
        sports.addMember();
        sports.addMember();
        sports.addMember();
        sports.addMember();
        sports.addMember();

        System.out.println(sports.getName());
        System.out.println(sports.determineBudget());

        sports.changeName("Basketball Club");
        System.out.println(sports.getName());

        MarketingClub marketing =
                new MarketingClub("Marketing Club", 5, 2000);

        System.out.println(marketing.determineBudget());

        System.out.println(marketing.useBudget(500));
        System.out.println(marketing.useBudget(2000));
    }
}
