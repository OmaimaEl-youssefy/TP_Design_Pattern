package decorator;

public class Vol extends AssuranceDecorator {

    public Vol(Assurance assurance) {
        super(assurance);
    }

    @Override
    public double frais() {
        return assuranceDecorator.frais() + addVol(assuranceDecorator);
    }

    public double addVol(Assurance assuranceDecorator) {
        System.out.println("Assurance : Vol");
        return 10;
    }
}
