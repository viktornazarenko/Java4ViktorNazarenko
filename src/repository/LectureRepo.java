package repository;

import entities.Lecture;

public class LectureRepo extends RepoSuper {

    private static Lecture[] lectures;


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

}
