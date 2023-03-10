package entities;

public class Lecture {

    private int id;

    protected String courseName;

    protected static int count = 0;

    public Lecture (int id, String courseName) {
        this.id = id;
        this.courseName = courseName;
        count ++;
    }


}
