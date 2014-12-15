package proyectoprogramacion2;


import proyectoprogramacion2.Cliente;


public class Venta {
    private int numeroFactura;
    private Cliente miCliente;

    public Venta(int numeroFactura, Cliente miCliente) {
        this.numeroFactura = numeroFactura;
        this.miCliente = miCliente;
    }

    public int getNumeroFactura() {
        return numeroFactura;
    }

    public Cliente getMiCliente() {
        return miCliente;
    }

    public void setNumeroFactura(int numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public void setMiCliente(Cliente miCliente) {
        this.miCliente = miCliente;
    }
    
    public String infoVenta(){
        String salida = "-------";
        salida = String.format("Número de Factura: %d\n"+
                                "Cliente: %s\n", numeroFactura, miCliente.getNombre());
        return salida;
    }
    
}
