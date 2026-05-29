package AfterTest;

public class Animal{
    private String animalType;
    private String species;
    private String name;

    public Animal(String t, String s, String n){
        animalType = t;
        species = s;
        name = n;
    }

    public String getAnimalType() { return animalType; }
    public String getSpecies() { return species; }
    public String getName() { return name; }

    public String toString(){
        return name + " the " + species + " is a " + animalType;
    }
    }
