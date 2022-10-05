package datos;

public class Operario extends Usuario  {
private int id_operario;

public Operario(String nombre, int contraseña, int dni, int nivel, int id_operario) {
	super(nombre, contraseña, dni, nivel);
	this.id_operario = id_operario;
}

}
