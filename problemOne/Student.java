// Purpose: This class is a subclass of Person and represents a student. 

public class Student extends Person {
    protected String myIdNum; // student ID number
    protected double myGPA; // student GPA

    public Student(String name, int age, String gender, String idNum, double gpa) {

        super(name, age, gender); // use the super class' constructor

        myIdNum = idNum; // initialize what's new to Student
        myGPA = gpa; // initialize what's new to Student
    }

    public String getMyIdNum() {
        return myIdNum; // return the id number
    }

    public void setMyIdNum(String myIdNum) {
        this.myIdNum = myIdNum; // set the id number
    }

    public double getMyGPA() {
        return myGPA; // return the GPA
    }

    public void setMyGPA(double myGPA) {
        this.myGPA = myGPA; // set the GPA

    }

    @Override
    public String toString() {
        return super.toString() + ", GPA: " + myGPA + ", Id Number: " + myIdNum; // return the Student's information
    }
}
