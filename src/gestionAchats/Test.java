package gestionAchats;

public class Test {
    public static void main(String[] args) {
        Chain chain = new Chain();

        chain.process(new Demande(400,new Budget()));

    }
}
