package datos;

public class Sectorventa extends Usuario {
	private int id_venta;
	
	
	
	public Sectorventa(String nombre, String password, int dni, int nivel, int id_venta) {
		super(nombre, password, dni, nivel);
		this.id_venta = id_venta;
		
	}
	
	
	public Sectorventa() {
		super();
	}


	public int getId_venta() {
		return id_venta;
	}
	public void setId_venta(int id_venta) {
		this.id_venta = id_venta;
	}
	
	
	@Override
	public String toString() {
		return "Sectorventa [id_venta=" + id_venta + ", pedido=" +  "]";
	}
	
	
}
