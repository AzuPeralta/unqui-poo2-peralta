package clienteEmail;

import java.util.ArrayList;
import java.util.List;

public class ClienteEMail {
    
    // DIP: Depende de la interfaz, NO de ServidorPop concreto
    private IEmailServidor servidor;
    private String nombreUsuario;
    private String passusuario;
    private List<Correo> inbox;
    private List<Correo> borrados;
    
    // Inyección de dependencias por constructor
    public ClienteEMail(IEmailServidor servidor, String nombreUsuario, String pass){
        this.servidor = servidor;
        this.nombreUsuario = nombreUsuario;
        this.passusuario = pass;
        this.inbox = new ArrayList<>();
        this.borrados = new ArrayList<>();
        this.conectar();
    }
    
    public void conectar(){
        this.servidor.conectar(this.nombreUsuario, this.passusuario);
    }
    
    public void borrarCorreo(Correo correo){
        this.inbox.remove(correo);
        this.borrados.add(correo); // Corregido: se añade a borrados al eliminar de inbox
    }
    
    public int contarBorrados(){
        return this.borrados.size();
    }
    
    public int contarInbox(){
        return this.inbox.size();
    }
    
    public void eliminarBorrado(Correo correo){
        this.borrados.remove(correo);
    }
    
    public void recibirNuevos(){
        // Recibe las actualizaciones abstrayendo el protocolo subyacente
        List<Correo> nuevos = this.servidor.recibirNuevos(this.nombreUsuario, this.passusuario);
        this.inbox.addAll(nuevos);
    }
    
    public void enviarCorreo(String asunto, String destinatario, String cuerpo){
        Correo correo = new Correo(asunto, destinatario, cuerpo);
        this.servidor.enviar(correo);
    }
}
