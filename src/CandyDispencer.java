import java.util.ArrayList;
import java.util.List;

public class CandyDispenser {
    private List<CandyObserver> observers = new ArrayList<>();

    public void registerObserver(CandyObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(CandyObserver observer) {
        observers.remove(observer);
    }

    public void dispenseCandy(CandyFactory candyFactory) {
        Candy candy = candyFactory.createCandy();
        candy.dispense();
        notifyObservers(candy.getClass().getSimpleName());
    }

    private void notifyObservers(String candyType) {
        for (CandyObserver observer : observers) {
            observer.update(candyType);
        }
    }