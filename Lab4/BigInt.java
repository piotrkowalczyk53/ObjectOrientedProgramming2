package Lab4;

import java.util.Arrays;

import static java.lang.Math.max;

public final class BigInt {
    private final byte[] _num;
    public static final BigInt ZERO = new BigInt(new byte[]{0});
    public static final BigInt ONE = new BigInt(new byte[]{1});
    public static final BigInt TWO = new BigInt(new byte[]{2});
    public static final BigInt TEN = new BigInt(new byte[]{1, 0});

    BigInt() {
        _num = new byte[1];
        _num[0] = 0;
    }

    BigInt(byte[] val) {
        _num = new byte[val.length];
        System.arraycopy(val, 0, _num, 0, val.length);
    }

    BigInt(String val) {
        _num = new byte[val.length()];
        for (int i = 0; i < _num.length; i++) {
            _num[i] = Byte.valueOf(String.valueOf(val.charAt(i))).byteValue();
        }
    }

    public static BigInt valueOf(byte[] arr) {
        if (Arrays.equals(BigInt.ZERO._num, arr)) return BigInt.ZERO;
        if (Arrays.equals(BigInt.ONE._num, arr)) return BigInt.ONE;
        if (Arrays.equals(BigInt.TWO._num, arr)) return BigInt.TWO;
        if (Arrays.equals(BigInt.TEN._num, arr)) return BigInt.TEN;
        return new BigInt(arr);
    }

    public static BigInt valueOf(String val) {
        BigInt arr = new BigInt(val);
        if (Arrays.equals(BigInt.ZERO._num, arr._num)) return BigInt.ZERO;
        if (Arrays.equals(BigInt.ONE._num, arr._num)) return BigInt.ONE;
        if (Arrays.equals(BigInt.TWO._num, arr._num)) return BigInt.TWO;
        if (Arrays.equals(BigInt.TEN._num, arr._num)) return BigInt.TEN;
        return arr;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null) return false;
        if (getClass() != other.getClass()) return false;
        BigInt temp = (BigInt) other;
        return Arrays.equals(_num, temp._num);
    }

    @Override
    public String toString() {
        String str = "";
        for (byte b : _num)
            str += String.valueOf(b);
        return str;
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(_num);
    }

    public byte[] getNum() {
        return Arrays.copyOf(_num, _num.length);
    }

    public byte getDigit(int i) {
        return _num[i];
    }

    public BigInt plus(BigInt other) {
        int thisLength = this._num.length;
        int otherLength = other._num.length;
        int resultLength = max(thisLength, otherLength) + 1;
        byte overflow = 0;
        BigInt result = new BigInt(new byte[resultLength]);
        while (thisLength > 0 || otherLength > 0) {
            byte digit1 = (thisLength > 0 ? this._num[thisLength - 1] : 0);
            byte digit2 = (otherLength > 0 ? other._num[otherLength - 1] : 0);
            byte sum = (byte) (digit1 + digit2 + overflow);
            overflow = 0;
            while(sum >= 10) {
                overflow++;
                sum -= 10;
            }
            result._num[resultLength - 1] = sum;
            thisLength--;
            otherLength--;
            resultLength--;
        }
        result._num[0] = overflow;
        return result;
    }
}
