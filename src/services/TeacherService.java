package services;

import entities.Teacher;

import static repository.TeacherRepo.getTeachers;

public class TeacherService extends Teacher {

    public TeacherService(int id, String firstName, String lastName, String courseName) {
        super(id, firstName, lastName, courseName);
    }

    public static void printTeachers(){

        for (int i = 0; i < getTeachers().length; i++) {
            if (getTeachers()[i] != null){
                System.out.println(getTeachers()[i].getId());
            }
        }

    }
}
