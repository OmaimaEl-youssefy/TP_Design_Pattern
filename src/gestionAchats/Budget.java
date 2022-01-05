package gestionAchats;

import java.util.ArrayList;
import java.util.List;

public class Budget implements Publisher {

    private List<Subscriber> listSubscribers;
    private double montant;
    private double valeurBudget;

    Budget(Budget budget) {
        this.listSubscribers = new ArrayList<>();
    }

    @Override
    public void ajouterDemande(Subscriber subscriber) {
        listSubscribers.add(subscriber);
    }

    @Override
    public void supprimerDemande(Subscriber subscriber) {
        listSubscribers.remove(listSubscribers.indexOf(subscriber));
    }

    @Override
    public void notifySubscribers() {
        for (int i = 0; i < listSubscribers.size(); i++) {
            listSubscribers.get(i).update(montant);
        }
    }

    public void setBudget(double budget) {
        this.valeurBudget = budget;
    }

    public double getValeurBudget() {
        return valeurBudget;
    }

    public double updateBudget(double montant) {
        return  valeurBudget - montant;
    }

}
