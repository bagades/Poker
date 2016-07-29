/**
 * Created by bagades on 7/29/2016.
 */
public class Card implements Comparable<Card>{
    String suit = "";
    int pip  = 0;


    public Card ( String suit, int pip)
    {
        this.suit = suit;
        this.pip = pip;
    }
    public String pipToString(int pip )
    {
        switch (pip) {
            case 0:
                return "Joker";
            case 1:
                return "Ace";
            case 11:
                return "Jack";
            case 12:
                return "Queen";
            case 13:
                return "King";
            default :
                return pip + "";
        }

    }

    @Override
    public int compareTo(Card o) {
        if (this.pip > o.pip) {
            return 1;
        }
        return -1;
    }
}
