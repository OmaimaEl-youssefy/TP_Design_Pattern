package decorator;

public class Comptable {
    public static void main(String[] args) {

        Assurance assuranceResponsabiliteCivile = new ResponsabiliteCivile();
        Assurance assurance2=new Vol(new ResponsabiliteCivile());
        Assurance assurance3=new DommageCollision(new Vol(new ResponsabiliteCivile()));

        System.out.println(assuranceResponsabiliteCivile.frais());
        System.out.println(assurance2.frais());
        System.out.println(assurance3.frais());



    }
}
