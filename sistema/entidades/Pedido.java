package sistema.entidades;

public class Pedido {
    private int id;
    private String cliente;
    private String estado;

    public Pedido(int id, String cliente, String estado) {
        this.id = id;
        this.cliente = cliente;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Pedido #" + id + " - Cliente: " + cliente + " - Estado: " + estado;
    }
}
