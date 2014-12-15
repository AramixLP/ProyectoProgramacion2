package proyectoprogramacion2;

import java.util.Date;

public class Perecedero extends Producto
{
    private Date fechaExpiracion;
    private double temperatura;
    private double costoAdicional;

    public Perecedero(Date fechaExp, double temperatura, double costoAdicional, double costo, int codigo, String nombre, int cantidadInicial, int cantidad) {
        super(costo, codigo, nombre, cantidadInicial, cantidad);
        this.fechaExpiracion = fechaExpiracion;
        this.temperatura = temperatura;
        this.costoAdicional = costoAdicional;
    }

    public Date getFechaExpiracion() {
        return fechaExpiracion;
    }

    public void setFechaExpiracion(Date fechaExpiracion) {
        this.fechaExpiracion = fechaExpiracion;
    }
 
    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public double getCostoAdicional() {
        return costoAdicional;
    }

    public void setCostoAdicional(double costoAdicional) {
        this.costoAdicional = costoAdicional;
    }
    
    
    
}
