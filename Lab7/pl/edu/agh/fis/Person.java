package Lab7.pl.edu.agh.fis;

public abstract class Person {
    Person(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    private String firstName;
    private String lastName;

    abstract public Person greater(Person ob);
    public String getFirstName()
    {
        return firstName;
    }
    public String getLastName()
    {
        return lastName;
    }

    void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString()
    {
        return firstName + " " + lastName;
    }
}
