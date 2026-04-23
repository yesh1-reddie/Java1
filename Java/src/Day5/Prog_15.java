package Day5;
import java.time.LocalDate;
import java.time.Period;
public class Prog_15 {
	private String firstName;
    private String lastName;
    private char gender;
    private LocalDate dateOfBirth;

    public Prog_15() {}


    public Prog_15(String firstName, String lastName, char gender, LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
    }
        public String getFirstName() { return firstName; }
        public void setFirstName(String firstName) { this.firstName = firstName; }

        public String getLastName() { return lastName; }
        public void setLastName(String lastName) { this.lastName = lastName; }

        public char getGender() { return gender; }
        public void setGender(char gender) { this.gender = gender; }

        public LocalDate getDateOfBirth() { return dateOfBirth; }
        public void setDateOfBirth(LocalDate dateOfBirth) { this.dateOfBirth = dateOfBirth; }
        

        public int calculateAge() {
            LocalDate currentDate = LocalDate.now();
            return Period.between(dateOfBirth, currentDate).getYears();
        }
        
        public String getFullName() {
            return firstName + " " + lastName;
        }

        public void displayDetails() {
            System.out.println("Person Details:");
            System.out.println("_____________");
            System.out.println("First Name: " + firstName);
            System.out.println("Last Name: " + lastName);
            System.out.println("Gender: " + gender);
            System.out.println("Age: " + calculateAge());
            System.out.println("Full Name: " + getFullName());
        }
        
}

