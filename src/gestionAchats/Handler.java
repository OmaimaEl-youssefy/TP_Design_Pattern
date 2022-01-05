package gestionAchats;

public abstract class Handler {
    private Handler handler;

    Handler(Handler handler) {
        this.handler = handler;
    }

    public void process(Demande demande) {
        if(handler != null) {
            handler.process(demande);
        }
    }

}
