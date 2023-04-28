package entities;

public class Teacher extends EntitySuper{

    private String firstName;
    private String lastName;
    private String courseName;

    private static int count = 0;

    public Teacher(int id, String firstName, String lastName, String courseName) {
        super(id);
        this.firstName = firstName;
        this.lastName = lastName;
        this.courseName = courseName;
        count++;
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

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public static int getCount() {
        return count;
    }

}
