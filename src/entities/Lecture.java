package entities;

public class Lecture {

    private int id;

    public int courseId;

    public String courseName;

    public static int count = 0;


    public Lecture(int id, int courseId) {
        this.id = id;
        this.courseId = Course.courseId;
        this.courseName = Course.courseName;
        count ++;
    }

}
