package strategy;

public class DescuentoBlackFriday implements EstrategiaDescuento {
    @Override
    public double aplicarDescuento(double precioBase) {
        return precioBase * 0.5; // 50% menos
    }
}
