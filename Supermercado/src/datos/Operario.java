package datos;

public class Operario extends Usuario  {
private int id_operario;

public Operario(String nombre, int contraseņa, int dni, int nivel, int id_operario) {
	super(nombre, contraseņa, dni, nivel);
	this.id_operario = id_operario;
}

}
