package datos;

public class Usuario  {
	private String nombre;
	private int contrase�a;
	private int dni;
	private int nivel;
	public Usuario(String nombre, int contrase�a, int dni, int nivel) {
		super();
		this.nombre = nombre;
		this.contrase�a = contrase�a;
		this.dni = dni;
		this.nivel = nivel;
	}
	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", contrase�a=" + contrase�a + ", dni=" + dni + ", nivel=" + nivel + "]";
	}
	
}
