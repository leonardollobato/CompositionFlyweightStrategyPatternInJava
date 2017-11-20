public class Animal extends AnimalComponent {
    String animalName;
    String animalDescription;

    public IFlyes flyingType;

    public Animal(String newAnimalName, String newAnimalDescription) {
        this.animalName = newAnimalName;
        this.animalDescription = newAnimalDescription;
    }

    public String getAnimalName() { return animalName; }
    public String getAnimalDescription() { return animalDescription; }

    public void displayAnimalInfo() {
        System.out.println("The " + getAnimalName() + " [" + this.tryToFly()  +"] faz oq? " + getAnimalDescription() + "\n");
    }

    public String tryToFly() {
        return flyingType.fly();
    }

    public void setFlyingAbility(IFlyes newFlyType) {
        flyingType = newFlyType;
    }
}