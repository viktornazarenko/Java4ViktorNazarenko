package repository;

import entities.Homework;

import java.util.Arrays;

public class HomeworkRepo {

    public static Homework[] homeworks;

    public static void createHomeworkRepo(final int length) {
        if (homeworks != null && homeworks.length > 0){
            return;
        }
        homeworks = new Homework[length];
    }

    public static void change(Homework homework, int index){
        if (homeworks != null && homeworks.length > index){
            if (homeworks[index] != null){
                System.out.println("Element already exists.");
                return;
            }
            homeworks[index] = homework;
        }
    }


    private static int i = 0;

    public static void add(Homework homework){
        Homework[] homeworks1 = Arrays.copyOf(homeworks, (homeworks.length*3)/2 + 1);
        homeworks = homeworks1;
        homeworks[i] = homework;
        i++;
    }
}
