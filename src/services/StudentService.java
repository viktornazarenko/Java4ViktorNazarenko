package services;

import entities.Student;

import static repository.StudentRepo.getStudents;

public class StudentService extends Student {

    public StudentService(int id, String firstName, String lastName, String dateOfBirth, String courseName) {
        super(id, firstName, lastName, dateOfBirth, courseName);
    }

    public static void printStudents(){

        for (int i = 0; i < getStudents().length; i++) {
            if (getStudents()[i] != null){
                System.out.println(getStudents()[i].getId());
            }
        }

    }
}
