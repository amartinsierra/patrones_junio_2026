package builder;

import factory.FactoryRegistry;
import model.Usuario;

public class UsuarioBuilder {
    private String tipo;
    private String nombre;
    private String email;
    public UsuarioBuilder tipo(String tipo) {
        this.tipo = tipo;
        return this;
    }
    public UsuarioBuilder nombre(String nombre) {
        this.nombre = nombre;
        return this;
    }
    public UsuarioBuilder email(String email) {
        this.email = email;
        return this;
    }
    public Usuario build() {
        if (tipo == null) {
            throw new IllegalStateException("El tipo de usuario es obligatorio");
        }
        return FactoryRegistry.obtenerUsuario(tipo,nombre, email);
    }
}
