package Lab8;

import java.util.Random;

public final class RandomOct extends RandomString{

    public RandomOct(int length)
    {
        super(length);
    }

    public String rand()
    {
        String res = "";
        Random generator = new Random();
        for(int i = 0; i < get_length(); i++)
        {
            res += generator.nextInt(8);
        }
        return res;
    }
}
