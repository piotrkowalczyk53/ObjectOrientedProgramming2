package Lab8;

public sealed abstract class RandomString permits RandomOct, RandomHex{
    private final int _length;
    public RandomString(int length)
    {
        _length = length;
    }

    public abstract String rand();

    public int get_length() {
        return _length;
    }
}
