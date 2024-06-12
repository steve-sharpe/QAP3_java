// Purpose: This class is a subclass of Person and represents a teacher. It has a subject and salary.

public class Teacher extends Person {
    protected String subject; // teacher's subject
    protected double salary; // teacher's salary

    public Teacher(String myName, int age, String myGender, String subject, double salary) {
        super(myName, age, myGender); // use the super class' constructor
        this.subject = subject; // initialize what's new to Teacher
        this.salary = salary; // initialize what's new to Teacher
    }

    public String getSubject() {
        return subject; // return the subject
    }

    public void setSubject(String subject) {
        this.subject = subject; // set the subject
    }

    public double getSalary() {
        return salary; // return the salary
    }

    public void setSalary(double salary) {
        this.salary = salary; // set the salary
    }

    @Override
    public String toString() {
        return super.toString() + ", Salary: " + salary + ", Subject: " + subject; // return the Teacher's information
    }
}