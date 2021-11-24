import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class UsuarioMediatorTest {

    @Test
    public void testeMediator(){
        Ichat chatSala = new Chat();



        UsuarioMediator usuarioMediator1 = new ChatUsuarioMediator(chatSala,"1", "Alex");
        UsuarioMediator usuarioMediator2 = new ChatUsuarioMediator(chatSala,"2", "Bruna");
        UsuarioMediator usuarioMediator3 = new ChatUsuarioMediator(chatSala,"3", "Charles");
        UsuarioMediator usuarioMediator4 = new ChatUsuarioMediator(chatSala,"4", "David");
        chatSala.addUsuario(usuarioMediator1);
        chatSala.addUsuario(usuarioMediator2);
        chatSala.addUsuario(usuarioMediator3);
        chatSala.addUsuario(usuarioMediator4);

        usuarioMediator1.enviado("Olá bruno", "2");
        usuarioMediator2.enviado("Olá João", "1");
        assertEquals("Alex",usuarioMediator1.getNome());


    }

    }

