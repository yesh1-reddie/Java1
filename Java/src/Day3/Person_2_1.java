package Day3;

public class Person_2_1 {
	private String name;
    private float age;
    
    public Person_2_1(String name, float age) {
        this.name = name;
        this.age = age;
    }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public float getAge() { return age; }
    public void setAge(float age) { this.age = age; }
    @Override
    public String toString() {
        return "Person_2_1 [Name=" + name + ", Age=" + age + "]";
    }
}
