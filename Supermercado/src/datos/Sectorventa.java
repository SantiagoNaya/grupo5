package datos;

public class Sectorventa extends Usuario {
	private int id_venta;
	private String pedido;
	public Sectorventa(String nombre, int contraseña, int dni, int nivel, int id_venta, String pedido) {
		super(nombre, contraseña, dni, nivel);
		this.id_venta = id_venta;
		this.pedido = pedido;
	}
	
	
}
