package datos;

public class Usuario  {
	private String nombre;
	private int password;
	private int dni;
	private int nivel;
	public Usuario(String nombre, int password, int dni, int nivel) {
		super();
		this.nombre = nombre;
		this.password = password;
		this.dni = dni;
		this.nivel = nivel;
	}
	
	
	
	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public int getPassword() {
		return password;
	}



	public void setPassword(int password) {
		this.password = password;
	}



	public int getDni() {
		return dni;
	}



	public void setDni(int dni) {
		this.dni = dni;
	}



	public int getNivel() {
		return nivel;
	}



	public void setNivel(int nivel) {
		this.nivel = nivel;
	}



	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", password=" + password + ", dni=" + dni + ", nivel=" + nivel + "]";
	}



	
}
