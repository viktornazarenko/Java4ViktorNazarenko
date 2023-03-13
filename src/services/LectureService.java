package services;

import entities.Lecture;

public class LectureService extends Lecture {

    public LectureService(int id, String courseName) {
        super(id, courseName);
    }

    public static void main(String[] args) {
        entities.Lecture lecture1 = new Lecture(1, "Math");
        entities.Lecture lecture2 = new Lecture(2, "English");
        entities.Lecture lecture3 = new Lecture(3, "Music");
        entities.Lecture lecture4 = new Lecture(4, "Chinese");
        System.out.println(count);
    }

}
