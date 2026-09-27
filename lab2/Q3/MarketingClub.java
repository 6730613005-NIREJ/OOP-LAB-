package lab2.Q3;

public class MarketingClub extends Club {

    private int budget;

    public MarketingClub(String clubName, int minNumMember, int budget) {
        super(clubName, minNumMember);
        this.budget = budget;
    }

    public boolean useBudget(int amount) {
        if (amount <= budget) {
            budget = budget - amount;
            return true;
        }

        return false;
    }

    @Override
    public int determineBudget() {
        if (budget > 1000) {
            return 0;
        }

        return super.determineBudget();
    }
}
