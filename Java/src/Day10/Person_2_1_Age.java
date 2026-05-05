package Day10;
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}
public class Person_2_1_Age {
	private String name;
    private int age;

    public Person_2_1_Age(String name, int age) throws InvalidAgeException {
        if (age <= 15) {
            throw new InvalidAgeException("Age must be above 15!");
        }
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person [Name=" + name + ", Age=" + age + "]";
    }

    public static void main(String[] args) {
        try {
            Person_2_1_Age p1 = new Person_2_1_Age("Smith", 30);
            System.out.println(p1);

            Person_2_1_Age p2 = new Person_2_1_Age("Kathy", 12); // will throw exception
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
