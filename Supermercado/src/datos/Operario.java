package datos;

public class Operario extends Usuario  {
private int id_operario;

public Operario(String nombre, int password, int dni, int nivel, int id_operario) {
	super(nombre, password, dni, nivel);
	this.id_operario = id_operario;
}

}
