package model;

public class Pedido {
    private String producto;
    private double precio;
    private boolean pagado = false;

    // Constructor
    public Pedido(String producto, double precio) {
		this.producto = producto;
		this.precio = precio;
	}

    public double getPrecio() {
    	return precio;
    }
    
    public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getProducto() {
		return producto;
	}

	public void setProducto(String producto) {
		this.producto = producto;
	}

	public boolean isPagado() {
		return pagado;
	}

	
	public void pagado(boolean estado) {
        pagado = estado;
        
    }

}

