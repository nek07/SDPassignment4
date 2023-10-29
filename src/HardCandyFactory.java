public class HardCandyFactory extends CandyFactory {
    @Override
    public Candy createCandy() {
        return new HardCandy();
    }
}