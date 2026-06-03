package command;

import model.Pedido;

public class ComandoPagar implements Comando {
    private Pedido pedido;

    public ComandoPagar(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public void ejecutar() {
    	System.out.println("Pedido pagado: " + pedido.getProducto()+" con precio final: "+pedido.getPrecio());
        pedido.pagado(true);
    }
}

