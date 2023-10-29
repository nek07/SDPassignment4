import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CandyDispencer dispencer = new CandyDispencer();

        User user1 = new User("User 1");
        User user2 = new User("User 2");

        dispencer.registerObserver(user1);
        dispencer.registerObserver(user2);

        CandyFactory chocolateFactory = new ChocolateCandyFactory();
        CandyFactory gummyFactory = new GummyCandyFactory();
        CandyFactory hardFactory = new HardCandyFactory();

        dispencer.dispenseCandy(chocolateFactory);
        dispencer.dispenseCandy(gummyFactory);

        dispencer.removeObserver(user2);

        dispencer.dispenseCandy(hardFactory);
    }
}


