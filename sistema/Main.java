package sistema;

import sistema.entidades.*;  // ← faltaban los asteriscos

public class Main {          // ← la clase debe empezar con mayúscula
    public static void main(String[] args) {
        Sistema sistema = new Sistema();
        Cocinero cocinero = new Cocinero("Ramiro", sistema);

        cocinero.verPedidosPendientes();
        cocinero.iniciarPreparacion(1);
        cocinero.marcarListo(1);
    }
}
