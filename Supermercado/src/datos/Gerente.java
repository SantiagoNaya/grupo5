package datos;

public class Gerente extends Usuario {
private int id_gerente;

public Gerente(String nombre, int contraseņa, int dni, int nivel, int id_gerente) {
	super(nombre, contraseņa, dni, nivel);
	this.id_gerente = id_gerente;
}

}
