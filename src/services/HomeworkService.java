package services;

import entities.Homework;

import static repository.HomeworkRepo.getHomeworks;

public class HomeworkService extends Homework {


    public HomeworkService(int id, String homework) {
        super(id, homework);
    }

    public static void printHomeworks(){

        for (int i = 0; i < getHomeworks().length; i++) {
            if (getHomeworks()[i] != null){
                System.out.println(getHomeworks()[i].getId());
            }
        }

    }
}
