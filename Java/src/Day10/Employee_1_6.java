package Day10;
class InvalidNameException extends Exception {
    public InvalidNameException(String message) {
        super(message);
    }
}
public class Employee_1_6 {
	private String firstName;
    private String lastName;

    public Employee_1_6(String firstName, String lastName) throws InvalidNameException {
        if (firstName == null || firstName.trim().isEmpty() ||
            lastName == null || lastName.trim().isEmpty()) {
            throw new InvalidNameException("First name and last name cannot be blank!");
        }
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public static void main(String[] args) {
        try {
            Employee_1_6 emp = new Employee_1_6("Divya", "Bharathi");
            System.out.println("Employee Full Name: " + emp.getFullName());

            Employee_1_6 emp2 = new Employee_1_6("", ""); // will throw exception
        } catch (InvalidNameException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
