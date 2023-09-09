package clases;

import java.util.ArrayList;
import java.util.List;

public class Datos_planes {
    private int codigo;
    private String nombre;
    private String descripcion;
    private int precio;
    private List<Integer> cantidad_cuotas= new ArrayList<>();
    private int fecha_pago;
    private List<Integer> pagos_realizados= new ArrayList<>();

    public Datos_planes(int codigo, String nombre, String descripcion, int precio, int fecha_pago) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.fecha_pago = fecha_pago;
        
    }
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public List<Integer> getCantidad_cuotas() {
        return cantidad_cuotas;
    }

    public void setCantidad_cuotas(int cuota) {
        this.cantidad_cuotas.add(cuota);
    }

    public int getFecha_pago() {
        return fecha_pago;
    }

    public void setFecha_pago(int fecha_pago) {
        this.fecha_pago = fecha_pago;
    }

    public List<Integer> getPagos_realizados() {
        return pagos_realizados;
    }

    public void setPagos_realizados(int pagos) {
        this.pagos_realizados.add(pagos);
    }
    
}
