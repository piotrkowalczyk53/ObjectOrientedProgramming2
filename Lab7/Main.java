package Lab7;

import Lab7.pl.edu.agh.fis.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Person[] tab = new Person[3];
        tab[0] = new Student("Ala", "Nowacka", 406648, 3.7);
        tab[1] = new Graduate("Ela", "Kowalska", 236719, 4.1, LocalDate.now());
        tab[2] = new Dean("doktor", "Pawel", "Kowalczyk", 2012, 2018);

        for (Person temp:tab) {
            System.out.println(temp);
        }
    }
}
