package datos;

public class Adminventas extends Usuario {
	private int id_adminventa;
	
	
	
	public Adminventas(String nombre, String password, String dni, int nivel, int id_adminventa) {
		super(nombre, password, dni, nivel);
		this.id_adminventa = id_adminventa;
		
	}
	
	
	public Adminventas() {
		super();
	}


	public int getId_adminventa() {
		return id_adminventa;
	}
	public void setId_adminventa(int id_adminventa) {
		this.id_adminventa = id_adminventa;
	}
	
	
	@Override
	public String toString() {
		return "Sectorventa [id_venta=" + id_adminventa + ", pedido=" +  "]";
	}
	
	
}
