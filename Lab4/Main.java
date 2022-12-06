package Lab4;

import java.util.Random;

public class Main
{
    public static void main(String[] args)
    {
        Random rand = new Random();
        for(int i = 0; i < 1000; i++)
        {
            long first = Math.abs(rand.nextLong())/2;
            long second = Math.abs(rand.nextLong())/2;
            BigInt B_first = new BigInt(String.valueOf(first));
            BigInt B_second= new BigInt(String.valueOf(second));
            System.out.println(first + second + " " + B_first.plus(B_second));
        }
        long first = Long.valueOf("999999999999999999");
        long second = Long.valueOf("999999999999999999");
        BigInt B_first = new BigInt(String.valueOf(first));
        BigInt B_second= new BigInt(String.valueOf(second));
        System.out.println(first + second + " " + B_first.plus(B_second));
    }
}