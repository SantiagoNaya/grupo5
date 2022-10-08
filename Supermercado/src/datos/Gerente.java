package datos;

public class Gerente extends Usuario {
private String id_gerente;

@Override
public String toString() {
	return "Gerente [id_gerente=" + id_gerente + "]";
}

public String getId_gerente() {
	return id_gerente;
}

public void setId_gerente(String id_gerente) {
	this.id_gerente = id_gerente;
}

public Gerente(String nombre, String password, String dni, String nivel, String id_gerente) {
	super(nombre, password, dni, nivel="2");
	this.id_gerente = id_gerente;
}

public Gerente() {
	super();
}

}
