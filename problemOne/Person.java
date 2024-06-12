// Purpose: Person class that has a name

public class Person {
    protected String myName; // person's name
    protected int myAge; // person's age
    protected String myGender; // person's gender

    public Person(String name, int age, String gender) {
        this.myName = name; // initialize what's new to Person
        this.myAge = age; // initialize what's new to Person
        this.myGender = gender; // initialize what's new to Person
    }

    public int getMyAge() {
        return myAge; // return the age
    }

    public String getMyGender() {
        return myGender; // return the gender
    }

    public String getMyName() {
        return myName; // return the name
    }

    public void setMyAge(int myAge) {
        this.myAge = myAge; // set the age
    }

    public void setMyGender(String myGender) {
        this.myGender = myGender; // set the gender
    }

    public void setMyName(String myName) {
        this.myName = myName; // set the name
    }

    public String toString() {
        return "Name: " + myName + ", Age: " + myAge + ", Gender: " + myGender; // return the Person's information
    }

}