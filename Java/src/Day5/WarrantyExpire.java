package Day5;
import java.time.LocalDate;
import java.util.Scanner;
public class WarrantyExpire {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter purchase date (YYYY-MM-DD): ");
        LocalDate purchaseDate = LocalDate.parse(sc.nextLine());

        System.out.print("Enter warranty period in years: ");
        int years = sc.nextInt();

        System.out.print("Enter warranty period in months: ");
        int months = sc.nextInt();

        LocalDate expiryDate = purchaseDate.plusYears(years).plusMonths(months);

        System.out.println("Warranty expires on: " + expiryDate);
    }
}
