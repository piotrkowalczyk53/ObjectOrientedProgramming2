package Lab9;

import java.util.Scanner;

import static java.lang.Math.abs;

public class Blackjack {
    private final String name;
    private final int max_iter;
    private int computerAccount;
    private int playerAccount;
    private final Deck deck;
    private String playerCards;
    private Card firstComputerCard;

    private Blackjack(Builder builder)
    {
        name = builder.name;
        max_iter = builder.max_iter;
        computerAccount = builder.computerAccount;
        playerAccount = builder.playerAccount;
        deck = builder.deck;
        playerCards = builder.playerCards;
        firstComputerCard = builder.firstComputerCard;
    }

    public void game() {
        System.out.println("Witaj w grze w oczko " + name + "!");
        System.out.println("Dostępne opcje: PLAY, STOP, QUIT");
        System.out.println("PLAY - Rozegranie następnej rundy");
        System.out.println("STOP - Podliczenie punktów i zakończenie rozgrywki");
        System.out.println("QUIT - Wymuszenie zakończenia gry bez wyłaniania zwycięzcy");
        Scanner scanner = new Scanner(System.in);
        int iteration = 1;
        while(true) {
            String choice = scanner.nextLine();
            if (choice.equalsIgnoreCase("PLAY")) {
                play(iteration);
            } else if (choice.equalsIgnoreCase("STOP")) {
                stop();
            } else if (choice.equalsIgnoreCase("QUIT")) {
                quit();
            } else {
                System.out.println("Niepoprawna opcja");
                iteration--;
            }
            iteration++;
        }
    }

    private void play(int iteration){
        Card playerCard = deck.pickRandom();
        deck.discardCard(playerCard);
        playerCards += playerCard;
        Card computerCard = deck.pickRandom();
        if(iteration == 1) {
            firstComputerCard = computerCard;
        }
        deck.discardCard(computerCard);
        computerAccount += computerCard.rank.getWeight();
        playerAccount += playerCard.rank.getWeight();
        if(playerAccount == 21 || computerAccount > 21 || computerAccount == 21 || playerAccount > 21)
        {
            stop();
        }
        else if (iteration == max_iter)
        {
            System.out.println("Maksymalna liczba rund to " + max_iter);
            System.out.println("Gra toczyła się wystarczająco długo...");
            stop();
        }
        else
        {
            System.out.println("Punkty gracza: " + playerAccount);
            System.out.println("Gracz wylosował " + playerCards);
            System.out.println("Komputer wylosował " + firstComputerCard + "oraz " + (iteration-1) + " innych kart");
            System.out.println("Gra toczy się dalej!");
        }
    }

    private void stop()
    {
        System.out.println("Punkty gracza:  " + playerAccount);
        System.out.println("Punkty komputera:  " + computerAccount);
        if(computerAccount > 21 || abs(playerAccount - 21) < abs(computerAccount - 21)) {
            System.out.println("Gracz wygrał!");
            System.exit(0);
        }
        else{
            System.out.println("Gracz przegrał!");
            System.exit(0);
        }
    }

    private void quit()
    {
        System.exit(-1);
    }

    public static class Builder{
        private final String name;
        private final int max_iter;
        private int computerAccount;
        private int playerAccount;
        private Deck deck;
        private String playerCards;
        private Card firstComputerCard;

        public Builder(String name, int max_iter) {
            this.name = name;
            this.max_iter = max_iter;
            this.computerAccount = 0;
            this.playerAccount = 0;
            this.deck = new Deck();
            this.playerCards = "";
            firstComputerCard = null;
        }

        public Blackjack build()
        {
            return new Blackjack(this);
        }
    }

}
