package repository;

import entities.Lecture;

import java.util.Arrays;

public class LectureRepo {

    public static Lecture[] lectures;

    public static void createLectureRepo(final int length) {
        if (lectures != null && lectures.length > 0){
            return;
        }
        lectures = new Lecture[length];
    }

    public static void change(Lecture lecture, int index){
        if (lectures != null && lectures.length > index){
            if (lectures[index] != null){
                System.out.println("Element already exists.");
                return;
            }
            lectures[index] = lecture;
        }
    }


    private static int i = 0;

    public static void add(Lecture lecture){
        Lecture[] lectures1 = Arrays.copyOf(lectures, (lectures.length*3)/2 + 1);
        lectures = lectures1;
        lectures[i] = lecture;
        i++;
    }
}
