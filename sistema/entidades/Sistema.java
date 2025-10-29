package sistema.entidades;

public class Sistema {
    private Pedido pedido1;
    private Pedido pedido2;

    public Sistema() {
        // Cargamos algunos pedidos de ejemplo
        pedido1 = new Pedido(1, "Mesa 5", "Recibido");
        pedido2 = new Pedido(2, "Mesa 2", "Recibido");
    }

    public void mostrarPedidosPendientes() {
        System.out.println("Lista de pedidos pendientes:");
        if (pedido1.getEstado().equalsIgnoreCase("Recibido") || pedido1.getEstado().equalsIgnoreCase("En preparación")) {
            System.out.println(pedido1);
        }
        if (pedido2.getEstado().equalsIgnoreCase("Recibido") || pedido2.getEstado().equalsIgnoreCase("En preparación")) {
            System.out.println(pedido2);
        }
    }

    public boolean actualizarEstadoPedido(int id, String nuevoEstado) {
        if (pedido1.getId() == id) {
            pedido1.setEstado(nuevoEstado);
            return true;
        } else if (pedido2.getId() == id) {
            pedido2.setEstado(nuevoEstado);
            return true;
        }
        return false;
    }
}
