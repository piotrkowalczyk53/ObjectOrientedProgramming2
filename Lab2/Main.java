package Lab2;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
class Main {
    public static void main(String[] args) {

        //set date to that requested by the user
        LocalDate date = LocalDate.now();
        if (args.length == 2) {
            date = LocalDate.now().withMonth(Integer.parseInt(args[1]));
        }
        if (args.length == 4) {
            date = LocalDate.of(Integer.parseInt(args[3]), Integer.parseInt(args[1]), 1);
        }

        //print name of the month & year
        System.out.printf("%13s", date.getMonth().getDisplayName(TextStyle.FULL_STANDALONE, Locale.forLanguageTag("pl")));
        System.out.println(" " + date.getYear());

        //print literals symbolising days of week
        for (int i = 1; i <= 7; i++) {
            System.out.print("  " + DayOfWeek.of(i).getDisplayName(TextStyle.NARROW_STANDALONE, Locale.forLanguageTag("pl")));
        }
        System.out.println();

        //print days of month in form of calendar page
        int length = date.lengthOfMonth();
        int today = date.getDayOfMonth();
        int position = date.withDayOfMonth(1).getDayOfWeek().getValue(); //gets numeric value of day of the week current moth started on
        for (int i = 1; i < position; i++) {
            System.out.print("   ");
        }
        for (int i = 1; i <= length; i++) {
            if (i == today && args.length == 0) {
                System.out.printf(" %d*", i);
            } else {
                System.out.printf("%3d", i);
            }
            if (position % 7 == 0) {
                System.out.println();
            }
            position++;
        }
    }
}