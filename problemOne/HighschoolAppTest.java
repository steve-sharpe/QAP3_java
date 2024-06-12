// Purpose: Test the Person, Student, Teacher, and CollegeStudent classes

public class HighschoolAppTest {
    public static void main(String[] args) {
        Person frank = new Person("Frank Grimes", 27, "M"); // create a new Person object
        System.out.println(frank); // print the Person object

        Student moe = new Student("Moe Syslak", 50, "M", "HS95129", 1.5);
        System.out.println(moe);

        Teacher coop = new Teacher("Mr Cooper", 35, "F", "Gym", 50000);
        System.out.println(coop);

        CollegeStudent jake = new CollegeStudent("Jake", 35, "M", "1", 4.0, 3, "Science");
        System.out.println(jake);
    }
}