package proyectoprogramacion2;

import java.io.Serializable;

public class Producto implements Serializable
{
    
    protected double costo;
    protected String codigo;
    protected String nombre;
    protected int cantidad;
    protected int cantidadInicial;
    protected final double porcentajeGanancia = 0.15;
    public static final String prefijo = "PR";
    public static int consecutivo = 1000;

    public Producto(double costo, int codigo, String nombre, int cantidad, int cantidadInicial) {
        this.costo = costo;
        this.codigo = prefijo + "-"+ consecutivo;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.cantidadInicial = cantidadInicial;
        
    }

    public double getCosto() {
        return costo;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public int getCantidadInicial() {
        return cantidadInicial;
    }

    public double getPorcentajeGanancia() {
        return porcentajeGanancia;
    }

    public static String getPrefijo() {
        return prefijo;
    }

    public static int getConsecutivo() {
        return consecutivo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public static void setConsecutivo(int consecutivo) {
        Producto.consecutivo = consecutivo;
    }

    public double precioVenta(){
        return costo +(costo * porcentajeGanancia);
    }
    
    public String informacionProducto(){
        return String.format("Código: %s \n"
            +"Nombre: %s \n"
            +"Costo: %.2f \n"
            +"Cantidad Existencial: %d\n\n", codigo, nombre, costo,cantidad);
    }
    
    
}
