package proyectoprogramacion2;

import java.io.Serializable;

public final class Proveedor extends empresa implements Serializable
{
    private String contacto;
    private String paginaWeb;

    public Proveedor(String contacto, String paginaWeb, String nombre, int cedulaJuridica, int telefono, String email) {
        super(nombre, cedulaJuridica, telefono, email);
        this.contacto = contacto;
        this.paginaWeb = paginaWeb;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getPagWeb() {
        return paginaWeb;
    }

    public void setPagWeb(String pagWeb) {
        this.paginaWeb = pagWeb;
    }
    
    public String informacionProveedor(){
        String salida = "";
        salida = "Empresa: "+super.getNombre()+"\n"+
                "Telefono:"+super.getTelefono()+"\n"+
                "Contacto: "+ contacto+"\n"+
                "Página Web:"+paginaWeb+"\n";
        return salida;
    }
    
}
