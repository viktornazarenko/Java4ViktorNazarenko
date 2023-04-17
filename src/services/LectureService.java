package services;

import entities.Lecture;
import repository.LectureRepo;

import java.util.Scanner;

import static repository.LectureRepo.lectures;

public class LectureService extends Lecture {

    static int id = 0;

    public static void createLecture() {
        LectureRepo.createLectureRepo(1);
        Lecture lecture = new Lecture();
        System.out.println("Please input lecture ID number");
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();
        lecture.setId(id);
        System.out.println("Please input Course ID");
        int courseId = scanner.nextInt();
        lecture.setCourseId(courseId);
        System.out.println(lecture);
        LectureRepo.add(lecture);
        System.out.println("The number of created lectures is " + count);
    }

    public static void createLecture(int courseId) {
        LectureRepo.createLectureRepo(1);
        Lecture lecture = new Lecture();
        System.out.println("Please input lecture ID number");
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();
        lecture.setId(id);
        lecture.setCourseId(courseId);
        System.out.println(lecture);
        LectureRepo.add(lecture);
        System.out.println("The number of created lectures is " + count);
    }

    public static void createLecture(int courseId, String courseName) {
        LectureRepo.createLectureRepo(1);
        Lecture lecture = new Lecture();
        System.out.println("Please input lecture ID number");
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();
        lecture.setId(id);
        lecture.setCourseId(courseId);
        lecture.setCourseName(courseName);
        System.out.println(lecture);
        LectureRepo.add(lecture);
        System.out.println("The number of created lectures is " + count);
    }

    public static void createLectureSilent(int courseId, String courseName) {
        LectureRepo.createLectureRepo(1);
        Lecture lecture = new Lecture();
        lecture.setId(id);
        lecture.setCourseId(courseId);
        lecture.setCourseName(courseName);
        LectureRepo.add(lecture);
        id++;
    }

    public static void printLectures(){

        for (int i = 0; i < lectures.length; i++) {
            if (lectures[i] != null){
                System.out.println(lectures[i].getId());
            }
        }

    }
}
