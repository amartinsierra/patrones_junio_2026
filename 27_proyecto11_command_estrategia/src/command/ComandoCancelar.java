package command;

import model.Pedido;

public class ComandoCancelar implements Comando {
    private Pedido pedido;

    public ComandoCancelar(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public void ejecutar() {
    	System.out.println("Pedido cancelado: " + pedido.getProducto());
    	pedido.pagado(false);
    }
}
