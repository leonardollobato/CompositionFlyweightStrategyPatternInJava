public class Main {
    public static void main(String [] args){
        AnimalComponent aves = new AnimalGroup("\nAves", "Animais que podem voar.");
        AnimalComponent peixes = new AnimalGroup("\nPeixes", "Animais vivem no mar/rios.");
        AnimalComponent anfibios = new AnimalGroup("\nTerrestres", "Animais que vive na terra e no mar .");
        
        // matriz
        AnimalComponent allAnimals = new AnimalGroup("Zoologico", "animais que temos no zoologico");

        allAnimals.add(aves);

        aves.add(new Pigeon());

        allAnimals.add(peixes);

        peixes.add(new Piranha());

        allAnimals.add(anfibios);

        anfibios.add(new Alligator());
        anfibios.add(new Crocodile());

        // Demonstration Flyweight pattern
        long startTime = System.currentTimeMillis();

        for(int i = 1; i < 10000000; i++){
            // anfibios.add(new Crocodile());
            anfibios.add(AnimalFactory.getAnimal("Crocodilo"));
        }
        long endTime = System.currentTimeMillis();

        long time = endTime - startTime;

        System.out.println("Levou: " + time + " ms");
        // end Demonstration


        // Zoo zoologico = new Zoo(allAnimals);
        // zoologico.getAnimalList();
    }
}
