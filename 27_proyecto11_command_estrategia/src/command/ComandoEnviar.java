package command;

import model.Pedido;

public class ComandoEnviar implements Comando {
    private Pedido pedido;

    public ComandoEnviar(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public void ejecutar() {
    	System.out.println("Pedido enviado: " + pedido.getProducto());
        pedido.pagado(true);
    }
}
