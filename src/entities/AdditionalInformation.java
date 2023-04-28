package entities;

public class AdditionalInformation extends EntitySuper {

    private String additionalInformation;

    private static int count = 0;

    public AdditionalInformation (int id, String additionalInformation) {
        super(id);
        this.additionalInformation = additionalInformation;
        count ++;
    }


    public String getAdditionalInformation() {
        return additionalInformation;
    }

    public void setAdditionalInformation(String additionalInformation) {
        this.additionalInformation = additionalInformation;
    }

    public static int getCount() {
        return count;
    }
}
