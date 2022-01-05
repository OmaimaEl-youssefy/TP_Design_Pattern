package decorator;

public class BrisGlace extends AssuranceDecorator {

    public BrisGlace(Assurance assurance) {
        super(assurance);
    }

    @Override
    public double frais() {
        return assuranceDecorator.frais() + addBrisGlace();
    }

    public double addBrisGlace() {
        System.out.println("Assurance : Bris de glace");
        return 10;
    }

}
