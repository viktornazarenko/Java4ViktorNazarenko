package entities;

public class Homework {

    private int id;

    protected String homework;

    protected static int count = 0;

    public Homework (int id, String homework) {
        this.id = id;
        this.homework = homework;
        count ++;
    }

    public int getId() {
        return id;
    }

    public String getHomework() {
        return homework;
    }
}
