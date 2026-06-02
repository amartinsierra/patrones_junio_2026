package com.good.cliente;

import com.good.adapter.CanalEmailAdapter;
import com.good.canales.CanalNotificacion;
import com.good.canales.CanalSms;
import com.good.descuentos.DescuentoVip;
import com.good.notificaciones.Notificacion;
import com.good.notificaciones.NotificacionConfirmacion;
import com.good.notificaciones.NotificacionRecordatorio;
import com.good.pedidos.Pedido;
import com.good.pedidos.PedidoBase;

public class Demo {

	public static void main(String[] args) {
		// Pedido con descuento
        Pedido pedido = new PedidoBase("Libro", 100);
        pedido = new DescuentoVip(pedido);
        //enviamos notificación por sms
        CanalNotificacion canalSms = new CanalSms();
        Notificacion notificacionSms = new NotificacionRecordatorio(canalSms);
        notificacionSms.enviarMensaje(pedido.getProducto() + " por " + pedido.getPrecio());
       
        // Usamos Bridge con Adapter para enviar la notificación
        CanalNotificacion canal = new CanalEmailAdapter();
        Notificacion notificacion = new NotificacionConfirmacion(canal);

        notificacion.enviarMensaje(pedido.getProducto() + " por " + pedido.getPrecio());
			

	}

}
