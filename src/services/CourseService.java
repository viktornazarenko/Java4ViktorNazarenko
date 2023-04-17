package services;

import static repository.CourseRepo.courses;

public class CourseService {

    public static void printCourses(){

        for (int i = 0; i < courses.length; i++) {
            if (courses[i] != null){
                System.out.println(courses[i].getCourseId());
            }
        }

    }
}
