package entities;

public class Student {

    private int id;

    protected String firstName;
    protected String lastName;
    protected String dateOfBirth;
    protected String courseName;

    protected static int count = 0;

    public Student (int id, String firstName, String lastName, String dateOfBirth, String courseName){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.courseName = courseName;
        count++;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getCourseName() {
        return courseName;
    }

    public static int getCount() {
        return count;
    }
}
