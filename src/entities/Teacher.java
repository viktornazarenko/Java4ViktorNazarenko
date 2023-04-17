package entities;

public class Teacher {

    private int id;
    protected String firstName;
    protected String lastName;
    protected String courseName;

    protected static int count = 0;

    public Teacher(int id, String firstName, String lastName, String courseName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
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

    public String getCourseName() {
        return courseName;
    }

    public static int getCount() {
        return count;
    }
}
