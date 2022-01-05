package gestionAchats;

public interface Publisher {
     void ajouterDemande(Subscriber s);
     void supprimerDemande(Subscriber s);
     void notifySubscribers();
}
