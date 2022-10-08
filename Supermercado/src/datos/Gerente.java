package datos;

public class Gerente extends Usuario {
private int id_gerente;

public Gerente(String nombre, int password, int dni, int nivel, int id_gerente) {
	super(nombre, password, dni, nivel);
	this.id_gerente = id_gerente;
}

}
