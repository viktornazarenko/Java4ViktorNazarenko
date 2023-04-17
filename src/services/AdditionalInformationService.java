package services;

import entities.AdditionalInformation;

import static repository.AdditionalInformationRepo.additionalInformations;

public class AdditionalInformationService extends AdditionalInformation {


    public AdditionalInformationService(int id, String additionalInformation) {
        super(id, additionalInformation);
    }

    public static void printAdditionalInformations(){

        for (int i = 0; i < additionalInformations.length; i++) {
            if (additionalInformations[i] != null){
                System.out.println(additionalInformations[i].getId());
            }
        }

    }
}
