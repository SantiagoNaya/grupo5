package Negocio;
import UI.*;
import datos.Conexion;
public class Ventas {

	public static void main(String[] args) {
	Interfazventas interfazventas = new Interfazventas();
    interfazventas.login();
    Conexion c = new Conexion();
    c.conectar();

	} 

}
