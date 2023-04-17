package entities;

public class AdditionalInformation {

    private int id;

    private String additionalInformation;

    protected static int count = 0;

    public AdditionalInformation (int id, String additionalInformation) {
        this.id = id;
        this.additionalInformation = additionalInformation;
        count ++;
    }

    public int getId() {
        return id;
    }

    public String getAdditionalInformation() {
        return additionalInformation;
    }
}
