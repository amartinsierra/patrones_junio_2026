package strategy;

public class DescuentoVIP implements EstrategiaDescuento {
    @Override
    public double aplicarDescuento(double precioBase) {
        return precioBase * 0.8; // 20% menos
    }
}

