package gestionAchats;

public class Chain {
    Handler chain;

    public Chain() {
        buildChain();
    }

    private void buildChain() {
        chain = new ServiceComptable(new ServiceGestion(null));
    }

    public void process(Demande demande) {
        chain.process(demande);
    }
}
