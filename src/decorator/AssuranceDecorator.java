package decorator;

public abstract class AssuranceDecorator implements Assurance {

    protected Assurance assuranceDecorator;

    public AssuranceDecorator(Assurance assurance) {
        this.assuranceDecorator = assurance;
    }

    public double frais() {
       return assuranceDecorator.frais();
    }

}
