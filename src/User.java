public class User implements CandyObserver {
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(String candyType) {
        System.out.println(name + " received " + candyType + " candy.");
    }

}