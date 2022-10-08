package datos;

public class Sectorventa extends Usuario {
	private int id_venta;
	private String pedido;
	public Sectorventa(String nombre, int password, int dni, int nivel, int id_venta, String pedido) {
		super(nombre, password, dni, nivel);
		this.id_venta = id_venta;
		this.pedido = pedido;
	}
	
	
}
