package datos;

public class Sucursal extends Usuario {
	private int id_sucursal;
	private String nombre_sucursal;
	private String pedido;
	public Sucursal(String nombre, int contrase�a, int dni, int nivel, int id_sucursal, String nombre_sucursal,
			String pedido) {
		super(nombre, contrase�a, dni, nivel);
		this.id_sucursal = id_sucursal;
		this.nombre_sucursal = nombre_sucursal;
		this.pedido = pedido;
	}
	
	
}
