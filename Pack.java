import java.util.ArrayList;

/**
 * Created by bagades on 7/29/2016.
 */
public class Pack {
    ArrayList<Card> pack = null;
    Pack () {

        this.pack = new ArrayList<Card>();
        for (int i = 1; i <14; i++) {
            this.pack.add(new Card("Heart", i ));
        }
        for (int i = 1; i <14; i++) {
            this.pack.add(new Card("Clubs", i ));
        }
        for (int i = 1; i <14; i++) {
            this.pack.add(new Card("Diamonds", i ));
        }
        for (int i = 1; i <14; i++) {
            this.pack.add(new Card("Spades", i ));
        }
    }
}
