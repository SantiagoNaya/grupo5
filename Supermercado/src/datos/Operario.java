package datos;

public class Operario extends Usuario  {
private String id_operario;

public String getId_operario() {
	return id_operario;
}

@Override
public String toString() {
	return "Operario [id_operario=" + id_operario + "]";
}

public void setId_operario(String id_operario) {
	this.id_operario = id_operario;
}

public Operario(String nombre, String password, String dni, String nivel, String id_operario) {
	super(nombre, password, dni, nivel="1");
	this.id_operario = id_operario;
}

public Operario() {
	super();
}

}
