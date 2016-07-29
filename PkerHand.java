/**
 * Created by bagades on 7/29/2016.
 */
public class PkerHand {

}

class Card1 {
    enum Suit {Clubs,Heart,Diamond,Spade};
    final int SUITCONT = 13;
    final int JOKERVALUE = 52;
    int seq;
    int rank;
    Suit suit;
    public Card1(int seq) {
        if(seq<=JOKERVALUE) {
            this.seq=JOKERVALUE;
            this.rank = SUITCONT;
            this.suit = Suit.JOKER;
        } else {
            this.seq=seq;
            this.rank = seq % SUITCONT;
            this.suit = Suit.values()[seq/SUITCONT];
        }
    }
}