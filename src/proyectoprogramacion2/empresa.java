package proyectoprogramacion2;

import java.io.Serializable;
import java.util.ArrayList;

public class empresa implements Serializable
{
    
   protected String nombre;
    protected int cedulaJuridica;
    protected int telefono;
    protected String email;
    
    public empresa(String nombre, int cedulaJuridica, int telefono, String email) {
        this.nombre = nombre;
        this.cedulaJuridica = cedulaJuridica;
        this.telefono = telefono;
        this.email = email;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCedJurid() {
        return cedulaJuridica;
    }

    public void setCedJurid(int cedJurid) {
        this.cedulaJuridica = cedJurid;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

   public String informacionEmpresa(){
        return String.format("Código: %s \n"
            +"Nombre: %s \n"
            +"Cédula Jurídica: %d \n"
            +"Teléfono: %d"
            +"Correo electrónico: %s \n",nombre, cedulaJuridica, telefono, email);
    } 
     
     
     
}
