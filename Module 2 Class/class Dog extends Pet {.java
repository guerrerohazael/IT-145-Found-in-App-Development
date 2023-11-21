//Dog class extends the Pet class and answers specific questions for Dog.

class Dog extends Pet {
    private int dogSpaceNbr;
    private double dogWeight;
    private boolean grooming;

    public Dog(String petType, String petName, int petAge, int daysStay, int dogSpaceNbr, double dogWeight, boolean grooming) {
        super(petType, petName, petAge, daysStay);
        this.dogSpaceNbr = dogSpaceNbr;
        this.dogWeight = dogWeight;
        this.grooming = grooming;
    }

    // Getters and setters for Dog-specific attributes
    public int getDogSpaceNbr() {
        return dogSpaceNbr;
    }

    public void setDogSpaceNbr(int dogSpaceNbr) {
        this.dogSpaceNbr = dogSpaceNbr;
    }
    //Get dog weight
    public double getDogWeight() {
        return dogWeight;
    }
    //Set dog weight
    public void setDogWeight(double dogWeight) {
        this.dogWeight = dogWeight;
    }
    //Grooming or no grooming
    public boolean isGrooming() {
        return grooming;
    }

    public void setGrooming(boolean grooming) {
        this.grooming = grooming;
    }
}