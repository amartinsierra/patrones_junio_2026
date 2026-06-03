package cliente;

import model.Pedido;
import service.PedidosService;
import strategy.DescuentoBlackFriday;
import strategy.DescuentoVIP;

public class Demo {
	public static void main(String[] args) {
        Pedido pedido = new Pedido("Videojuego",60);

        

        // Strategy: aplicar distintos descuentos
        PedidosService calculadora = new PedidosService(new DescuentoVIP());

        calculadora.procesarPedido(pedido);

        
    }
	
	

}
