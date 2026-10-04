package Q2;
import Q1.Club;
import Q1.SportsClub;

public class ClubManagingSystem {
    private Club[] clubList;

    public ClubManagingSystem(Club[] clubList) {
        this.clubList = clubList;
    }

    public int determineAllBudget() {
        int total = 0;
        for (Club club : clubList) {
            total += club.determineBudget();
        }
        return total;
    }

    public int getAllMembers() {
        int total = 0;
        for (Club club : clubList) {
            if (club instanceof SportsClub) {
                total += ((SportsClub) club).getNumMember();
            } else {
                total += club.numMember;
            }
        }
        return total;
    }

    public Club getHighestMemberClub() {
        Club highest = clubList[0];
        for (Club club : clubList) {
            if (club.numMember > highest.numMember) {
                highest = club;
            }
        }
        return highest;
    }
}
