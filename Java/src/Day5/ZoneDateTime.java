package Day5;
import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.util.Scanner;
public class ZoneDateTime {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Zone ID (e.g., America/New_York): ");
        String zoneInput = sc.nextLine();

        ZoneId zone = ZoneId.of(zoneInput);
        ZonedDateTime zonedDateTime = ZonedDateTime.now(zone);

        System.out.println("Current date and time in " + zoneInput + ": " + zonedDateTime);
    }
}
