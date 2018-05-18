
package co.com.poli.Appinventario.Model;

public class Movimiento {
    
    private String idMovimiento;
    private Producto producto;
    private Double cantidad;
    private String tipo;
    private Double precio;

    public Movimiento() {
    }

    public Movimiento(String idMovimiento, Producto producto, Double cantidad, String tipo, Double precio) {
        this.idMovimiento = idMovimiento;
        this.producto = producto;
        this.cantidad = cantidad;
        this.tipo = tipo;
        this.precio = precio;
    }
    
    

    public String getIdMovimiento() {
        return idMovimiento;
    }

    public void setIdMovimiento(String idMovimiento) {
        this.idMovimiento = idMovimiento;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Double getCantidad() {
        return cantidad;
    }

    public void setCantidad(Double cantidad) {
        this.cantidad = cantidad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
}
