package datos;

public class Sectorventa extends Usuario {
	private int id_venta;
	private String pedido;
	public Sectorventa(String nombre, int contrase�a, int dni, int nivel, int id_venta, String pedido) {
		super(nombre, contrase�a, dni, nivel);
		this.id_venta = id_venta;
		this.pedido = pedido;
	}
	
	
}
