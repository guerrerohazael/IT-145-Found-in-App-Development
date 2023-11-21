//Daniel Guerrero  10/09/2023
public class Monkey extends RescueAnimal {
   // Instance variables
   private String species;     // The species of the monkey
   private String height;      // The height of the monkey (in inches)
   private String tailLength;  // The length of the monkey's tail (in inches)
   private String bodyLength;  // The length of the monkey's body (in inches)

   public final static String[] VALID_SPECIES = {
      "Capuchin",
      "Guenon",
      "Macaque",
      "Marmoset",
      "Squirrel monkey",
      "Tamarin"
   };

   // Constructor
   public Monkey(String name, String species, String gender, String age,
                 String weight, String height, String bodyLength, String tailLength,
                 String acquisitionDate, String acquisitionCountry,
                 String trainingStatus, boolean reserved, String inServiceCountry) {
                  
      // Initialize attributes using setters from the parent class RescueAnimal
      setName(name);
      setSpecies(species);
      setGender(gender);
      setAge(age);
      setWeight(weight);
      setHeight(height);
      setBodyLength(bodyLength);
      setTailLength(tailLength);
      setAcquisitionDate(acquisitionDate);
      setAcquisitionLocation(acquisitionCountry);
      setTrainingStatus(trainingStatus);
      setReserved(reserved);
      setInServiceCountry(inServiceCountry);
   }

   // Accessor methods
   public String getSpecies() {
      return species;
   }

   public String getHeight() {
      return height;
   }

   public String getTailLength() {
      return tailLength;
   }

   public String getBodyLength() {
      return bodyLength;
   }

   // Mutator methods
   public void setSpecies(String monkeySpecies) {
      species = monkeySpecies;
   }

   public void setHeight(String monkeyHeight) {
      height = monkeyHeight;
   }

   public void setTailLength(String monkeyTailLength) {
      tailLength = monkeyTailLength;
   }

   public void setBodyLength(String monkeyBodyLength) {
      bodyLength = monkeyBodyLength;
   }
}
