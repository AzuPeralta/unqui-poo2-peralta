package clienteEmail;

import java.util.List;

public interface IEmailServidor {
    public void conectar(String nombreUsuario, String passusuario);
    public void enviar(Correo correo);
    public List<Correo> recibirNuevos(String user, String pass);
}