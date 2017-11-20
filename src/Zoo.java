public class Zoo {
    AnimalComponent animalList;

    public Zoo(AnimalComponent newAnimalList) {
        animalList = newAnimalList;
    }

    public void getAnimalList() {
        animalList.displayAnimalInfo();
    }
}