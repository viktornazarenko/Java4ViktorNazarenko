import entities.Course;
import entities.Lecture;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Course course1 = new Course(1, "Math");
        Course course2 = new Course(2, "English");
        Course course3 = new Course(3, "Science");

        /*Lecture lecture1 = new Lecture(1,1);
        Lecture lecture2 = new Lecture(2,1);
        Lecture lecture3 = new Lecture(3,2);
        Lecture lecture4 = new Lecture(4,2);
        Lecture lecture5 = new Lecture(5,3);
        Lecture lecture6 = new Lecture(6,3);*/

//        System.out.println(lecture6.courseId);
//        System.out.println(count);

        System.out.println("Please input a number to select a category:");
        System.out.println("1. Course");
        System.out.println("2. Teachers");
        System.out.println("3. Students");
        System.out.println("4. Lectures");
        System.out.println("5. Exit");


        Scanner scanner = new Scanner(System.in);

        while(!scanner.hasNextInt()){
            System.out.println("Please input a number");
            scanner.next();
        }

        int choice = scanner.nextInt();



        do {

            if (choice < 1 || choice > 5){
                System.out.println("1. Course");
                System.out.println("2. Teachers");
                System.out.println("3. Students");
                System.out.println("4. Lectures");
                System.out.println("5. Exit");
            }

            if (choice == 5){
                System.exit(0);
            }
        } while (choice < 1 || choice > 5);


        String answer = switch (choice) {
            case 1:
                yield "You have selected Course.";
            case 2:
                yield "You have selected Teachers.";
            case 3:
                yield "You have selected Students.";
            case 4:
                yield "You have selected Lectures.";
            default:
                yield "Wrong input.";
        };

        System.out.println(answer);

        if (choice == 4) {
            System.out.println("Create a lecture? Type in Y or N");
            Scanner scanner1 = new Scanner(System.in);
            String createLectureAnswer = scanner1.nextLine();

            while (createLectureAnswer.equals("Y") || createLectureAnswer.equals("y")) {

                services.LectureService.CreateLecture();

                if(Lecture.getCount() >= 8){
                    System.exit(0);
                }

                System.out.println("Create another lecture? Type in Y or N");
                createLectureAnswer = scanner1.nextLine();

                if(createLectureAnswer.equals("N") || createLectureAnswer.equals("n")){
                    System.exit(0);
                }

            }
        }


    }


}
