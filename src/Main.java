public class Main {

    public static void main(String[] args) {
        try {
            Person person1 = new Person("John", "Doe", 100);
            System.out.println(person1.getFirstName() + " " + person1.getLastName() + " " + person1.getAge());

            Person person2 = new Person("Iura", "Sara", 151);
            System.out.println(person2.getFirstName() + " " + person2.getLastName() + " " + person2.getAge());
        } catch (InvalidNameException e ) {
            System.out.println(e.getMessage());
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}