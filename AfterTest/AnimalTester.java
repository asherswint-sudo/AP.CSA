package AfterTest;

public class AnimalTester {
    public static void main(String[] args) {
        Herbivore h = new Herbivore("deer", "George");
        System.out.println(h); 

        Elephant e = new Elephant("Terrence", 2.0);
        System.out.println(e); 

        Animal a = new Animal("Carnivore", "Dog", "Comet");
        System.out.println(a); 

        
        System.out.println(e.getName() + " | species: " + e.getSpecies() + " | type: " + e.getAnimalType());
    }
}