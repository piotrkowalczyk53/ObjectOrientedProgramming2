package Lab3;

import java.util.Objects;

public class Vector {
    public Vector()
    {
        this(0.0, 0.0, 0.0);
    }

    public Vector(double x)
    {
        this(x, 0.0, 0.0);
    }

    public Vector(double x, double y)
    {
        this(x, y, 0.0);
    }

    public Vector(double x, double y, double z)
    {
        _x = x;
        _y = y;
        _z = z;
    }

    public static Vector vectorOf(double x, double y, double z)
    {
        return new Vector(x, y, z);
    }

    private double _x, _y, _z;
    static public final Vector ZERO = new Vector();
    static public final Vector VERSOR_X = new Vector(1.0);
    static public final Vector VERSOR_Y = new Vector(0.0, 1.0);
    static public final Vector VERSOR_Z = new Vector(0.0, 0.0, 1.0);

    public double getX()
    {
        return _x;
    }

    public double getY()
    {
        return _y;
    }

    public double getZ()
    {
        return _z;
    }

    public void setX(double x)
    {
        _x = x;
    }

    public void setY(double y)
    {
        _y = y;
    }

    public void setZ(double z)
    {
        _z = z;
    }

    public Vector add(Vector other)
    {
        return new Vector(_x + other._x, _y + other._y, _z + other._z);
    }

    public Vector subtract(Vector other)
    {
        return new Vector(_x - other._x, _y - other._y, _z - other._z);
    }

    public Vector multiply(double number)
    {
        return new Vector(_x * number, _y * number, _z * number);
    }

    static public double dotProduct(Vector first, Vector other)
    {
        return first._x * other._x + first._y * other._y + first._z * other._z;
    }

    static public Vector crossProduct(Vector first, Vector other)
    {
        return new Vector(first._y * other._z - first._z * other._y, first._z * other._x - first._x * other._z, first._x * other._y - first._y * other._x);
    }

    public double length()
    {
        return Math.sqrt(_x*_x+_y*_y+_z*_z);
    }

    public void normalize()
    {
        double leng = length();
        _x /= leng;
        _y /= leng;
        _z /= leng;
    }

    public void opposite()
    {
        _x = -_x;
        _y = -_y;
        _z = -_z;
    }

    @Override
    public String toString()
    {
        return "[" + _x + ", " + _y + ", " +_z + "]";
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(_x, _y, _z);
    }

    @Override
    public boolean equals(Object other)
    {
        if (this == other) return true;
        if (other == null) return false;
        if (getClass() != other.getClass()) return false;
        Vector oVector = (Vector) other;
        return Double.compare(_x, oVector._x) == 0 && Double.compare(_y, oVector._y) == 0 && Double.compare(_z, oVector._z) == 0;
    }
}
