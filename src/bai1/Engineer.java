package bai1;

public class Engineer extends Officer {

    private String trainingIndustry;

    public Engineer() {
    }

    public Engineer(String name, Integer age, String sex, String address, String trainingIndustry) {
        super(name, age, sex, address);
        this.trainingIndustry = trainingIndustry;
    }

    public String getTrainingIndustry() {
        return trainingIndustry;
    }

    public void setTrainingIndustry(String trainingIndustry) {
        this.trainingIndustry = trainingIndustry;
    }
}
