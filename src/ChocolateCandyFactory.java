public class ChocolateCandyFactory extends CandyFactory {
    @Override
    public Candy createCandy() {
        return new ChocolateCandy();
    }
}
