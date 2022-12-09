package Lab7.pl.edu.agh.fis;

import java.time.LocalDate;

public class Graduate extends Student{

    private LocalDate graduationDate;
    public Graduate(String firstName, String lastName, int idNumber, double average, LocalDate graduationDate)
    {
        super(firstName, lastName, idNumber, average);
        this.graduationDate = graduationDate;
    }

    public LocalDate getGraduationDate() {
        return graduationDate;
    }

    @Override
    public String toString() {
        return super.toString() + ", graduation date: " + graduationDate;
    }
}
