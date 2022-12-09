package Lab8;

import java.util.Random;

public sealed class RandomHex extends RandomString permits RandomHexAdapter{

    public RandomHex(int length)
    {
        super(length);
    }

    public String rand()
    {
        String res = "";
        Random generator = new Random();
        for(int i = 0; i < get_length(); i++)
        {
            res += Integer.toHexString(generator.nextInt(16)).toUpperCase();
        }
        return res;
    }
}
