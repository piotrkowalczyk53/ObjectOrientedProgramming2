package Lab9;

public class Main {
    public static void main(String[] args) {
        Blackjack game = new Blackjack.Builder("Gracz 1", 3).build();
        game.game();
    }
}
