public class Crocodile extends Animal {
    public Crocodile() {
        super("Crocodilo", "come os braços dos treinadores");
        this.setFlyingAbility(new CantFly());
    }
}