package Day1;
import java.util.Scanner;
public class PositiveNegative {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

	    int number = sc.nextInt();

	        // Check if positive, negative, or zero
	    if (number > 0) {
	    	System.out.println(number + " is Positive.");
	    } else if (number < 0) {
	        System.out.println(number + " is Negative.");
	    } else {
	        System.out.println("The number is Zero.");
	    }

	    sc.close();
	}

}
