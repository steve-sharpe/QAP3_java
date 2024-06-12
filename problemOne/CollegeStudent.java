// Purpose: This class is a subclass of Student and represents a CollegeStudent object. It has a major field of study and a year of study.

public class CollegeStudent extends Student {
  protected String major; // major field of study
  protected int year; // year of study

  public CollegeStudent(String myName, int myAge, String myGender, String myIdNum, double d, int year, String major) {
    super(myName, myAge, myGender, myIdNum, d); // use the super class' constructor
    this.major = major; // initialize what's new to CollegeStudent
    this.year = year; // initialize what's new to CollegeStudent
  }

  public String getMajor() {
    return major; // return the major
  }

  public void setMajor(String major) {
    this.major = major; // set the major
  }

  public int getYear() {
    return year; // return the year
  }

  public void setYear(int year) {
    this.year = year; // set the year
  }

  @Override
  public String toString() {
    return "CollegeStudent: \n" + super.toString() + ", Major: " + major + ", Year: " + year; // return the
                                                                                              // CollegeStudent's
                                                                                              // information
  }
}