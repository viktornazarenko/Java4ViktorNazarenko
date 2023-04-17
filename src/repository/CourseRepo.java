package repository;

import entities.Course;

import java.util.Arrays;

public class CourseRepo {

    public static Course[] courses;

    public static void createCourseRepo(final int length) {
        if (courses != null && courses.length > 0){
            return;
        }
        courses = new Course[length];
    }

    public static void change(Course course, int index){
        if (courses != null && courses.length > index){
            if (courses[index] != null){
                System.out.println("Element already exists.");
                return;
            }
            courses[index] = course;
        }
    }


    private static int i = 0;

    public static void add(Course course){
        Course[] courses1 = Arrays.copyOf(courses, (courses.length*3)/2 + 1);
        courses = courses1;
        courses[i] = course;
        i++;
    }
}
