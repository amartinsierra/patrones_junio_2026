package com.good.factory;

import java.util.HashMap;
import java.util.Map;

public class FactoryRegistry {
    private static final Map<String, NotificacionFactory> factories = new HashMap<>();
    static {
    	//registramos las factorias JDBC y JPA
		factories.put("email", new EmailNotificacionFactory());
		factories.put("sms", new SmsNotificacionFactory());
		factories.put("push", new PushNotificacionFactory());
		
    }

    public static void registerFactory(String key, NotificacionFactory factory) {
        factories.put(key, factory);
    }

    public static NotificacionFactory getFactory(String key) {
    	NotificacionFactory factory = factories.get(key);
        if (factory == null) throw new IllegalArgumentException("Tipo no soportado: " + key);
        return factory;
    }
}