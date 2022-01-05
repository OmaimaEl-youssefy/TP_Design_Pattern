package gestionAchats;

public class Demande implements Subscriber {

    private double montant;
    private Budget budget;

    Demande(double montant,Budget budget) {
        this.budget = budget;
        this.montant = montant;
    }

    @Override
    public void update(double montant) {
        this.montant = montant;
    }

    public double getMontant() {
        return montant;
    }

    public void setBudget(Budget budget) {
        this.budget = budget;
    }

    public Budget getBudget() {
        return budget;
    }

}
