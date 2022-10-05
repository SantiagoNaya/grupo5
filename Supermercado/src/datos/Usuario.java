package datos;

public class Usuario  {
	private String nombre;
	private int contraseña;
	private int dni;
	private int nivel;
	public Usuario(String nombre, int contraseña, int dni, int nivel) {
		super();
		this.nombre = nombre;
		this.contraseña = contraseña;
		this.dni = dni;
		this.nivel = nivel;
	}
	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", contraseña=" + contraseña + ", dni=" + dni + ", nivel=" + nivel + "]";
	}
	
}
