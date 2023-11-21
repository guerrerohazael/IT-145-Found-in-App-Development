/** 
  *Pet class contains attrributes such ass pet type, pet name, pet age,
  *days of stay, space required, and amount due.
  */

public class Pet {
    private String petType;
    private String petName;
    private int petAge;
    private int daysStay;
    private int space;
    private double amountDue;

    // Constructors
    public Pet(String petType, String petName, int petAge, int daysStay) {
        this.petType = petType;
        this.petName = petName;
        this.petAge = petAge;
        this.daysStay = daysStay;
    }

    // Getters and setters for Pet attributes
    //Get type of pet
    public String getPetType() {
        return petType;
    }
    //Set type of pet
    public void setPetType(String petType) {
        this.petType = petType;
    }
    //Get pet name
    public String getPetName() {
        return petName;
    }
    //Set pet Name
    public void setPetName(String petName) {
        this.petName = petName;
    }
    //Get pet age
    public int getPetAge() {
        return petAge;
    }
    //Set pet age
    public void setPetAge(int petAge) {
        this.petAge = petAge;
    }
    //Get days for stays
    public int getDaysStay() {
        return daysStay;
    }
    //Set days for stays
    public void setDaysStay(int daysStay) {
        this.daysStay = daysStay;
    }
    //Get available space
    public int getSpace() {
        return space;
    }
    //Set available space
    public void setSpace(int space) {
        this.space = space;
    }
    //Get amount due
    public double getAmountDue() {
        return amountDue;
    }
    //Set amount due
    public void setAmountDue(double amountDue) {
        this.amountDue = amountDue;
    }
}

