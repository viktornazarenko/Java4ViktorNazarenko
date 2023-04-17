package repository;

import entities.AdditionalInformation;

import java.util.Arrays;

public class AdditionalInformationRepo {

    public static AdditionalInformation[] additionalInformations;

    public static void createAdditionalInformationRepo(final int length) {
        if (additionalInformations != null && additionalInformations.length > 0){
            return;
        }
        additionalInformations = new AdditionalInformation[length];
    }

    public static void change(AdditionalInformation additionalInformation, int index){
        if (additionalInformations != null && additionalInformations.length > index){
            if (additionalInformations[index] != null){
                System.out.println("Element already exists.");
                return;
            }
            additionalInformations[index] = additionalInformation;
        }
    }


    private static int i = 0;

    public static void add(AdditionalInformation additionalInformation){
        AdditionalInformation[] additionalInformations1 = Arrays.copyOf(additionalInformations, (additionalInformations.length*3)/2 + 1);
        additionalInformations = additionalInformations1;
        additionalInformations[i] = additionalInformation;
        i++;
    }
}
