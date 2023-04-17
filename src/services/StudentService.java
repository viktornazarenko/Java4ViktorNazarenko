package services;

import entities.Student;

import static repository.AdditionalInformationRepo.additionalInformations;
import static repository.StudentRepo.students;

public class StudentService extends Student {

    public StudentService(int id, String firstName, String lastName, String dateOfBirth, String courseName) {
        super(id, firstName, lastName, dateOfBirth, courseName);
    }

    public static void printStudents(){

        for (int i = 0; i < students.length; i++) {
            if (students[i] != null){
                System.out.println(students[i].getId());
            }
        }

    }
}
