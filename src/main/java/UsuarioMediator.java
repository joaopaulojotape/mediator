public abstract class UsuarioMediator
{
    private Ichat mediator;

    private String id;
    private String nome;

    public UsuarioMediator(Ichat sala, String id, String nome){
        this.mediator = sala;
        this.nome = nome;
        this.id = id;
    }

    public abstract void enviado(String msg, String id);
    public abstract void recebido(String msg);

    public Ichat getMediator() {
        return mediator;
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }
}