package visitantes;

import java.lang.reflect.Method;

import visitados.Figura;

public interface FiguraVisitor {
	default <T extends Figura> void visit(T figura) {
        try {
            // Busca un método "visit" que acepte la clase concreta
            Method method = this.getClass().getMethod("visit", figura.getClass());
            method.invoke(this, figura);
        } catch (NoSuchMethodException e) {
            // Si no hay método específico, usa el por defecto
            defaultVisit(figura);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    default void defaultVisit(Figura figura) {
        System.out.println("Visitando figura genérica: " + figura.getClass().getSimpleName());
    }
    
}
