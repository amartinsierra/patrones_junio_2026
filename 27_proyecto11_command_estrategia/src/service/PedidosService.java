package service;

import command.Comando;
import command.ComandoCancelar;
import command.ComandoEnviar;
import command.ComandoPagar;
import model.Pedido;
import strategy.DescuentoVIP;
import strategy.EstrategiaDescuento;

public class PedidosService {
    private EstrategiaDescuento estrategia;

    public PedidosService(EstrategiaDescuento estrategia) {
        this.estrategia = estrategia;
    }
    public void procesarPedido(Pedido pedido) {
		pedido.setPrecio(estrategia.aplicarDescuento(pedido.getPrecio()));
		//ejecutamos comandos de pago y envio
		Comando pagar = new ComandoPagar(pedido);
        Comando enviar = new ComandoEnviar(pedido);
        try {
        	pagar.ejecutar();
            enviar.ejecutar();
        }catch(Exception ex) {
        	new ComandoCancelar(pedido).ejecutar();
        }
        

	}
    
}
