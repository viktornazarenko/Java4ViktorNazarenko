package services;

import entities.Homework;

import static repository.AdditionalInformationRepo.additionalInformations;
import static repository.HomeworkRepo.homeworks;

public class HomeworkService extends Homework {


    public HomeworkService(int id, String homework) {
        super(id, homework);
    }

    public static void printHomeworks(){

        for (int i = 0; i < homeworks.length; i++) {
            if (homeworks[i] != null){
                System.out.println(homeworks[i].getId());
            }
        }

    }
}
