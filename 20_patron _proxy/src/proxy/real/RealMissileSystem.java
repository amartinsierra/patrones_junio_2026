package proxy.real;

import proxy.MissileSystem;

public class RealMissileSystem implements MissileSystem {
    @Override
    public void launch() {
        System.out.println("🚀 Misil lanzado con éxito!");
    }
}