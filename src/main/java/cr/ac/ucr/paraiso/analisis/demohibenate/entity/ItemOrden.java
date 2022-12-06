package cr.ac.ucr.paraiso.analisis.demohibenate.entity;

public class ItemOrden {

    private int idItemOrder;
    private int cantidad;
    private float precioUnitario;
    private Producto producto;

    public ItemOrden(int idItemOrder, int cantidad, float precioUnitario, Producto producto) {
        this.idItemOrder = idItemOrder;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.producto = producto;
    }


    public int getIdItemOrder() {
        return idItemOrder;
    }

    public void setIdItemOrder(int idItemOrder) {
        this.idItemOrder = idItemOrder;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(float precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
}


