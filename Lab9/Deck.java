package Lab9;

import java.util.Arrays;
import java.util.Random;

public class Deck {
    private int size = 24;
    private Card cards[] = new Card[size];

    public Deck() {
        int i = 0;
        for (var tempRank: Rank.values())
        {
            for (var tempSuit: Suit.values())
            {
                Card tempCard = new Card(tempRank, tempSuit);
                cards[i] = tempCard;
                i++;
            }
        }
    }

    public Card pickRandom()
    {
        Random generator = new Random();
        int index = generator.nextInt(size);
        return cards[index];
    }

    public void discardCard(Card card)
    {
        int index = -1;
        for(int i = 0; i < size; i++)
        {
            if(card.equals(cards[i]))
            {
                index = i;
                break;
            }
        }
        if(index >= 0) {
            Card temp = cards[size-1];
            cards[size-1] = null;
            cards[index] = temp;
            size--;
        }
    }

    @Override
    public String toString() {
        return "Deck{" +
                "size=" + size +
                ", cards=" + Arrays.toString(cards) +
                '}';
    }
}
