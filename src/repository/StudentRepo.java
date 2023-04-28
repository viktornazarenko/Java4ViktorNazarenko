package repository;

import entities.Student;
import java.util.Arrays;

public class StudentRepo {

    private static Student[] students;

    public static Student[] getStudents() {
        return students;
    }

    public static void createStudentRepo(final int length) {
        if (students != null && students.length > 0){
            return;
        }
        students = new Student[length];
    }

    public static void change(Student student, int index){
        if (students != null && students.length > index){
            if (students[index] != null){
                System.out.println("Element already exists.");
                return;
            }
            students[index] = student;
        }
    }


    private static int i = 0;

    public static void add(Student student){
        Student[] students1 = Arrays.copyOf(students, (students.length*3)/2 + 1);
        students = students1;
        students[i] = student;
        i++;
    }
}
