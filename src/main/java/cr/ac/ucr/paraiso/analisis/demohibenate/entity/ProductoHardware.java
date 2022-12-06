package cr.ac.ucr.paraiso.analisis.demohibenate.entity;

public class ProductoHardware extends Producto {
    private String lugarEnsamble;

    public ProductoHardware(int idProducto, String descripcion, float precio,String lugarEnsamble) {
        super(idProducto, descripcion, precio);
        this.lugarEnsamble=lugarEnsamble;
    }


    public String getLugarEnsamble() {
        return lugarEnsamble;
    }

    public void setLugarEnsamble(String lugarEnsamble) {
        this.lugarEnsamble = lugarEnsamble;
    }
}
