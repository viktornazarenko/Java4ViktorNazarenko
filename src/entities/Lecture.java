package entities;

public class Lecture extends EntitySuper {

    private int courseId;

    private String courseName;


    private static int count = 0;


    public Lecture() {
        setCourseId(courseId);
        setCourseName(courseName);
        count ++;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
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

    @Override
    public String toString() {
        return "Lecture{" +
                "id=" + getId() +
                ", courseId=" + courseId +
                ", courseName='" + courseName + '\'' +
                '}';
    }
}
