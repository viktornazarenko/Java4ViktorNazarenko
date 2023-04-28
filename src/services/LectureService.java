package services;

import entities.Lecture;
import repository.LectureRepo;

import java.util.Scanner;

public class LectureService extends LectureRepo {

    static int id = 0;

    public static void createLecture() {
        LectureRepo.create(1);
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
        System.out.println("The number of created lectures is " + Lecture.getCount());
    }

    public static void createLecture(int courseId) {
        LectureRepo.create(1);
        Lecture lecture = new Lecture();
        System.out.println("Please input lecture ID number");
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();
        lecture.setId(id);
        lecture.setCourseId(courseId);
        System.out.println(lecture);
        LectureRepo.add(lecture);
        System.out.println("The number of created lectures is " + Lecture.getCount());
    }

    public static void createLecture(int courseId, String courseName) {
        LectureRepo.create(1);
        Lecture lecture = new Lecture();
        System.out.println("Please input lecture ID number");
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();
        lecture.setId(id);
        lecture.setCourseId(courseId);
        lecture.setCourseName(courseName);
        System.out.println(lecture);
        LectureRepo.add(lecture);
        System.out.println("The number of created lectures is " + Lecture.getCount());
    }

    public static void createLectureSilent(int courseId, String courseName) {
        LectureRepo.create(1);
        Lecture lecture = new Lecture();
        lecture.setId(id);
        lecture.setCourseId(courseId);
        lecture.setCourseName(courseName);
        LectureRepo.add(lecture);
        id++;
    }

    public static void printLectures(){

        for (int i = 0; i < getAll().length; i++) {
            if (getAll()[i] != null){
                System.out.println(getAll()[i].getId());
            }
        }

    }
}
