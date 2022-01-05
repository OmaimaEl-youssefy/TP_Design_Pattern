package gestionAchats;

public class ServiceGestion extends Handler{

    ServiceGestion(Handler handler) {
        super(handler);
    }

    public void process(Demande demande) {
        if(demande.getMontant() <= demande.getBudget().getValeurBudget()) {
            System.out.println("Budget update : ");
            demande.getBudget().setBudget(demande.getMontant());
            demande.update(0);

        }else {
            super.process(demande);
        }
    }
}
