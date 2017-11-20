public class Piranha extends Animal {
    public Piranha() {
        super("Piranha", "come quem entra no rio com ferida aberta");
        this.setFlyingAbility(new AlmostFly());
    }
}