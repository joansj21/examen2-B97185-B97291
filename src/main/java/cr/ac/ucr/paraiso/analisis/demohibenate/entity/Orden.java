package cr.ac.ucr.paraiso.analisis.demohibenate.entity;

import java.util.Date;
import java.util.List;

public class Orden {

    private int numOrden;
    private Date fechaOrden;
    private Cliente cliente;

    private List<ItemOrden> itemes;

    public Orden(int numOrden, Date fechaOrden, Cliente cliente, List<ItemOrden> itemes) {
        this.numOrden = numOrden;
        this.fechaOrden = fechaOrden;
        this.cliente = cliente;
        this.itemes = itemes;
    }

    public int getNumOrden() {
        return numOrden;
    }

    public void setNumOrden(int numOrden) {
        this.numOrden = numOrden;
    }

    public Date getFechaOrden() {
        return fechaOrden;
    }

    public void setFechaOrden(Date fechaOrden) {
        this.fechaOrden = fechaOrden;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<ItemOrden> getItemes() {
        return itemes;
    }

    public void setItemes(List<ItemOrden> itemes) {
        this.itemes = itemes;
    }
}
