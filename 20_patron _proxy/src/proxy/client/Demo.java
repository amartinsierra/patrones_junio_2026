package proxy.client;

import proxy.proxy.MissileProxy;

public class Demo {

	public static void main(String[] args) {
		String code="ABC";
		var missileProxy = new MissileProxy(code);
		missileProxy.launch();

	}

}
