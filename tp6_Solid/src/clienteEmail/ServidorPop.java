package clienteEmail;

import java.util.ArrayList;
import java.util.List;

// Ahora solo implementa lo que verdaderamente sabe y necesita hacer
public class ServidorPop implements IEmailServidor {

    @Override
    public void conectar(String nombreUsuario, String passusuario) {
        // Establece la conexión de forma válida
    }

    @Override
    public void enviar(Correo correo) {
        // Realiza el envío del correo por protocolo POP
    }

    @Override
    public List<Correo> recibirNuevos(String user, String pass) {
        List<Correo> retorno = new ArrayList<>();
        // Obtiene e-mails nuevos auténticos
        return retorno;
    }
}
