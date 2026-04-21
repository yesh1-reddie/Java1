package Day4;
import java.util.Scanner;
public class StringOperations {
	public static String performOperation(String input, int choice) {
        switch (choice) {
            case 1: // Add the String to itself
                return input + input;

            case 2: // Replace odd positions with #
                StringBuilder sb1 = new StringBuilder(input);
                for (int i = 0; i < sb1.length(); i++) {
                    if (i % 2 != 0) { // odd index
                        sb1.setCharAt(i, '#');
                    }
                }
                return sb1.toString();

            case 3: // Remove duplicate characters
                StringBuilder sb2 = new StringBuilder();
                for (int i = 0; i < input.length(); i++) {
                    char c = input.charAt(i);
                    if (sb2.indexOf(String.valueOf(c)) == -1) {
                        sb2.append(c);
                    }
                }
                return sb2.toString();

            case 4: // Change odd characters to uppercase
                StringBuilder sb3 = new StringBuilder(input);
                for (int i = 0; i < sb3.length(); i++) {
                    if (i % 2 != 0) {
                        sb3.setCharAt(i, Character.toUpperCase(sb3.charAt(i)));
                    }
                }
                return sb3.toString();

            default:
                return "Invalid choice!";
        }
    }
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take string input
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        System.out.println("Choose an operation from 1 to 4");
        int choice = sc.nextInt();

        // Perform operation and print result
        String result = performOperation(input, choice);
        System.out.println("Result: " + result);

        sc.close();
	}
}
