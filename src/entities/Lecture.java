package entities;

public class Lecture {

    private int id;

    public int courseId;

    public String courseName;

    public static int count = 0;


    public Lecture() {
        setId(id);
        courseId = Course.getCourseId();
        this.courseName = Course.getCourseName();
        count ++;
    }




    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
                "id=" + id +
                ", courseId=" + courseId +
                ", courseName='" + courseName + '\'' +
                '}';
    }
}
