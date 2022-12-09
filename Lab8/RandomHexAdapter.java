package Lab8;

import java.nio.CharBuffer;

public final class RandomHexAdapter extends RandomHex implements Readable{
    private int _amount;
    public RandomHexAdapter(int length, int amount) {
        super(length);
        _amount = amount - 1;
    }

    public int read(CharBuffer cb)
    {
        if(_amount > -1) {
            cb.append(rand() + " ");
            _amount--;
            return get_length() + 1;
        }
        else return _amount;
    }
}
