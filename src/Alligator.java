public class Alligator extends Animal {
    public Alligator() {
        super("Jacaré","come os braços dos treinadores");
        this.setFlyingAbility(new CantFly());
    }
}