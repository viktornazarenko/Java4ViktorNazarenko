package entities;

public class Course extends EntitySuper {

    private String courseName;

    private String teacherName;

    private String studentName;

    public Course(int id, String courseName) {
        super(id);
        this.setCourseName(courseName);
        this.setTeacherName(teacherName);
        this.setStudentName(studentName);
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
