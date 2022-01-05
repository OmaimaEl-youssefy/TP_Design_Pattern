package decorator;

public class ResponsabiliteCivile implements Assurance{

    @Override
    public double frais() {
        System.out.println("Assurance : Responsabilité civile");
        return 10;
    }
}
