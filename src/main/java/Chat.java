import java.util.HashMap;
import java.util.Map;

public class Chat implements Ichat {

    private Map<String, UsuarioMediator> usersMap = new HashMap<>();

    @Override
    public void enviandoMensagem(String msg, String userId)
    {
        UsuarioMediator u = usersMap.get(userId);
        u.recebido(msg);
    }

    @Override
    public void addUsuario(UsuarioMediator usuarioMediator) {
        this.usersMap.put(usuarioMediator.getId(), usuarioMediator);
    }
}