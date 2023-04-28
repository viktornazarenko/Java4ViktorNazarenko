package services;

import entities.AdditionalInformation;

import static repository.AdditionalInformationRepo.getAdditionalInformations;

public class AdditionalInformationService extends AdditionalInformation {


    public AdditionalInformationService(int id, String additionalInformation) {
        super(id, additionalInformation);
    }

    public static void printAdditionalInformations(){

        for (int i = 0; i < getAdditionalInformations().length; i++) {
            if (getAdditionalInformations()[i] != null){
                System.out.println(getAdditionalInformations()[i].getId());
            }
        }

    }
}
