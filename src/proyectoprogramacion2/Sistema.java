package proyectoprogramacion2;

import java.util.ArrayList;
import java.util.Date;

public class Sistema implements Reporte {

    private Producto miProducto;
    private Proveedor miProveedor;
    private empresa miEmpresa;
    private OrdenCompra miOrdenCompra;
    ArrayList<Proveedor> proveedores = new ArrayList();
    ArrayList<Producto> productos = new ArrayList();
    ArrayList<Producto> ingresoMercaderia= new ArrayList();
    ArrayList<Producto> salidaMercaderia = new ArrayList();

    // ArrayList
    public void agregar(String contacto, String pagWeb, String nombre, int cedJurid, int telefono, String email) {
        proveedores.add(new Proveedor(contacto, pagWeb, nombre, cedJurid, telefono, email));//agregar proveedor
    }

    public void agregar(double costo, int codigo, String nombre, int cantInicial, int cant) {
        productos.add(new Producto(costo, codigo, nombre, cantInicial, cant));//agregar producto
    }

    public Proveedor buscar(int cedulaJuridica) {//buscar prooveedor por cédula juridica
        Proveedor temp = null;
        for (Proveedor p : proveedores) {
            if (p.getCedJurid() == cedulaJuridica) {
                temp = p;
                break;
            }
        }
        return temp;
    }

    public Producto buscar(String nombre) {//buscar producto por nombre 
        Producto temp = null;
        for (Producto p : productos) {
            if (p.getNombre().equalsIgnoreCase(nombre)) {
                temp = p;
                break;
            }
        }
        return temp;
    }

    public Producto buscarCodigo(String codigo) {//buscar prooveedor por codigo
        Producto temp = null;
        for (Producto p : productos) {
            if (p.getNombre().equalsIgnoreCase(codigo)) {
                temp = p;
                break;
            }
        }
        return temp;
    }

    public void ingresarMercaderia(double costo, int codigo, String nombre, int cantidad, int cantidadInicial) {
        if (buscar(nombre) != null) {
            int cantActual = buscar(nombre).getCantidad();
            buscar(nombre).setCantidad(cantActual + cantidad);
        }
        productos.add(new Producto(costo, codigo, nombre, cantidadInicial, cantidad));
    }

    public void salidaProducto(double costo, int codigo, String nombre, int cantidad, int cantidadInicial) {
        if (buscar(nombre) != null) {
            int cantActual = buscar(nombre).getCantidad();
            buscar(nombre).setCantidad(cantActual - cantidad);
        }
        salidaMercaderia.add(new Producto(costo, codigo, nombre, cantidadInicial, cantidad));
    }

    public String realizarCompra() {
        return this.miOrdenCompra.lista();

    }

    public String listaProductos() {
        String salida = "";
        for (Producto p : productos) {
            salida += String.format(""
                    + "%s \t %s \t%d \n %d\n",
                    p.getCodigo(),
                    p.getNombre(),
                    p.getPorcentajeGanancia(),
                    p.getCantidad());

        }
        return salida;
    }

    @Override
    public String reporte() {//Reporte de entrada de productos
        String salida = "";
        for (Producto p : productos) {
            salida += String.format("----------REPORTE PRODUCTOS-----------"
                    + "%s\n"
                    + "...Código%s...Producto%s...Existencia%d...Tipo%s...\n",
                    miEmpresa.informacionEmpresa(),
                    p.getCodigo(),
                    p.getNombre(),
                    p.getCantidad());
        }
        return salida;
    }

    public String reporteSalida() {//Reporte de salida de productos
        String salida = "";
        for (Producto p : productos) {
            salida += String.format("----------REPORTE PRODUCTOS-----------"
                    + "%s\n"
                    + "...Código%s...Producto%s...Existencia%d...Tipo%s...\n",
                    miEmpresa.informacionEmpresa(),
                    p.getCodigo(),
                    p.getNombre(),
                    p.getCantidad());
        }
        return salida;
    }

    public String reportePro() {//Reporte de proveedores
        String salida = "";
        for (Proveedor p : proveedores) {
            salida += String.format("----------REPORTE PROVEEDORES-----------"
                    + "%s\n"
                    + "...Nombre proveedor: %s...Cédula Jurídica: %d...Contacto: %s...Página Web: %s \n",
                    miEmpresa.informacionEmpresa(),
                    p.getNombre(),
                    p.getCedJurid(),
                    p.getContacto(),
                    p.getPagWeb());
        }
        return salida;
    }

    public String reporteGeneral() {//Reporte de movimientos
        String salida = "";
        for (Proveedor p : proveedores) {
            salida += String.format("----------REPORTE PROVEEDORES-----------"
                    + "%s\n"
                    + "...Nombre proveedor: %s...Cédula Jurídica: %d...Contacto: %s...Página Web: %s \n",
                    miEmpresa.informacionEmpresa(),
                    p.getNombre(),
                    p.getCedJurid(),
                    p.getContacto(),
                    p.getPagWeb());
        }
        return salida;
    }
}
