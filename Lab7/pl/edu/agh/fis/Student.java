package Lab7.pl.edu.agh.fis;

public class Student extends Person {
    private int idNumber;
    private double average;

    public Student(String firstName, String LastName, int idNumber, double average) {
        super(firstName, LastName);
        this.idNumber = idNumber;
        this.average = average;
    }

    @Override
    public Person greater(Person ob) {
        if (ob instanceof Student student) {
            if (average > student.average) return this;
            return student;
        }
        return null;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    @Override
    public String toString() {
        return super.toString() + ", id number: " + idNumber + ", average: " + average;
    }


}
