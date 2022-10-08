package datos;

public class Sectorventa extends Usuario {
	private int id_venta;
	private String pedido;
	
	
	public Sectorventa(String nombre, int password, int dni, int nivel, int id_venta, String pedido) {
		super(nombre, password, dni, nivel);
		this.id_venta = id_venta;
		this.pedido = pedido;
	}
	public int getId_venta() {
		return id_venta;
	}
	public void setId_venta(int id_venta) {
		this.id_venta = id_venta;
	}
	public String getPedido() {
		return pedido;
	}
	public void setPedido(String pedido) {
		this.pedido = pedido;
	}
	@Override
	public String toString() {
		return "Sectorventa [id_venta=" + id_venta + ", pedido=" + pedido + "]";
	}
	
	
}
