package Lab9;

public enum Rank {
    NINE(9, "9"), TEN(10, "10"), JACK(2, "J"), QUEEN(3, "Q"), KING(4, "K"), ACE(11, "A");

    Rank(int weight, String symbol) {
        this.weight = weight;
        this.symbol = symbol;
    }

    private final int weight;

    public int getWeight() {
        return weight;
    }

    private final String symbol;

    @Override
    public String toString() {
        return symbol;
    }
}
