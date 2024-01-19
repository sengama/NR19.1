public class Person {

    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) throws InvalidNameException, InvalidAgeException {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;

        if (firstName == null || firstName.isEmpty()) {
            throw new InvalidNameException("First name cannot be null or empty.");
        }

        if (lastName == null || lastName.isEmpty()) {
            throw new InvalidNameException("Last name cannot be null or empty.");
        }

        if (age < 0 || age > 150) {
            throw new InvalidAgeException("Age must be between 0 and 150.");
        }
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}