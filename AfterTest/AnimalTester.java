package AfterTest;

public class AnimalTester {
    public static void main(String[] args) {
        Herbivore h = new Herbivore("deer", "ABC");
        System.out.println(h); 

        Elephant e = new Elephant("DEF", 2.0);
        System.out.println(e); 

        
        System.out.println(e.getName() + " | species: " + e.getSpecies() + " | type: " + e.getAnimalType());
    }
}