package repository;

import entities.Teacher;

import java.util.Arrays;

public class TeacherRepo {

    private static Teacher[] teachers;

    public static Teacher[] getTeachers() {
        return teachers;
    }

    public static void createTeacherRepo(final int length) {
        if (teachers != null && teachers.length > 0){
            return;
        }
        teachers = new Teacher[length];
    }

    public static void change(Teacher teacher, int index){
        if (teachers != null && teachers.length > index){
            if (teachers[index] != null){
                System.out.println("Element already exists.");
                return;
            }
            teachers[index] = teacher;
        }
    }


    private static int i = 0;

    public static void add(Teacher teacher){
        Teacher[] teachers1 = Arrays.copyOf(teachers, (teachers.length*3)/2 + 1);
        teachers = teachers1;
        teachers[i] = teacher;
        i++;
    }
}
