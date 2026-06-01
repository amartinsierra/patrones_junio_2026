package descuentos;

public enum Descuento {
	VIP(15),BLACKFRIDAY(10),PROMO(5),NINGUNO(0);
	int porcentaje;
	Descuento(int porcentaje){
		this.porcentaje=porcentaje;
	}
	public int getPorcentaje() {
		return porcentaje;
	}
	
}
