public class ChatUsuarioMediator extends UsuarioMediator {

    public ChatUsuarioMediator(Ichat room, String id, String name) {
        super(room, id, name);
    }

    @Override
    public void enviado(String msg, String id) {
        System.out.println(this.getNome() + " Enviando mensagem: " + msg);
        getMediator().enviandoMensagem(msg, id);
    }

    @Override
    public void recebido(String msg) {
        System.out.println(this.getNome() + " Mensagem Recebida: " + msg);
    }

}