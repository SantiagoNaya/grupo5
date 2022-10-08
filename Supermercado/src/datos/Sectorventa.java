package datos;

public class Sectorventa extends Usuario {
	private String id_venta;
	private String pedido;
	
	
	public Sectorventa(String nombre, String password, String dni, String nivel, String id_venta, String pedido) {
		super(nombre, password, dni, nivel);
		this.id_venta = id_venta;
		this.pedido = pedido;
	}
	
	
	public Sectorventa() {
		super();
	}


	public String getId_venta() {
		return id_venta;
	}
	public void setId_venta(String id_venta) {
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
