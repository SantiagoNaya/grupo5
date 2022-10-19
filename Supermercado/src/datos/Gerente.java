package datos;

public class Gerente extends Usuario {
private int id_gerente;

@Override
public String toString() {
	return "Gerente [id_gerente=" + id_gerente + "]";
}

public int getId_gerente() {
	return id_gerente;
}

public void setId_gerente(int id_gerente) {
	this.id_gerente = id_gerente;
}

public Gerente(String nombre, String password, int dni, int nivel, int id_gerente) {
	super(nombre, password, dni, nivel=2);
	this.id_gerente = id_gerente;
}

public Gerente() {
	super();
}

}
