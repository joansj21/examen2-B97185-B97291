package cr.ac.ucr.paraiso.analisis.demohibenate.entity;

public class Cliente {
    private int cliente;
    private String nombre;
    private String apellido;


    public Cliente(int cliente, String nombre, String apellido) {
        this.cliente = cliente;
        this.nombre = nombre;
        this.apellido = apellido;
    }


    public int getCliente() {
        return cliente;
    }

    public void setCliente(int cliente) {
        this.cliente = cliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
