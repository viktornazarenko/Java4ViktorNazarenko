package services;

import entities.Lecture;

import java.util.Scanner;

public class LectureService extends Lecture {

    public static void CreateLecture() {
        Lecture lecture = new Lecture();
        System.out.println("Please input lecture ID number");
        Scanner scanner = new Scanner(System.in);
        int id =  scanner.nextInt();
        lecture.setId(id);
        System.out.println("Please input Course ID");
        int courseId = scanner.nextInt();
        lecture.setCourseId(courseId);
        System.out.println(lecture);
        System.out.println("The number of created lectures is " + count);
    }
}
