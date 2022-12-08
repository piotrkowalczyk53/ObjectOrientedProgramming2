package Lab9;

public class Main {
    public static void main(String[] args) {
        Blackjack game = new Blackjack.Builder("Piotr", 3).build();
        game.game();
    }
}
