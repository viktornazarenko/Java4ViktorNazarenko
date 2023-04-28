package entities;

public class Homework extends EntitySuper {



    private String homework;

    private static int count = 0;

    public Homework (int id, String homework) {
        super(id);
        this.homework = homework;
        count ++;
    }

    public String getHomework() {
        return homework;
    }

    public void setHomework(String homework) {
        this.homework = homework;
    }

    public static int getCount() {
        return count;
    }
}
