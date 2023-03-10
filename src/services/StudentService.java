package services;

import entities.Student;

public class StudentService extends Student {

    public StudentService(int id, String firstName, String lastName, String dateOfBirth, String courseName) {
        super(id, firstName, lastName, dateOfBirth, courseName);
    }
}
