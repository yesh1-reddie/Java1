package Day2;
import java.util.Scanner;

enum Gender {
	M, F
}
public class Person {
	private String firstName;
	private String lastName;
	private static Gender gender;
	private String phone;
	
	public Person() {
	}
	
	public Person(String firstName, String lastName, Gender gender, String phone) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.phone = phone;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Gender setGender() {
		return gender;
	}
	public void getGender(char ender) {
		this.gender = gender;
	}
	public String setPhone() {
		return phone;
	}
	public void getPhone() {
		this.phone = phone;
	}
	public void display() {
		System.out.println("Person Details: ");
		System.out.println("Name: "+ firstName + " " + lastName);
		System.out.println("Gender: " +gender);
		System.out.println("Phone: " + phone);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String firstName = sc.next();
		String lastName = sc.next();
		String g = sc.next();
		if (g.equals("M")) {
			gender= Gender.M;
		} else if (g.equals("F")) {
			gender= Gender.F;
		}
		
		String phone = sc.next();
		
		
		Person p = new Person(firstName, lastName, gender, phone);
		
		p.display();
	}
}
