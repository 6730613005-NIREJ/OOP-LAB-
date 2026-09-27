package lab2.Q2;

public class Player {

    private String name;
    private int jerseyNumber;
    private int minutesPlayed;

    public Player(String name, int jerseyNumber) {
        this.name = name;
        this.jerseyNumber = jerseyNumber;
        minutesPlayed = 0;
    }

    public void print() {
        System.out.println(name + ": " + jerseyNumber);
    }

    public int getMinutesPlayed() {
        return minutesPlayed;
    }

    protected void addMinutes(int minutes) {
        minutesPlayed = minutesPlayed + minutes;
    }

    public void changeJerseyNumber(int newNumber) {
        jerseyNumber = newNumber;
        System.out.println(name + " changes number to " + jerseyNumber);
    }
}