package gestionAchats;

public class ServiceComptable extends Handler{
    ServiceComptable(Handler handler) {
        super(handler);
    }

    public void process(Demande demande) {
        if(demande.getMontant() > demande.getBudget().getValeurBudget()) {
            System.out.println("Votre budget n'est suffisant ");
        }else {
            super.process(demande);
        }
    }
}
