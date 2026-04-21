package Day1;
import java.util.Scanner;
public class PersonDetails {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String firstName = sc.nextLine();
		String lastName = sc.nextLine();
		char gender = sc.next().charAt(0);
		int age = sc.nextInt();
		double weight = sc.nextDouble();
		
		System.out.println("Person Details: ");
		System.out.println("-----------------------");
		System.out.println("First Name: "+firstName);
		System.out.println("Last Name: "+ lastName);
		System.out.println("Gender: "+gender);
		System.out.println("Age: "+age);
		System.out.println("Weight: "+weight);
		
		sc.close();
	}

}
