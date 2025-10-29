package sistema.entidades;

public class Cocinero {
    private String nombre;
    private Sistema sistema;

    public Cocinero(String nombre, Sistema sistema) {
        this.nombre = nombre;
        this.sistema = sistema;
    }

    public void verPedidosPendientes() {
        System.out.println("Cocinero " + nombre + " consultando pedidos pendientes...");
        sistema.mostrarPedidosPendientes();
    }

    public void iniciarPreparacion(int idPedido) {
        System.out.println("Cocinero " + nombre + " iniciando la preparación del pedido #" + idPedido);
        boolean actualizado = sistema.actualizarEstadoPedido(idPedido, "En preparación");

        if (actualizado) {
            System.out.println("Pedido #" + idPedido + " ahora está EN PREPARACIÓN.");
        } else {
            System.out.println("No se pudo iniciar la preparación del pedido #" + idPedido + ".");
        }
    }

    public void marcarListo(int idPedido) {
        System.out.println("Cocinero " + nombre + " marcando el pedido #" + idPedido + " como LISTO.");
        boolean actualizado = sistema.actualizarEstadoPedido(idPedido, "Listo");

        if (actualizado) {
            System.out.println("Pedido #" + idPedido + " marcado como LISTO correctamente.");
        } else {
            System.out.println("No se pudo marcar el pedido #" + idPedido + " como listo.");
        }
    }
}
