package entities;

public class Course {

    private int courseId;

    private String courseName;

    private String teacherName;

    private String studentName;

    public Course(int courseId, String courseName) {
        this.setCourseId(courseId);
        this.setCourseName(courseName);
        this.setTeacherName(teacherName);
        this.setStudentName(studentName);
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

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
}
