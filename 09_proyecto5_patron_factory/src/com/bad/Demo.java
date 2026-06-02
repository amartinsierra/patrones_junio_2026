package com.bad;

public class Demo {
	public static void main(String[] args) {
        NotificacionService service = new NotificacionService();
        service.procesar("email", "Hola desde email");
        service.procesar("sms", "Hola desde SMS");
    }

}
