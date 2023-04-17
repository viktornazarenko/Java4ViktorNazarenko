package services;

import entities.Teacher;

import static repository.AdditionalInformationRepo.additionalInformations;
import static repository.TeacherRepo.teachers;

public class TeacherService extends Teacher {

    public TeacherService(int id, String firstName, String lastName, String courseName) {
        super(id, firstName, lastName, courseName);
    }

    public static void printTeachers(){

        for (int i = 0; i < teachers.length; i++) {
            if (teachers[i] != null){
                System.out.println(teachers[i].getId());
            }
        }

    }
}
