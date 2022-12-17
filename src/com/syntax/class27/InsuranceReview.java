package com.syntax.class27;

public abstract class InsuranceReview {
    String insuranceName;

    InsuranceReview(String insuranceName){
        this.insuranceName=insuranceName;
    }
    abstract void getQuote();
    abstract void cancelInsurance();

    @Override
    public String toString() {
        return "Insurance{" +
                "insuranceName='" + insuranceName + '\'' +
                '}';
    }
}
class CarReview extends InsuranceReview{

    String carModel;
    CarReview(String insuranceName, String carModel) {

        super(insuranceName); //calls the parent class constructor
        this.carModel=carModel;
    }

    @Override
    void getQuote() {
        System.out.println(insuranceName+ " charges 3% of the car value for "+carModel);
    }

    @Override
    void cancelInsurance() {

        System.out.println(insuranceName+ " has been canceled");
    }

    @Override
    public String toString() {
        return "Car{" +
                "carModel='" + carModel + '\'' +
                ", insuranceName='" + insuranceName + '\'' +
                '}';
    }
}

class PetReview extends InsuranceReview{

    String petType;
    PetReview(String insurance, String petType){
        super(insurance);
        this.petType=petType;
    }
    @Override
    void getQuote() {
        System.out.println(insuranceName+" charges 1500USD for "+petType);
    }

    @Override
    void cancelInsurance() {

        System.out.println(insuranceName+" has been canceled for "+petType);
    }

    @Override
    public String toString() {
        return "Pet{" +
                "petType='" + petType + '\'' +
                ", insuranceName='" + insuranceName + '\'' +
                '}';
    }
}

class HealthReview extends InsuranceReview{

    HealthReview(String insuranceName) {
        super(insuranceName);
    }

    @Override
    void getQuote() {
        System.out.println(insuranceName+ "charges 2000USD for health");
    }

    @Override
    void cancelInsurance() {
        System.out.println(insuranceName+" has been canceled");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

