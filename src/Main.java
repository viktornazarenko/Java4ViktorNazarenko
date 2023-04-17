import entities.Course;
import entities.Lecture;
import services.LectureService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Course course1 = new Course(1, "Math");

        LectureService.createLectureSilent(1, "Math");
        LectureService.createLectureSilent(1, "Math");
        LectureService.createLectureSilent(1, "Math");

        System.out.println("Please input a number to select a category:");
        System.out.println("1. Course");
        System.out.println("2. Teachers");
        System.out.println("3. Students");
        System.out.println("4. Lectures");
        System.out.println("5. Exit");


        Scanner scanner = new Scanner(System.in);

        while(!scanner.hasNextInt()){
            System.out.println("Please input a number");
            System.out.println("1. Course");
            System.out.println("2. Teachers");
            System.out.println("3. Students");
            System.out.println("4. Lectures");
            System.out.println("5. Exit");
            scanner.next();
        }

        int choice = scanner.nextInt();

        if (choice == 5){
            System.exit(0);
        }


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
            System.out.println("Please input a number to select a category:");
            System.out.println("1. Print lectures");
            System.out.println("2. Create lectures");
            System.out.println("3. Exit");

            Scanner scanner1 = new Scanner(System.in);

            while(!scanner1.hasNextInt()){
                System.out.println("Please input a number");
                System.out.println("1. Print lectures");
                System.out.println("2. Create lectures");
                System.out.println("3. Exit");
                scanner1.next();
            }

            int lectureChoice = scanner1.nextInt();

            String lectureAnswer = switch (lectureChoice) {
                case 1:
                    yield "You have selected Print lectures.";
                case 2:
                    yield "You have selected Create lectures.";
                case 3:
                    yield "You have selected Exit.";
                default:
                    yield "Wrong input.";
            };

            System.out.println(lectureAnswer);

            if (lectureChoice == 1) {
                LectureService.printLectures();
                System.exit(0);
            }

            if (lectureChoice == 2) {

                System.out.println("Create a lecture? Type in Y or N");
                Scanner scanner2 = new Scanner(System.in);
                String createLectureAnswer = scanner2.nextLine();
                if (createLectureAnswer.equals("N") || createLectureAnswer.equals("n")){
                    System.exit(0);
                }


                while (createLectureAnswer.equals("Y") || createLectureAnswer.equals("y")) {

                    LectureService.createLecture();

                    if(Lecture.getCount() >= 8){
                        System.exit(0);
                    }

                    System.out.println("Create another lecture? Type in Y or N");
                    Scanner scanner3 = new Scanner(System.in);
                    createLectureAnswer = scanner3.nextLine();


                    if(createLectureAnswer.equals("N") || createLectureAnswer.equals("n")){
                        System.out.println("Print all lectures? Type in Y or N");
                        String printLectureAnswer = scanner3.nextLine();

                        if (printLectureAnswer.equals("Y") || printLectureAnswer.equals("y")){
                            LectureService.printLectures();
                            System.exit(0);
                        }

                    }

                }



            }

            if (lectureChoice == 3) {
                System.exit(0);
            }

        }

        do {
            if (choice < 1 || choice > 5){
                System.out.println("1. Course");
                System.out.println("2. Teachers");
                System.out.println("3. Students");
                System.out.println("4. Lectures");
                System.out.println("5. Exit");
                while(!scanner.hasNextInt()){
                    System.out.println("Please input a number");
                    scanner.next();
                }
            }

            choice = scanner.nextInt();

            if (choice == 5){
                System.exit(0);
            }
        } while (choice < 1 || choice > 5);


    }


}
