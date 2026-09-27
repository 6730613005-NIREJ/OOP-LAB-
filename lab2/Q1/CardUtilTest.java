package lab2.Q1;

public class CardUtilTest {

    public static void main(String[] args) {

        Card card1 = new Card(Rank.ACE, Suite.SPADES);
        Card card2 = new Card(Rank.KING, Suite.HEARTS);

        System.out.println(CardUtil.isHighestCard(card1));
        System.out.println(CardUtil.isHighestCard(card2));
    }
}