package Day5;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
public class DiffBetweenDates {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first date (YYYY-MM-DD): ");
        LocalDate date1 = LocalDate.parse(sc.nextLine());

        System.out.print("Enter second date (YYYY-MM-DD): ");
        LocalDate date2 = LocalDate.parse(sc.nextLine());

        Period diff = Period.between(date1, date2);

        System.out.println("Duration: " + diff.getYears() + " years, "
                + diff.getMonths() + " months, "
                + diff.getDays() + " days");
    }
}
