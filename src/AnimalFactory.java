import java.util.HashMap;

public class AnimalFactory {
    private static final HashMap<String, Animal> animalsByName = new HashMap<>();
    public static Animal getAnimal(String name) {
        Animal animal = (Animal)animalsByName.get(name);
        if(animal == null) {
            animal = new Animal(name, "");
            animal.setFlyingAbility(new CantFly());
            animalsByName.put(name, animal);
        }

        return animal;
    }
}