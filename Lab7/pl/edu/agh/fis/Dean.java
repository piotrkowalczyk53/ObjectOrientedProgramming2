package Lab7.pl.edu.agh.fis;

public class Dean extends Person{
    private String degree;
    private int startYear;
    private int endYear;

    public Dean(String degree, String firstName, String lastName, int startYear, int endYear)
    {
        super(firstName, lastName);
        this.degree = degree;
        this.startYear = startYear;
        this.endYear = endYear;

    }

    @Override
    public String toString()
    {
        return degree + " " + super.toString() + ", Dean of the Faculty from " + startYear + " to " + endYear;
    }

    @Override
    public Person greater(Person ob) {
        if (ob instanceof Dean dean) {
            if (endYear - startYear > dean.endYear - dean.startYear)
                return this;
            return dean;
        }
        return null;
    }

    public void setEndYear(int endYear) {
        this.endYear = endYear;
    }

    public void setStartYear(int startYear) {
        this.startYear = startYear;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public int getEndYear() {
        return endYear;
    }

    public int getStartYear() {
        return startYear;
    }

    public String getDegree() {
        return degree;
    }
}
