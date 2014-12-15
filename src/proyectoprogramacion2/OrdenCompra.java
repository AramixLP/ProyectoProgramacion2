
package proyectoprogramacion2;


public class OrdenCompra {
    private String cedulaJuridicaProveedor;
    private Producto miProducto;
    static int consecutivo= 0;

    public OrdenCompra(String cedulaJuridicaProveedor, Producto miProducto) {
        this.cedulaJuridicaProveedor = cedulaJuridicaProveedor;
        this.miProducto = miProducto;
    }

   public static int consecutivo(){
       return consecutivo+=0;
   }

    public String getCedulaJuridicaProveedor() {
        return cedulaJuridicaProveedor;
    }

    public Producto getMiProducto() {
        return miProducto;
    }

    public static int getConsecutivo() {
        return consecutivo;
    }

    public void setCedulaJuridicaProveedor(String cedulaJuridicaProveedor) {
        this.cedulaJuridicaProveedor = cedulaJuridicaProveedor;
    }

    public void setMiProducto(Producto miProducto) {
        this.miProducto = miProducto;
    }

    public static void setConsecutivo(int consecutivo) {
        OrdenCompra.consecutivo = consecutivo;
    }

    public String lista(){
         return String.format("Producto: %s \n"
            +"consecutivo: %d \n"            
            +"Cedula Juridica Proveedor: %d",this.getMiProducto().informacionProducto(), 
                consecutivo, this.getCedulaJuridicaProveedor());
         
        
      
        
       
    }
   
}
