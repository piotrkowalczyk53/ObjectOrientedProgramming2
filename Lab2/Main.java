import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

class Main
{
    public static void main(String[] args)
    {
        System.out.print("  " + LocalDate.now().getMonth().getDisplayName(TextStyle.FULL, new Locale("pl")) + " ");
        System.out.println(LocalDate.now().getYear());
        for (int i = 1; i <= 7; i++)
        {
            System.out.print("  " + DayOfWeek.of(i).getDisplayName(TextStyle.NARROW_STANDALONE, new Locale("pl")));
        }
        System.out.println();
        int length = LocalDate.now().getMonth().length(false);
        int today = LocalDate.now().getDayOfMonth();
        int start = LocalDate.now().minusDays(today).getDayOfWeek().getValue() + 1;
        int temp = start;
        for (int i = 1; i < start; i++)
        {
            System.out.print("   ");
        }
        for (int i = 1; i < length; i++)
        {
            if (i == today)
            {
                System.out.printf(" %d*", i);
            }
            else
            {
                System.out.printf("%3d", i);
            }
            if (temp % 7 == 0)
            {
                System.out.println();
            }
            temp++;
        }
    }
}