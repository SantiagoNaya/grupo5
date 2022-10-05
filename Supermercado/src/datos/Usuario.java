package datos;

public class Usuario  {
	private String nombre;
	private int contraseņa;
	private int dni;
	private int nivel;
	public Usuario(String nombre, int contraseņa, int dni, int nivel) {
		super();
		this.nombre = nombre;
		this.contraseņa = contraseņa;
		this.dni = dni;
		this.nivel = nivel;
	}
	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", contraseņa=" + contraseņa + ", dni=" + dni + ", nivel=" + nivel + "]";
	}
	
}
