import entities.Course;
import entities.Lecture;

import static entities.Lecture.count;

public class Main {
    public static void main(String[] args) {
        Course course1 = new Course(1,"Math");
        Course course2 = new Course(2,"English");
        Course course3 = new Course(3,"Science");

        Lecture lecture1 = new Lecture(1,1);
        Lecture lecture2 = new Lecture(2,1);
        Lecture lecture3 = new Lecture(3,2);
        Lecture lecture4 = new Lecture(4,2);
        Lecture lecture5 = new Lecture(5,3);
        Lecture lecture6 = new Lecture(6,3);

        System.out.println(lecture6.courseId);
        System.out.println(count);
    }


}
