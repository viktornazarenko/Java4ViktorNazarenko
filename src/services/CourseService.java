package services;

import static repository.CourseRepo.getCourses;

public class CourseService {

    public static void printCourses(){

        for (int i = 0; i < getCourses().length; i++) {
            if (getCourses()[i] != null){
                System.out.println(getCourses()[i].getId());
            }
        }

    }
}
