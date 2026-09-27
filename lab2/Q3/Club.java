package lab2.Q3;

public class Club {

    protected String clubName;
    protected int minNumMember;
    protected int numMember;

    public Club(String clubName, int minNumMember) {
        this.clubName = clubName;
        this.minNumMember = minNumMember;
        this.numMember = 0;
    }

    public void addMember() {
        numMember++;
    }

    public void changeName(String newName) {
        clubName = newName;
    }

    public String getName() {
        return clubName;
    }

    public int determineBudget() {
        return numMember * 1000;
    }

    public void advertise() {
        System.out.println("Advertising " + clubName);
    }
}