package AfterTest;

public class Elephant extends Herbivore {
    private double tuskLength;

    public Elephant(String name, double tuskLength) {
        super("elephant", name);
        this.tuskLength = tuskLength;
    }


    public String toString() {
        return getName() + " the " + getSpecies() + " is a " + getAnimalType()
               + " with tusks " + tuskLength + " meters long";
    }
}