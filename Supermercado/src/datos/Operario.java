package datos;

public class Operario extends Usuario  {
private int id_operario;

public int getId_operario() {
	return id_operario;
}

@Override
public String toString() {
	return "Operario [id_operario=" + id_operario + "]";
}

public void setId_operario(int id_operario) {
	this.id_operario = id_operario;
}

public Operario(String nombre, int password, int dni, int nivel, int id_operario) {
	super(nombre, password, dni, nivel);
	this.id_operario = id_operario;
}

}
