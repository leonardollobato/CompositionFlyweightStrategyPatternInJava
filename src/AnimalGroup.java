import java.util.ArrayList;
import java.util.Iterator;

public class AnimalGroup extends AnimalComponent {
    ArrayList animalComponents = new ArrayList();

    String animalGroupName;
    String animalGroupDescription;

    public AnimalGroup(String newAnimalGroupName, String newAnimalGroupDescription) {
        this.animalGroupName = newAnimalGroupName;
        this.animalGroupDescription = newAnimalGroupDescription;
    }

    public String getAnimalGroupName() {
        return this.animalGroupName;
    }

    public String getAnimalGroupDescription() {
        return this.animalGroupDescription;
    }

    public void add(AnimalComponent newAnimalComponent) {
        animalComponents.add(newAnimalComponent);
    }

    public void remove(AnimalComponent newAnimalComponent) {
        animalComponents.remove(newAnimalComponent);
    }

    public AnimalComponent getComponent(int componentIndex) {
        return (AnimalComponent) animalComponents.get(componentIndex);
    }

    public void displayAnimalInfo() {
        System.out.println(getAnimalGroupName() + " " + getAnimalGroupDescription() + "\n");

        Iterator animalIterator = animalComponents.iterator();

        while(animalIterator.hasNext()) {
            AnimalComponent animalInfo = (AnimalComponent) animalIterator.next();
            animalInfo.displayAnimalInfo();
        }
    }
}