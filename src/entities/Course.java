package entities;

public class Course {

    private static int courseId;

    public static String courseName;

    public String teacherName;

    public String studentName;

    public Course(int courseId, String courseName) {
        Course.setCourseId(courseId);
        Course.setCourseName(courseName);
        this.teacherName = teacherName;
        this.studentName = studentName;
    }

    public static int getCourseId() {
        return courseId;
    }

    public static void setCourseId(int courseId) {
        Course.courseId = Course.courseId;
    }

    public static String getCourseName() {
        return courseName;
    }

    public static void setCourseName(String courseName) {
        Course.courseName = courseName;
    }
}
