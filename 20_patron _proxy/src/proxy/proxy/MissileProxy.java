package proxy.proxy;

import proxy.MissileSystem;
import proxy.real.RealMissileSystem;

public class MissileProxy implements MissileSystem {
    private final RealMissileSystem realSystem = new RealMissileSystem();
    private final String authorizedCode;

    public MissileProxy(String authorizedCode) {
        this.authorizedCode = authorizedCode;
    }

    @Override
    public void launch() {
        if (verifyAccess()) {
            realSystem.launch();
        } else {
            System.out.println("⛔ Acceso denegado. Código de autorización inválido.");
        }
    }

    private boolean verifyAccess() {
        // En la realidad podría consultar un servidor o base de datos segura
        return "ALFA-RED".equals(authorizedCode);
    }
}
