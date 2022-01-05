package decorator;

public class DommageCollision extends AssuranceDecorator {
    public DommageCollision(Assurance assurance) {
        super(assurance);
    }

    @Override
    public double frais() {
        return assuranceDecorator.frais()+addDommageCollision(assuranceDecorator);
    }

    public double addDommageCollision(Assurance assuranceDecorator) {
        System.out.println("Assurance : Dommage et collision");
        return 10;
    }
}
