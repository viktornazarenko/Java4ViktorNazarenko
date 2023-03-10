package entities;

public class AdditionalInformation {

    private int id;

    protected String additionalInformation;

    protected static int count = 0;

    public AdditionalInformation (int id, String additionalInformation) {
        this.id = id;
        this.additionalInformation = additionalInformation;
        count ++;
    }
}
