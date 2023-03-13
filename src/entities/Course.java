package entities;

public class Course {

    static public int courseId;

    static public String courseName;

    public Course(int courseId, String courseName) {
        Course.courseId = courseId;
        Course.courseName = courseName;
    }
}
