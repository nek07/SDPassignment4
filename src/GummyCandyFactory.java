public class GummyCandyFactory extends CandyFactory{
    @Override
    public Candy createCandy() {
        return new GummyCandy();
    }
}
